/* 주제 : 스태틱 변수(클래스 변수)와 스태틱 블록 */

package step12;

public class Exam01 {
  static int staticValue = 10;

  public void instanceMethod() {
    // 스태틱 변수는 클래스 이름으로 접근할 수있다.
    Exam01.staticValue = 1000; // ok

    // 만약 메서드가 스태틱 변수와 같은 클래스에 있다면,
    // 클래스명 생략 가능
    staticValue = 2000; //ok
  }

  //인스턴스 변수는 사용되기 전에 생성자를 통해 초기화시킬 수 있다.
  public Exam01() {

  }

  // 스태틱 변수를 사용하기 전에 적절한 값으로 초기화 시키는 방법
  // => 스태틱 블록
  static {
    Exam01.staticValue = 3000;
    staticValue = 4000;
  }
  public static void main(String[] args) {
    System.out.println(Exam01.staticValue);

    Exam01 p = new Exam01();
    p.instanceMethod();
    System.out.println(Exam01.staticValue);
  }
}

/* 스태틱 블록 실행 순서
1) 클래스 로딩
2) 스태틱 변수 준비
3) 스태틱 변수의 초기화 문장 실행
4) 스태틱 블록 실행



*/
