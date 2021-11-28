package top.xywait;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import top.xywait.doMain.Users;

import java.io.IOException;
import java.io.InputStream;

public class MyTest {

    @Test
    public void testSelectUserById() throws IOException {
        // mybatis主配置文件
        String resources = "mybatis.xml";
        // 读取主配置文件
        InputStream inputStream = Resources.getResourceAsStream(resources);
        // 创建SqlSessionFactory对象， 通过SqlSessionFactoryBuilder
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 从 SqlSessionFactory 中获取 SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        Users users = sqlSession.selectOne("top.xywait.dao.UsersDao.selectUserById");

        System.out.println(users);

        sqlSession.close();
    }
}
