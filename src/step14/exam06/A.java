package step14.exam06;

public class A {
  String v1 = "홍길동"; // 변수 선언 + 초기화 문장
  int v2 = 10; // 변수 선언 + 초기화 문장
  boolean v3; // 변수 선언

  {
    System.out.println("--------A의 인스턴스 블록 시작--------");
    v1 = "임꺽정";
    v3 = true;
  }

  public A() {
    System.out.println("--------A의 생성자 블록 시작--------");
    v1 = "유관순";
    v2 = 20;    
  }
}
