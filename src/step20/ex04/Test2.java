// 같은 멤버인
package step20.ex04;


public class Test2 { //top level inner class 테스트
  public static void main(String[] args) {
    Outer2 p = new Outer2();
    Outer2.Inner p2 = p.new Inner();
    p2.test2();

  }
}
/*
*/
