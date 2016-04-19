/* 주제 : 각 클래스마다 값을 개별적으로 관리하기*/
package step07;

public class Exam04 {

  public static void main(String[] args) {
    //  2 * 3 + 6 - 7 = ?
    // 3 - 7 * 2 + 27 = ?

    //인스턴스 변수를 준비하기
    // => new 클래스이름();
    // 해당 클래스의 인스턴스 변수를 조사하여 그 메모리를 준비한다.
    // 그리고 그 메모리의 시작 주소를 리턴한다.
    // 그 메모리를 "인스턴스라고" 부른다.
    //
    // 인스턴스 주소를 저장할 변수 선언
    // => 클래스이름 변수명;
    // 이 변수는 인스턴스의 주소를 저장하기 때문에 레퍼런스 변수라 부른다.
    // 일반적으로 "변수"를 빼고 그냥 "레퍼런스"라 부른다.

    // 1) 레퍼런스 변수 준비
    Calculator3 calc1;
    Calculator3 calc2;

    // 2) 인스턴스( = 물건"object")를 준비
    //  => Calculator3 클래스에 인스턴스 변수가 있는지 조사한다.
    //  => 있다면 해당 변수에 대해 메모리를 준비한다.
    //  => 그 메모리의 주소를 리턴한다.
    calc1 = new Calculator3();
    calc2 = new Calculator3();
    Calculator3 calc3 = new Calculator3();

    Calculator3.plus(calc3, 2);
    Calculator3.minus(calc2,1);
    Calculator3.plus(calc1, 5);

    System.out.println(calc3.result);
    System.out.println(calc2.result);
    System.out.println(calc1.result);
  }
}
/* class 문법 사용 1
=> 관련 기능을 별도의 블록으로 분류한다.
=> 코드를 찾기 쉽다. 관리가 쉽다.
=> step06.Exam05에 있던 계산 관련 메서드를 분리하여
   step07.Calculator 클래스에 분류하였다.


*/
