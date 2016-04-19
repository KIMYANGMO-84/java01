/* 주제 : 클래스 변수의 한계*/
package step07;

public class Exam03 {

  public static void main(String[] args) {
    //  2 * 3 + 6 - 7 = ?
    // 3 - 7 * 2 + 27 = ?
    Calculator2.result = 0;
    Calculator2.plus(2);
    Calculator2.multiple(3);
    Calculator2.plus(6);
    Calculator2.minus(7);
    System.out.println(Calculator2.result);
    Calculator2.result = 0;
    Calculator2.plus(3);
    Calculator2.minus(7);
    Calculator2.multiple(2);
    Calculator2.plus(27);
    System.out.println(Calculator2.result);

    //해결책
    // = > 중간 계산 결과를 개별적으로 관리하면 된다.

  }
}
/* class 문법 사용 1
=> 관련 기능을 별도의 블록으로 분류한다.
=> 코드를 찾기 쉽다. 관리가 쉽다.
=> step06.Exam05에 있던 계산 관련 메서드를 분리하여
   step07.Calculator 클래스에 분류하였다.


*/
