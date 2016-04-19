//주제 : MemberDao의 활용
package step29.exam03;

import java.util.List;

public class MemberList {
  public static void main(String[] args) throws Exception {    
    try {
      MemberDao memberDao = new MemberDao();
      List<Member> list = memberDao.selectList();
      
      for (Member member : list) {
        System.out.printf("%d, %s, %s, %s, %s\n", member.getNo() , member.getName()
            , member.getEmail(), member.getPassword(), member.getTel());
      }
    } catch (Exception e) {
      System.out.println("데이터를 가져오는데 실패했습니다");
    }
  }
}
/*
 *  
 */
