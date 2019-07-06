package cn.edu.hznu.jomornt.service.Impl;

import cn.edu.hznu.jomornt.bean.JoinSM;
import cn.edu.hznu.jomornt.dao.JoinSMMapper;
import cn.edu.hznu.jomornt.service.JoinSMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JoinSMServiceImpl implements JoinSMService {
    @Autowired
    JoinSMMapper joinSMMapper;

    public List<JoinSM> getTbl() {
        return joinSMMapper.selectByExample(null);
    }
}
