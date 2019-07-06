package cn.edu.hznu.jomornt.dao;

import cn.edu.hznu.jomornt.bean.Notify;
import cn.edu.hznu.jomornt.bean.NotifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NotifyMapper {
    long countByExample(NotifyExample example);

    int deleteByExample(NotifyExample example);

    int insert(Notify record);

    int insertSelective(Notify record);

    List<Notify> selectByExample(NotifyExample example);

    int updateByExampleSelective(@Param("record") Notify record, @Param("example") NotifyExample example);

    int updateByExample(@Param("record") Notify record, @Param("example") NotifyExample example);
}