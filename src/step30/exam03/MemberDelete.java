// 주제 : SQL맵퍼인 Mybatis적용하기 - memberDao에 적용 - insert
package step30.exam03;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MemberDelete {
  public static void main(String[] args) throws Exception{    

    InputStream inputStream = 
        Resources.getResourceAsStream("step30/exam03/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = 
        new SqlSessionFactoryBuilder().build(inputStream);
        
    SqlSession sqlSession = sqlSessionFactory.openSession();    
    
    MemberDao memberDao = new MemberDao();
      memberDao.setSqlSessionFactory(sqlSessionFactory);
    
    memberDao.delete(16);
    System.out.println("삭제 성공");
    
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