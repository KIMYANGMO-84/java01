// 주제 : SQL맵퍼인 Mybatis적용하기 - memberDao에 적용 - insert
package step30.exam02;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MemberUpdate {
  public static void main(String[] args) throws Exception{    

    InputStream inputStream = 
        Resources.getResourceAsStream("step30/exam02/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = 
        new SqlSessionFactoryBuilder().build(inputStream);
        
    SqlSession sqlSession = sqlSessionFactory.openSession();    
    
    MemberDao memberDao = new MemberDao();
      memberDao.setSqlSessionFactory(sqlSessionFactory);
    
    Member member = new Member();
    member.setName("커피우유");
    member.setEmail("coffieMilk@test.com");    
    member.setTel("1588-1539");
    member.setNo(14);
    memberDao.update(member);
    System.out.println("변경 성공");
    
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