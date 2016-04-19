package step20.ex03;


public class Test1 { //top level inner class 테스트
  public static void main(String[] args) {
  // 변수든 메서드든 중첩 클래스든 간에
  // 바깥 클래스의 멤버일 뿐이다.
  Outer2.no = 20; // <-- 스태틱 변수 사용
  System.out.println(Outer2.no);
  Outer2.m(); // 스태틱 메서드 사용
  Outer2.Inner.m(); // 스태틱 중첩 클래스 사용

  }
}
/*
*/
