/* 주제 : 클래스 공용 변수 사용*/
package step07;

public class Exam02 {

  public static void main(String[] args) {
      // 2) 클래스 공용 변수 사용후
    Calculator2.result = 0;
    Calculator2.plus(2);
    Calculator2.multiple(3);
    Calculator2.plus(6);
    Calculator2.minus(7);
    System.out.println(Calculator2.result);

  }
}
/* class 문법 사용 1
=> 관련 기능을 별도의 블록으로 분류한다.
=> 코드를 찾기 쉽다. 관리가 쉽다.
=> step06.Exam05에 있던 계산 관련 메서드를 분리하여
   step07.Calculator 클래스에 분류하였다.


*/
