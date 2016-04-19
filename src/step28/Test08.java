//주제 : 질의하기 - SELECT 문 보내기
package step28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test08 {
  
  public static void main(String[] args) throws Exception {    
    Connection con = null;
    Statement stmt = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/java80db",/* JDBC URL*/
          "java80", /*DBMS 사용자 아이디*/
          "1111"); /*DBMS 사용자 암호*/
      System.out.println("연결 성공");
      stmt = con.createStatement();
      System.out.println("질의 객체 준비 완료!");
    } finally {
      //자원을 해제할 때는 역순으로 해제해야 한다.
      //close()를 각각 try로 묶어야함
      try {stmt.close();} catch (Exception e) {}
      try {con.close(); } catch (Exception e) {}
    }
  }
}
/*
 *  
 */
