package cn.edu.hznu.jomornt.service;

import cn.edu.hznu.jomornt.bean.Notify;

import java.util.List;

public interface NotifyService {
    List<Notify> getTbl();
    int addNotify(Notify notify);
}
