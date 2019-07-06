package cn.edu.hznu.jomornt.service.Impl;

import cn.edu.hznu.jomornt.bean.Feedback;
import cn.edu.hznu.jomornt.dao.FeedbackMapper;
import cn.edu.hznu.jomornt.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {
    @Autowired
    FeedbackMapper feedbackMapper;
    public List<Feedback> getTbl() {
        return feedbackMapper.selectByExample(null);
    }
}
