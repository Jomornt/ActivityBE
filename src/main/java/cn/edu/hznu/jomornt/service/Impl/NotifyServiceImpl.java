package cn.edu.hznu.jomornt.service.Impl;

import cn.edu.hznu.jomornt.bean.Notify;
import cn.edu.hznu.jomornt.dao.NotifyMapper;
import cn.edu.hznu.jomornt.service.NotifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotifyServiceImpl implements NotifyService {
    @Autowired
    NotifyMapper notifyMapper;
    public List<Notify> getTbl() {
        return notifyMapper.selectByExample(null);
    }

    public int addNotify(Notify notify) {
        return notifyMapper.insertSelective(notify);
    }
}
