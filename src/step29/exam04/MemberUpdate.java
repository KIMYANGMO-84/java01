//주제 : 데이터 추가하기- insert문 보내기
package step29.exam04;

public class MemberUpdate {
  public static void main(String[] args) throws Exception {    
    try {
      MemberDao memberDao = new MemberDao(
          "com.mysql.jdbc.Driver",
          "jdbc:mysql://localhost:3306/java80db",
          "java80", "1111"
          );
      Member member = new Member();
      member.setNo(4);
      member.setName("우유");
      member.setEmail("milk@test.com");
      member.setPassword("흰우유");
      member.setTel("T.T");
      int count = memberDao.update(member);      
      
      System.out.printf("변경 개수 : %d" , count);      
      memberDao.destroy();
    } catch (Exception e) {
      System.out.println("변경 실패");
    }
  }
}
/*
 *  
 */
