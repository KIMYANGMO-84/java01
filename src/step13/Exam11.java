// Final
package step13;

public class Exam11 {
  static final int a;
  static final int b = 33;
  // 보통 상수 값은 변수 이름을 대문자로 짓는다.
  static final int YEAR = 11;
  static {
    a = 20;
  }
  public static void main(String[] args) {
    //a = 20;
    // b = 20; // ok!

    System.out.println("a = " + a);
    System.out.println("b = " + b);

    // a = 30;
    // b = 30; // error

    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
}
  /* static 변수에 final 붙였을때 값을 할당하는 방법
  - 변수 선언과 동시에 값을 할당
  - static 블록에서 값을 할당
  */
