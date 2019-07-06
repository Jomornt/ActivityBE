package cn.edu.hznu.jomornt.controller;
import cn.edu.hznu.jomornt.bean.Msg;
import cn.edu.hznu.jomornt.bean.PwdInfo;
import cn.edu.hznu.jomornt.bean.RegisterInfo;
import cn.edu.hznu.jomornt.bean.User;
import cn.edu.hznu.jomornt.service.UserService;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhenzi.sms.ZhenziSmsClient;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value="/sendSms")
    @ResponseBody
    public Msg sendSms(HttpServletRequest request,RegisterInfo registerInfo) throws Exception{
        JSONObject json = null;
        String verifyCode = String.valueOf(new Random().nextInt(899999)+ 100000);
        ZhenziSmsClient client = new ZhenziSmsClient(
                "https://sms_developer.zhenzikj.com","101713", "bf4c8743-42f6-41e5-8232-a69085474cb8"
        );
        String result = client.send(registerInfo.getPhonenum(),
                "您的验证码为:" + verifyCode + "，该码有效期为5分钟，该码只能使用一次！");
        json = JSONObject.parseObject(result);
        if(json.getIntValue("code") != 0)//发送短信失败
            return  Msg.fail("发送失败");
        //将验证码存到session中,同时存入创建时间
        //以json存放，这里使用的是阿里的fastjson
        HttpSession session = request.getSession(true);
        json.put("verifyCode", verifyCode);
        json.put("createTime", System.currentTimeMillis());
        System.out.println(json);
        // 将认证码存入SESSION
        session.setAttribute("verifyCode", json);
        return Msg.success("发送成功");
    }

    @RequestMapping("/register")
    @ResponseBody
    public Msg registerUser(HttpServletRequest request, RegisterInfo registerInfo) {
        HttpSession session = request.getSession(true);
        JSONObject json = (JSONObject)session.getAttribute("verifyCode");

        if(!json.getString("verifyCode").equals(registerInfo.getVerifycode())){
            return Msg.fail("验证码错误");
        }
        long time = System.currentTimeMillis() - json.getLong("createTime");
        if(time > 1000 * 60 * 5){
            return Msg.fail("验证码过期");
        }

        String hashed = BCrypt.hashpw(registerInfo.getPassword(), BCrypt.gensalt());
        User user = new User(registerInfo.getPhonenum(),hashed,registerInfo.getNickname());
        userService.addUser(user);
        return Msg.success("注册成功");
    }

    @RequestMapping("/login")
    @ResponseBody
    public Msg loginUser(HttpServletRequest request, User user) {
        int count = userService.login(user);
        if(count > 0) {
            HttpSession session = request.getSession(true);
            session.setAttribute("account", user.getAccount());
            System.out.println(session.getAttribute("account"));
            return Msg.success("登陆成功").add("user",user);
        }else
            return Msg.fail("用户名或密码错误");
    }

    @RequestMapping("/logout")
    @ResponseBody
    public Msg logout(HttpServletRequest request) {
        HttpSession session = request.getSession(true);
        session.invalidate();
        System.out.println(session.getAttribute("account"));
        return Msg.success("已注销");
    }

    @RequestMapping("/changepwd")
    @ResponseBody
    public Msg changePwd(PwdInfo pwdInfo) {
        System.out.println(pwdInfo.getAccount());
        int count = userService.login(new User(pwdInfo.getAccount(),pwdInfo.getOldPwd()));
        if (count > 0){
            String hashed = BCrypt.hashpw(pwdInfo.getNewPwd(), BCrypt.gensalt());
            userService.updateUser(new User(pwdInfo.getAccount(),hashed));
            return Msg.success("修改成功");
        }else {
            return Msg.fail("密码错误");
        }
    }

    @RequestMapping(value="/{account}",method = RequestMethod.GET)
    @ResponseBody
    public Msg getUser(@PathVariable("account") String account){
        List<User> userInfo = userService.getUser(account);
        return Msg.success("操作成功").add("userInfo",userInfo);
    }

    @RequestMapping(value="",method = RequestMethod.GET)
    @ResponseBody
    public Msg getTbl(@RequestParam(value = "pn", required = false) Integer pn){
        PageHelper.startPage(pn,8);//第几页，每页几条数据
        List<User> users = userService.getTbl();
        PageInfo pageInfo = new PageInfo(users,5);
        return Msg.success("操作成功").add("pageInfo",pageInfo);
    }

    @CrossOrigin
    @RequestMapping(value = "",method= RequestMethod.PUT)
    @ResponseBody
    public Msg updateUserAll(User user){
        userService.updateUserAll(user);
        return Msg.success("操作成功");
    }

    @CrossOrigin
    @RequestMapping(value = "/{account}",method= RequestMethod.DELETE)
    @ResponseBody
    public Msg deleteUser(@PathVariable("account") String account){
        userService.deleteUser(account);
        return Msg.success("删除成功");
    }

    @CrossOrigin
    @RequestMapping(value = "",method= RequestMethod.PATCH)
    @ResponseBody
    public Msg updateUser(User user){
        userService.updateUser(user);
        return Msg.success("修改成功");
    }
}

