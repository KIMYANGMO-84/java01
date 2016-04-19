// 다형적 변수를 사용할 때 제약 조건
package step15;

public class Test5 {
  public static void main(String[] args) {
    DeveloperCalculator c = new DeveloperCalculator();
    // 상위 클래스의 레퍼런스는 하위 클래스의 인스턴스를 가리킬 수 있다.
    CalculatorPlus c2 = new DeveloperCalculator();
    Calculator c3 = new DeveloperCalculator();
    Calculator c4 = new CalculatorPlus();

    c.init(10); // <-- Calculator의 메소드
    c.multiple(3); // <-- CalculatorPlus의 메소드
    c.printResult(); // <-- DeveloperCalculator의 메소드


    //왜 하위 클래스의 레퍼런스는 상위 클래스의 인스턴스를 가리킬 수 없는가?
    // 만약
    // DeveloperCalculator c5 = new CalculatorPlus(); 가능하다면?
    // c5.init(10); // <-- Calculator의 메소드 ok
    // c5.multiple(3); // <-- CalculatorPlus의 메소드 ok
    // c5.printResult(); // <-- DeveloperCalculator의 메소드
                         // 실행 할수 없다 CalculatorPlus에는 정의되지 않은 메서드


    /*
    c.printResult(2);
    c.printResult(8);
    c.printResult(16);
    c.printResult(10);
    */

    // DeveloperCalculator c5 = new CalculatorPlus();
    // DeveloperCalculator c6 = new Calculator();
    // CalculatorPlus c7 = new Calculator();
  }
}
