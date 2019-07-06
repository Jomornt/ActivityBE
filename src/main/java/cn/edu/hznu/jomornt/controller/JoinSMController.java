package cn.edu.hznu.jomornt.controller;

import cn.edu.hznu.jomornt.bean.JoinSM;
import cn.edu.hznu.jomornt.bean.Msg;
import cn.edu.hznu.jomornt.service.Impl.JoinSMServiceImpl;
import cn.edu.hznu.jomornt.service.JoinSMService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/joinsm")
public class JoinSMController {
    @Autowired
    JoinSMService joinSMService;

    @RequestMapping(value="",method = RequestMethod.GET)
    @ResponseBody
    public Msg getTbl(@RequestParam(value = "pn", required = false) Integer pn){
        PageHelper.startPage(pn,9);//第几页，每页几条数据
        List<JoinSM> joinSMList = joinSMService.getTbl();
        PageInfo pageInfo = new PageInfo(joinSMList,5);
        return Msg.success("操作成功").add("pageInfo",pageInfo);
    }

}
