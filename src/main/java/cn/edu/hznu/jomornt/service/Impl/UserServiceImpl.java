package cn.edu.hznu.jomornt.service.Impl;

import cn.edu.hznu.jomornt.bean.User;
import cn.edu.hznu.jomornt.bean.UserExample;
import cn.edu.hznu.jomornt.dao.UserMapper;
import cn.edu.hznu.jomornt.service.UserService;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;


    public List<User> getTbl() {
        return userMapper.selectByExample(null);
    }

    public List getUser(String account) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andAccountEqualTo(account);
        List userInfo = userMapper.selectByExample(example);
        return  userInfo;
    }

    public int updateUserAll(User user) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andAccountEqualTo(user.getAccount());
        return userMapper.updateByExample(user,example);
    }

    public int updateUser(User user) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andAccountEqualTo(user.getAccount());
        return userMapper.updateByExampleSelective(user,example);
    }

    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }

    public int login(User user) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andAccountEqualTo(user.getAccount());
        //判断用户是否存在0用户不存在，>0用户存在
        int userExist = (int)userMapper.countByExample(example);
        //判断密码是不是相等
        List<User> checkUserList = userMapper.selectByExample(example);
        String checkPwd="";
        for(User checkUser : checkUserList){
            System.out.print(checkUser.getPassword());
            checkPwd = checkUser.getPassword();
        }
        boolean pwdflag = BCrypt.checkpw(user.getPassword(), checkPwd);
        System.out.println(pwdflag);
        if(userExist > 0 && pwdflag == true)
            return 1;
        else
            return 0;
    }

    public void deleteUser(String account) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andAccountEqualTo(account);
        userMapper.deleteByExample(example);
    }
}
