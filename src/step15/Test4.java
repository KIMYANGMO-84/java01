// 다형적 변수
package step15;

public class Test4 {
  public static void main(String[] args) {
    DeveloperCalculator c = new DeveloperCalculator();
    // 상위 클래스의 레퍼런스는 하위 클래스의 인스턴스를 가리킬 수 있다.
    CalculatorPlus c2 = new DeveloperCalculator();
    Calculator c3 = new DeveloperCalculator();
    Calculator c4 = new CalculatorPlus();

    c.init(10);
    c.plus(5);
    c.multiple(3);
    c.printResult();

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
/* 다형성 - 다형적 변수(polymorphic variables)
=> 레퍼런스 변수에 다양한 클래스의 인스턴스 주소를 저장할 수 있다.
=> 규칙
   상위 클래스의 레퍼런스는 하위 클래스의 인스턴스 주소를 저장할 수 있다.

*/
