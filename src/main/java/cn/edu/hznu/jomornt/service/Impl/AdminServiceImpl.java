package cn.edu.hznu.jomornt.service.Impl;

import cn.edu.hznu.jomornt.bean.Admin;
import cn.edu.hznu.jomornt.bean.AdminExample;
import cn.edu.hznu.jomornt.dao.AdminMapper;
import cn.edu.hznu.jomornt.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    public int login(Admin admin) {
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andAccountEqualTo(admin.getAccount());
        criteria.andPasswordEqualTo(admin.getPassword());
        return (int)adminMapper.countByExample(example);
    }

    public int updateAdmin(Admin admin) {
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andAccountEqualTo(admin.getAccount());
        return adminMapper.updateByExampleSelective(admin,example);
    }
}
