// Final
package step13;

public class Exam09 {
  public static void main(String[] args) {
    int a;
    final int b;

    a = 20;
    b = 20; // ok!

    System.out.println("a = " + a);
    System.out.println("b = " + b);

    a = 30;
    // b = 30; // error

    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
}
  /* 로컬 변수에 final 붙임
  - 한 번 만 할당할 수 있다.
  

  */
