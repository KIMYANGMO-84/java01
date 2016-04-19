// top level inner class 사용하기
package step20.ex04;

public class Outer1 { // top level inner class선언
  static void m() { // 스태틱 멤버에서 접근하기
    Outer1.no1 = 10;
    no1 = 20;
    // no2 = 30; // 오류
  }
  void m2() { //인스턴스 멤버에서 접근하기

  }
  static int no1;
  int no2;

  // 스태틱 중첩 클래스는 바깥 클래스의 스태틱 멤버에 접근할 수 있다.
  // 스태틱 중첩 클래스는 바깥 클래스의 인스턴스 멤버에 접글할 수 없다
  // 즉 스태틱 메서드와 동일하다.
  static class Inner {
    public static void test1() {
      //메서드의 static 여부는 상관없다
      // 중첩 클래스가 static이냐 아니냐이다
      no1 = 100; //ok! 스태틱 멤버는 같은 스태틱 멤버를 사용할 수 있다.
      m();
      System.out.println(no1);
    }
    public void test2() {
      no1 = 100;
      System.out.println("test2" + no1);
    }
  }
}
