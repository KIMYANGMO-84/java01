/* 주제 : class 문법을 이용하여 여러개의 메서드를 묶기*/
package step07;

public class Exam01 {

  public static void main(String[] args) {
    // 별도의 클래스로 분류된 메서드를 사용하는 방법
    // =>분류명.메서드명();
    //   즉, 클래스명.메서드명();
    //   메서드 앞에다가 어떤 클래스에 소속인지 클래스 이름을 붙인다.
    System.out.println(Calculator.plus(10, 20));
    System.out.println(Calculator.minus(10, 20));
    System.out.println(Calculator.multiple(10, 5));
    System.out.println(Calculator.divide(10, 2));

    // Calculator 클래스와 같이 관련기능을 하나로 묶어놓은 클래스는?
    // java.lang.Math
  }
}
/* class 문법 사용 1
=> 관련 기능을 별도의 블록으로 분류한다.
=> 코드를 찾기 쉽다. 관리가 쉽다.
=> step06.Exam05에 있던 계산 관련 메서드를 분리하여
   step07.Calculator 클래스에 분류하였다.


*/
