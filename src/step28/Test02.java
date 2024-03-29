//주제 : 예외 처리와 연결 해제1 - 연결 해제를 자동으로 하기 전
package step28;

import java.sql.DriverManager;
import java.sql.Connection;

import com.mysql.jdbc.Driver;

public class Test02 {
  public static void main(String[] args) throws Exception {
    DriverManager.registerDriver(new Driver());
    

    Connection con = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/java80db?user=java80&password=1111");

    System.out.println("연결 성공");
    // 다음 문장은 0 나누기 예외를 발생시킨다.
    // => 예외가 발생되면 즉시 실행을 멈추고 상위 호출자에게 보고한다.
    // => 커넥션 객체를 닫지 못하는 문제 발생!
    System.out.printf("5 / 0 = %d ", (5 / 0));
    System.out.println("맑은 날씨 입니다."); // <-- 실행 안됨
    con.close(); // <-- 실행 안됨
  }
}
/*
 *  
 */
