package cn.edu.hznu.jomornt.controller;

import cn.edu.hznu.jomornt.bean.Admin;
import cn.edu.hznu.jomornt.bean.Msg;
import cn.edu.hznu.jomornt.bean.PwdInfo;
import cn.edu.hznu.jomornt.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    @RequestMapping("/login")
    @ResponseBody
    public Msg loginUser(HttpServletRequest request, Admin admin) {
        int count = adminService.login(admin);
        if(count > 0) {
            HttpSession session = request.getSession(true);
            session.setAttribute("account", admin.getAccount());
            return Msg.success("登陆成功").add("admin",admin);
        }else
            return Msg.fail("用户名或密码错误");
    }
    @RequestMapping("/changepwd")
    @ResponseBody
    public Msg changePwd(PwdInfo pwdInfo) {
        int count = adminService.login(new Admin(pwdInfo.getAccount(),pwdInfo.getOldPwd()));
        if (count > 0){
            int b = adminService.updateAdmin(new Admin(pwdInfo.getAccount(),pwdInfo.getNewPwd()));
            return Msg.success("修改成功");
        }else {
            return Msg.fail("密码错误");
        }
    }
}
