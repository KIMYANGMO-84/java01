// 날짜 데이터를 다루는 클래스
package step13;

import java.sql.Date;

public class Exam04 {
  public static void main(String[] args) {
    long currTime = System.currentTimeMillis();
    Date today = new Date(currTime); // 인스턴스에는 오늘 날짜와 시간이 들어있다.

    // println(레퍼런스)
    // => println()은 레퍼런스에 대해 toString()을 실행한 후 그 리턴값을 출력한다.
    System.out.println(currTime);
    System.out.println(today); // yyyy-MM-dd

    // java.sql.date를 주로 사용하는경우
    // "yyyy-MM-dd" --> date 인스턴스로 만들어줌

    Date date = Date.valueOf("2016-3-7");
    System.out.println(date); // yyyy-MM-dd
  }
}
  /*
  */
