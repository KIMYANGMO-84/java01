/* 주제 : 메서드에 인스턴스 주소를 쉽게 전달하기*/
package step07;

public class Exam05 {

  public static void main(String[] args) {
    //  2 * 3 + 6 - 7 = ?
    // 3 - 7 * 2 + 27 = ?

    // 1) 레퍼런스 변수 및 인스턴스( = 물건"object")를 준비
    Calculator4 calc1 = new Calculator4();
    Calculator4 calc2 = new Calculator4();

    // 인스턴스의 주소를 파라미터가 아닌 메서드 이름 앞에 기술한다.
    //  => 그 메서드가 어떤 인스턴스에 대해 작업을 수행하는지 직관적으로 알 수 있다.
    calc1.plus(2);
    calc2.plus(3);

    calc1.multiple(3);
    calc2.minus(7);

    calc1.plus(6);
    calc2.multiple(2);

    calc1.minus(7);
    calc2.plus(27);

    System.out.println(calc1.result);
    System.out.println(calc2.result);
  }
}
/* class 문법 사용 1
=> 관련 기능을 별도의 블록으로 분류한다.
=> 코드를 찾기 쉽다. 관리가 쉽다.
=> step06.Exam05에 있던 계산 관련 메서드를 분리하여
   step07.Calculator 클래스에 분류하였다.


*/
