// 날짜 데이터를 다루는 클래스
package step13;

import java.util.Calendar;

public class Exam05 {
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance(); // <-- 싱글톤 설계 패턴.
/*
    // Calendar 옵션 값 알아내기
    System.out.println("년도 옵션값 : " + Calendar.YEAR);
    System.out.println("월 옵션 : " + Calendar.MONTH);
    System.out.println("일 옵션 : " + Calendar.DATE);
    System.out.println("시간 옵션값 : " + Calendar.HOUR);
    System.out.println("분 옵션값 : " + Calendar.MINUTE);
    System.out.println("초 옵션값 : " + Calendar.SECOND);
    System.out.println("요일 옵션값 : " + Calendar.DAY_OF_WEEK);
*/
/*
    System.out.println(cal.get(1) + "년");
    System.out.println((cal.get(2)+1) + "월"); //==> 0부터 시작 11까지
    System.out.println(cal.get(5) + "일");
    System.out.println(cal.get(10) + "시");
    System.out.println(cal.get(12) + "분");
    System.out.println(cal.get(13) + "초");
    System.out.println(cal.get(7) + " 요일"); 1 == 일요일
*/  // get()의 아규먼트 값을 직접 숫자로 지정하기 보다는
    // 미리 정의된 스태틱 상수 변수를 사용하는 것이
    // 코드를 읽고 쓸 때 편하다.
    System.out.println(cal.get(Calendar.YEAR) + "년");
    System.out.println(cal.get(Calendar.MONTH)+1 + "월");
    System.out.println(cal.get(Calendar.DATE) + "일");
    System.out.println(cal.get(Calendar.HOUR) + "시");
    System.out.println(cal.get(Calendar.MINUTE) + "분");
    System.out.println(cal.get(Calendar.SECOND) + "초");
    System.out.println(cal.get(Calendar.DAY_OF_WEEK) + "요일");
  }
}
  /*
  */
