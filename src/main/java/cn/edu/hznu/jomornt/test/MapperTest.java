//package cn.edu.hznu.jomornt.test;
//
//import org.apache.ibatis.session.SqlSession;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
//public class MapperTest {
//    @Autowired
//    UserMapper userMapper;
//    @Autowired
//    SqlSession sqlSession;
//
//    @Test
//    public void textCRUD(){
//        System.out.println(userMapper);
//        //选择性插入
//        userMapper.insertSelective(new User("2016","123","hjk","intro","男","19980802","null","1",10));
//        System.out.println("成功插入！");
//    }
//
//}
