// Final
package step13;

public class Exam10 {
  static final int a = 20;
  public static void main(String[] args) {
    //a = 20;
    // b = 20; // ok!

    System.out.println("a = " + a);
    // System.out.println("b = " + b);

    // a = 30;
    // b = 30; // error

    System.out.println("a = " + a);
    // System.out.println("b = " + b);
  }
}
  /* static 변수에 final 붙임
  - 클래스가 로딩되면 스태틱 메모리가 준비되며, 이 때 static 변수는 초기화 된다.
  - 초기화 되었기 때문에 (0으로 값이 할당 됨) main에서 static 값을 할당 할 수 없다
  */
