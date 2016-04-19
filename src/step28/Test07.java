//주제 : JDBC드라이버 로딩하는 다른 방법
package step28;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test07 {
  public static void main(String[] args) throws Exception {    
    //방법 1) 직접 java.sql.Driver 구현체의 인스턴스를 생성하여 등록하기
    //DriverManager.registerDriver(new Driver());
    
    //방법 2) java.sql.Driver 클래스를 로딩하기
    Class.forName("com.mysql.jdbc.Driver");
    
    //방법 3) java.sql.Driver 구현체의 인스턴스 만들기
    //Class.forName("com.mysql.jdbc.Driver").newInstance();
    
    try (
        Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/java80db",/* JDBC URL*/
          "java80", /*DBMS 사용자 아이디*/
          "1111") /*DBMS 사용자 암호*/
        ) {
      System.out.println("연결 성공");
    } 
  }
}
/*
 *  
 */
