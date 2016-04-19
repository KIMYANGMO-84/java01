package step14.exam09;
public class B2 extends A {
  float v4 = 3.14f;
  char v5;

  public B2() {
    // 슈퍼 클래스에 기본 생성자가 없을 때
    // 다른 생성자를 명시해야 한다.
    super("ㅇㅎㄹ");
    System.out.println("--------B의 생성자 블록 시작--------");
    
    v3 = false;
    v5 = '가';
  }
}
