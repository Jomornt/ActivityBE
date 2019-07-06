package cn.edu.hznu.jomornt.service;

import cn.edu.hznu.jomornt.bean.User;

import java.util.List;

public interface UserService {
    List<User> getTbl();
    List getUser(String account);
    int updateUserAll(User user);
    int updateUser(User user);
    int addUser(User user);
    int login(User user);
    void deleteUser(String account);
}
