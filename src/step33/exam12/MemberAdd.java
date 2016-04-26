// 주제 : SQL맵퍼인 Mybatis적용하기 - memberDao에 적용 - insert
package step33.exam12;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberAdd {
  public static void main(String[] args) throws Exception{    
    ApplicationContext context =
        new ClassPathXmlApplicationContext("step33/exam12/Application-context.xml");
    MemberDao memberDao = (MemberDao)context.getBean("memberDao");
    
    Member member = new Member();
    member.setName("백다방");
    member.setEmail("back@test.com");
    member.setPassword("11111");
    member.setTel("010-7241-1133");
    
    memberDao.insert(member);
    
    List<Member> list = memberDao.selectList();       
    for (Member m : list) {
      System.out.printf("%d,%s,%s,%s,%s\n",
          m.getNo(), m.getName(), m.getEmail(), m.getPassword(), m.getTel());
    }    
  }
}
/* 
 * 
 */