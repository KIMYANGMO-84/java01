package step24.exam05;

public class Test implements A, B {
  public void m1() {    

    // 구현한 인터페이스에 동일한 이름의 변수가 있을 때는
    // 인터페이스 이름을 명시하여 명확하게 구분해야한다.
    System.out.println(B.MAN);
    System.out.println(WOMAN);
    System.out.println("m1().....");
  }
  public static void main(String[] args) {
    Test p = new Test();
    p.m1();
  }
}
/*
# B 인터페이스가 A 인터페이스를 상속받은 경우
=> B의 메서드를 구현해야 하지만 B의 슈퍼클래스인 A의 메서드도 구현해야한다.

*/
