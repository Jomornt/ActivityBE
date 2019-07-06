package cn.edu.hznu.jomornt.controller;

import cn.edu.hznu.jomornt.bean.Activity;
import cn.edu.hznu.jomornt.bean.Msg;
import cn.edu.hznu.jomornt.service.ActivityService;
import cn.edu.hznu.jomornt.service.Impl.ActivityServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/activity")
public class ActivityController {
    @Autowired
    ActivityService activityService;

    @RequestMapping(value="/create")
    @ResponseBody
    public Msg CreateActivity(@RequestParam("image") MultipartFile image, HttpServletRequest request){
        System.out.println("hahaha");
        System.out.println(image.getName());
        String path = request.getSession().getServletContext().getRealPath("resources/upload");
        System.out.println(path);
        String filename = activityService.upload(image,path);
        return  Msg.success("操作成功").add("filename",filename);
    }

    @RequestMapping(value="",method = RequestMethod.GET)
    @ResponseBody
    public Msg getTbl(
            @RequestParam(value = "pn", required = false) Integer pn,
            @RequestParam(value = "num", required = false) Integer num,
            @RequestParam(value = "category", required = false, defaultValue="all") String category
    ){
        PageHelper.startPage(pn,num);//第几页，每页几条数据
        List<Activity> activities;
        if(category.equals("all")){
            activities = activityService.getTbl();
        } else {
            activities = activityService.getTblWithCategory(category);
        }
        PageInfo pageInfo = new PageInfo(activities,5);
        return Msg.success("操作成功").add("pageInfo",pageInfo);
    }

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Msg getActivity(@PathVariable("id") String id){
        List<Activity> activityInfo = activityService.getActivity(id);
        return Msg.success("操作成功").add("activityInfo",activityInfo);
    }

    @CrossOrigin
    @RequestMapping(value = "/{id}",method= RequestMethod.DELETE)
    @ResponseBody
    public Msg deleteActivity(@PathVariable("id") String id){
        activityService.deleteActivit(id);
        return Msg.success("删除成功");
    }

    @CrossOrigin
    @RequestMapping(value = "",method= RequestMethod.POST)
    @ResponseBody
    public Msg addAct(Activity activity){
        System.out.println(activity.getContent());
        String str = UUID.randomUUID().toString().substring(0,8);
        activity.setId(str);
        int b = activityService.addAct(activity);
        return Msg.success("操作成功").add("actid",str);
    }

    @CrossOrigin
    @RequestMapping(value = "",method= RequestMethod.PUT)
    @ResponseBody
    public Msg updateActAll(Activity activity){
        activityService.updateActAll(activity);
        return Msg.success("操作成功");
    }

    @CrossOrigin
    @RequestMapping(value = "",method= RequestMethod.PATCH)
    @ResponseBody
    public Msg updateAct(Activity activity){
        System.out.println(activity.getId());
        activityService.updateAct(activity);
        return Msg.success("操作成功");
    }

    @RequestMapping(value="/search",method = RequestMethod.GET)
    @ResponseBody
    public Msg searchActivity(@RequestParam(value = "keyword", required = false) String keyword){
        List<Activity> activityInfo = activityService.getSearch(keyword);
        return Msg.success("操作成功").add("activityInfo",activityInfo);
    }

}
