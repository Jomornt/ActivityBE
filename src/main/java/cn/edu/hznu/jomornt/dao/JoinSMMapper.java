package cn.edu.hznu.jomornt.dao;

import cn.edu.hznu.jomornt.bean.JoinSM;
import cn.edu.hznu.jomornt.bean.JoinSMExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JoinSMMapper {
    long countByExample(JoinSMExample example);

    int deleteByExample(JoinSMExample example);

    int insert(JoinSM record);

    int insertSelective(JoinSM record);

    List<JoinSM> selectByExample(JoinSMExample example);

    int updateByExampleSelective(@Param("record") JoinSM record, @Param("example") JoinSMExample example);

    int updateByExample(@Param("record") JoinSM record, @Param("example") JoinSMExample example);
}