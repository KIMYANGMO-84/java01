package step14.exam09;

public class A {
  String v1 = "홍길동"; // 변수 선언 + 초기화 문장
  int v2 = 10; // 변수 선언 + 초기화 문장
  boolean v3; // 변수 선언

  // A 클래스에는 기본 생성자가 없다.
  public A(String name) {
    System.out.println("--------A의 생성자 블록 시작--------");
    this.v1 = name;

  }
}
