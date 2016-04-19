/* 주제 : 오버로딩을 잘못한 예*/

package step11;

public class Exam04 {
  static int plus(int a, int b) {
    return a + b;
  }
  // 변수 명만 다른경우
  /*static int plus(int c, int d) {
    return a + b;
  }*/
  // 리턴 타입만 다른 경우
  /*static float plus(int a, int b) {
    return a + b;
  }*/

  static float plus(byte a, byte b) {
    return a + b;
  }
  public static void main(String[] args) {
    byte b1, b2;
    b1 = 10;
    b2 = 20;
    System.out.println(plus(3, 1));
    System.out.println(plus(b1, b2));
  }
}
/*
*/
