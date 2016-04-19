//주제 : 데이터 추가하기- insert문 보내기
package step29.exam02;

public class MemberUpdate {
  public static void main(String[] args) throws Exception {    
    try {
      MemberDao memberDao = new MemberDao();
      Member member = new Member();
      member.setNo(5);
      member.setName("우유");
      member.setEmail("milk@test.com");
      member.setPassword("흰우유");
      member.setTel("T.T");
      int count = memberDao.update(member);      
      
      System.out.printf("변경 개수 : %d" , count);      
      
    } catch (Exception e) {
      System.out.println("변경 실패");
    }
  }
}
/*
 *  
 */
