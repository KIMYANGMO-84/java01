package step20.ex03;

public class Outer1 {
  // 1) top level inner class
  // static 멤버이다.
  // 클래스 이름으로 사용가능
  static class TopLevelInner {
  }

  //2) member inner class
  // instance 멤버이다.
  // 인스턴스가 있어야만 사용가능
  class MemberInner2 {
  }

  public void m() {
    //3)  local inner class
    // 메서드의 로컬 변수처럼 메서드 안에서만 사용 가능
    class LocalInner{

    }
  }

  //4) anonymous inner class
  // 클래스 이름이 없기 때문에 클래스 선언과 동시에 인스턴스를 생성해야 한다
  // 문법
  // new [수퍼클래스|인터페이스](생성자파라미터값) {
  // 클래스 멤버 선언
  // }
//  Object obj = new Object() {
//    public void m() {
//
//    }
//  };
//  class {
//    public void m2() {
//
//    }
//  };
//
//  public void test() {
//    Object p;
//    p = new ();
//    p = new ();
//  };
//
//}
}
