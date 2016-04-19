//주제 : 데이터 변경하기- update문 보내기
package step29.exam02;

public class MemberAdd {
  public static void main(String[] args) throws Exception {   
    try {
      Member member = new Member();
      member.setName("세종대왕");
      member.setEmail("seo@test.com");
      member.setPassword("11111");
      member.setTel("1112-13123");
      MemberDao memberDao = new MemberDao();
      
      int count = memberDao.insert(member);
      
      System.out.printf("입력 개수 : %d\n", count);
      
      
    } catch (Exception e) {
      System.out.println("입력 실패입니다");      
    }
  }
}
/*
 *  
 */
