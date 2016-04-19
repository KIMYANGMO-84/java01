package step14.exam11;

public class C extends B {
  @Override // 컴파일러에게 오버라이드 검사 요청
  public void m2() {
    System.out.println("C.m2()");
  }

  // 새 메서드 추가
  public void m4() {
    System.out.println("C.m4()");
  }

  public void test() {
    //의미
    // => this 레퍼런스에 저장된 인스턴스를 가지고 m3() 메서드를 호출한다.
    // => m3()메서드 호출 과정
    // 1) 현재 클래스에서 찾아본다
    // 2) 없으면 상속받은 상위 클래스에서 찾아본다.
    // 3) 없다면 상속받은 상위클래스의 상위 클래스를 찾아본다

    // 참고!
    // => 메서드를 호출할 때 마다 클래스 계층 구조(class hierarchy)를
    // 훑기 때문에 C와 같은 functional 언어보다 실행 속도가 느리다.
    this.m3();

    this.m2();

    // 지정된 메서드를 슈퍼 클래스부터 상위 클래스로 찾아봐라
    super.m2();
    super.m1();
    
  }
}

/*
this 변수는 해당 인스턴스주소를 나타내는 변수

*/
