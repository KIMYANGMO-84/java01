package step14.exam06;
public class B extends A {
  float v4 = 3.14f;
  char v5;

  {
    System.out.println("--------B의 인스턴스 블록 시작--------");
    v1 = "안중근";
    v2 = 30;
    v4 = 230.334f;
  }

  public B() {
    // 슈퍼 클래스의 어떤 생성자를 실행할 지 지정하지 않으면,
    // 다음과 같이 슈퍼 클래스의 기본 생성자를 호출하는 코드가
    // 자동으로 삽입된다.
    super();
    System.out.println("--------B의 생성자 블록 시작--------");
    v1 = "김원봉";
    v3 = false;
    v5 = '가';
  }
}
