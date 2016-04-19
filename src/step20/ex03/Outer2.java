package step20.ex03;

public class Outer2 { // top level inner class선언
  static int no;

  static void m() {
    System.out.println("Outer2.m()");
  }
  static class Inner {
    public static void m() {
      System.out.println("Inner.m()");
    }
    public void m2() {
      System.out.println("Inner.m2()");
    }
  }
}
