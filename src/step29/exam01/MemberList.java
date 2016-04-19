//주제 : 질의객체(SQL문을 서버에 보낼 객체) 준비하기
package step29.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MemberList {
  public static void main(String[] args) throws Exception {    
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/java80db",/* JDBC URL*/
          "java80", /*DBMS 사용자 아이디*/
          "1111"); /*DBMS 사용자 암호*/
      System.out.println("연결 성공");
      stmt = con.createStatement();
      System.out.println("질의 객체 준비 완료!");
      
      //서버에 SQL문을 보내기
      // => select결과를 리턴하는 것이 아니다.
      // => 서버로부터 결과를 가져올 때 사용할 도구를 리턴한다.
      rs = stmt.executeQuery("select * from MEMBERS");
      
      //서버에서 한 개의 결과를 가져오기
      //rs도구에 next명령으로 결과를 가져올수있다
      while (rs.next()) { //서버에서 결과를 가져왔다면 true
        System.out.printf("%d, %s, %s, %s\n",
          rs.getInt("MNO"), rs.getString("MNAME"),
          rs.getString("EMAIL"),  rs.getString("PWD"));       
      }
      
    } finally {
      //자원을 해제할 때는 역순으로 해제해야 한다.
      //close()를 각각 try로 묶어야함
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      try {con.close(); } catch (Exception e) {}
    }
  }
}
/*
 *  
 */
