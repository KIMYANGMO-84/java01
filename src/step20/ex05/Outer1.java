package step20.ex05;

public class Outer1 {
  static int v1;
  static void m1() {

  }
  int v2;
  void m2() {

  }
  //1) top level inner class
  static class Inner1 {
    static void test() {
      v1 = 10;
      m1();
    }
  }
  // 2) member inner class
  class Inner2 {

  }
  //3) local inner class
  public void m() {
    class Inner3 {

    }
  }
  //4) annonymous inner class
    Object obj = new Object() {};
}
