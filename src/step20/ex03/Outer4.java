package step20.ex03;

public class Outer4 { // local inner class선언
  int no;

  void m() { // local inner class // m()에서만 사용가능
    class Inner {
      /* local inner class는 static 메서드를 선언할 수 없다.
      public static void m() {
        System.out.println("Inner.m()");
      }
      */
      public void m2() {
        System.out.println("Inner.m2()");
      }
    }
    Inner p = new Inner();
    p.m2();
  }
}
