/* 주제 : String 주요 도구 사용법6 */
package step03;

public class Exam12 {
    public static void main(String[] args){
      String str = "This is BITCamp.";
      String str1 = "            This is BITCamp.                 ";
      String s1 = str.toLowerCase(); // 모든 문자를 소문자로 바꾼 String 생성
      String s2 = str.toUpperCase(); // 모든 문자를 대문자로 바꾼 String 생성
      String s3 = str1.trim(); // 문자열 앞, 뒤의 공백을 제거한 String 생성

      System.out.println(str + "@");
      System.out.println(s1 + "@");
      System.out.println(s2 + "@");
      System.out.println(s3 + "@");

      // primitive type의 값을 가지고 String 물건 생성하기
      int i = 10;
      float f = 3.1459f;
      boolean b = true;
      char c = '가';

      String s4 = String.valueOf(i); // static method => 클래스를 이용하여 동작시킴
      String s5 = String.valueOf(f);
      String s6 = String.valueOf(b);
      String s7 = String.valueOf(c);

      System.out.printf("%s %s %s %s\n", s4, s5, s6, s7);

  }
}

/*

*/
