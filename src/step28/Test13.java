//주제 : Statement사용시 문제점
package step28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test13 {
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
      
      stmt = con.createStatement();
      
      //1) 사용자가 값을 입력할 때 SQL 실행에 영향을 미치는 코드를 삽입할 경우,

      String str = "1 or MNO > 0";
      
      //2) Statement에서 SQL문을 서버에 보낼 때 문자열로 표현한다.
      // => 즉 다음과 같이 사용자가 입력한 값을 SQL문을 만들때 뭍인다.
      // => 사용자가 입력 값에 넣은 SQL코드도 함께 삽입될 수 있다.
      rs = stmt.executeQuery("select * from MEMBERS where MNO=" + str);
      
      //3) 무방비로 데이터가 노출되거나 변경될 수 있다.
      while (rs.next()) {
        System.out.printf("%d, %s, %s, %s, %s\n", rs.getInt("MNO"),
            rs.getString("MNAME"), rs.getString("EMAIL"), 
            rs.getString("PWD"), rs.getString("TEL"));
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
