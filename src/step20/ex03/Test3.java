package step20.ex03;

//static 멤버를 컴파일러에게 미리 알려주기
// 중첩 클래스가 어떤 클래스의 스태틱 멤버인지 컴파일러에게 알려준다.
// => 단 static키워드를 붙여라!
import static step20.ex03.Outer2.Inner;

public class Test3 { //top level inner class 테스트2
  public static void main(String[] args) {
  // top level inner class의 인스턴스 생성하기
  Inner p = new Inner();
    p.m2();


  }
}
/*
*/
