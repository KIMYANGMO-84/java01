// 주제 : SQL맵퍼인 Mybatis적용하기 - memberDao에 적용 - insert
package step30.exam02;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MemberAdd {
  public static void main(String[] args) throws Exception{    

    InputStream inputStream = 
        Resources.getResourceAsStream("step30/exam02/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = 
        new SqlSessionFactoryBuilder().build(inputStream);
        
    SqlSession sqlSession = sqlSessionFactory.openSession();    
    
    MemberDao memberDao = new MemberDao();
      memberDao.setSqlSessionFactory(sqlSessionFactory);
    
    Member member = new Member();
    member.setName("세종대왕");
    member.setEmail("seo@test.com");
    member.setPassword("11111");
    member.setTel("010-7241-1133");
    
    memberDao.insert(member);
    
    List<Member> list = memberDao.selectList();       
    for (Member m : list) {
      System.out.printf("%d,%s,%s,%s,%s\n",
          m.getNo(), m.getName(), m.getEmail(), m.getPassword(), m.getTel());
    }
    sqlSession.close();
  }

}
/* 
 * 
 */