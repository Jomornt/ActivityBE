package cn.edu.hznu.jomornt.controller;

import cn.edu.hznu.jomornt.bean.Msg;
import cn.edu.hznu.jomornt.bean.Notify;
import cn.edu.hznu.jomornt.service.Impl.NotifyServiceImpl;
import cn.edu.hznu.jomornt.service.NotifyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/notify")
public class NotifyController {
    @Autowired
    NotifyService notifyService;

    @RequestMapping(value="",method = RequestMethod.GET)
    @ResponseBody
    public Msg getTbl(@RequestParam(value = "pn", required = false) Integer pn){
        PageHelper.startPage(pn,6);//第几页，每页几条数据
        List<Notify> notifies = notifyService.getTbl();
        PageInfo pageInfo = new PageInfo(notifies,5);
        return Msg.success("操作成功").add("pageInfo",pageInfo);
    }

    @RequestMapping(value="",method = RequestMethod.POST)
    @ResponseBody
    public Msg addNotify(Notify notify){
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        notify.setCreatetime(dateFormat.format(date));
        notifyService.addNotify(notify);
        return Msg.success("发送成功");
    }
}
