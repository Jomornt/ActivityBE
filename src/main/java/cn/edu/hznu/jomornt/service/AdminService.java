package cn.edu.hznu.jomornt.service;

import cn.edu.hznu.jomornt.bean.Admin;

public interface AdminService {
    int login(Admin admin);
    int updateAdmin(Admin admin);
}
