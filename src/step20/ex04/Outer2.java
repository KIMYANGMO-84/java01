//
package step20.ex04;

public class Outer2 { // top level inner class선언
  static void m() { // 스태틱 멤버에서 접근하기

  }
  void m2() { //인스턴스 멤버에서 접근하기
    Outer1.no1 = 10; // 인스턴스 멤버는 스태틱 멤버에 접근가능
    no1 = 20;
    no2 = 30;
  }
  static int no1;
  int no2;

  // 인스턴스(멤버) 중첩 클래스는 바깥 클래스의 스태틱 멤버에 접근할 수 있다.
  // 인스턴스(멤버) 클래스는 바깥 클래스의 인스턴스 멤버에 접글할 수 있다
  // 즉 인스턴스 메서드와 동일하다.
  class Inner {
    public void test2() {
      no1 = 100; //ok! 스태틱 멤버는 같은 스태틱 멤버를 사용할 수 있다.
      m();
      System.out.println(no1);
      no2 = 100;
      System.out.println("test2" + no2);    
     }
  }
}
