package step20.ex03;

public class Outer3 { // member inner class선언
  int no;

  void m() {
    System.out.println("Outer3.m()");
  }
  class Inner {
    /* member inner class는 static 메서드를 선언할 수 없다.
    public static void m() {
      System.out.println("Inner.m()");
    }
    */
    public void m2() {
      System.out.println("Inner.m2()");
    }
  }
}
