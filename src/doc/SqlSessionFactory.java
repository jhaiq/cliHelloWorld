package com;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class FKSqlSessionFactory {
    private static SqlSessionFactory sqlSessionFactory = null;
    static{
        InputStream input;
        try {
            input = Resources.getResourceAsStream("conf.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }

    public static SqlSessionFactory getSqlSessionFactory(){
        return sqlSessionFactory;
    }
}

package com;

        import java.util.ArrayList;
        import java.util.List;

        import org.apache.ibatis.session.SqlSession;
        import org.apache.ibatis.session.SqlSessionFactory;

public class Test1 {

    public static void main(String[] args) {
        SqlSessionFactory factory= FKSqlSessionFactory.getSqlSessionFactory();
        SqlSession session = factory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);//获取映射器实例

        User user = new User();
        user.setName("zhujunwen");
        user.setSex("m");

        mapper.insertT(user);	//调用映射器中的insertT（）方法进行数据库插入

        session.commit();
        session.close();
    }
}
