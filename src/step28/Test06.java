//주제 : 다양한 예외 확인
package step28;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

public class Test06 {
  public static void main(String[] args) throws Exception {    
    DriverManager.registerDriver(new Driver());
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
/* # 오타 등의 이유로 JDBC URL 형식이 잘못 되었을때
 * - No suitable driver found
 * # 해당 IP를 가진 컴퓨터가 실행중이지 않을 때
 * # 포트번호가 다를 때
 * # MySQL서버가 멈췄을 때
 * - Communications link failure 
 * - The driver has not received any packets from the server.
 * 
 * # 존재하지 않는 DBMS를 가리킬 때
 * # 아이디 또는 암호가 틀렸을 때
 * - Access denied for 
 */
