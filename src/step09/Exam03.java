/* 주제 : 생성자 (constructor)
    JVM이 인스턴스를 생성한 후에 자동으로 실행하는 특별한 메서드
*/

package step09;

public class Exam03 {
  static class Score{
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    Score() {
      System.out.println("생성자 호출됨!");
    }
  }

  //생성자를 만들지 않으면 다음과 같이 기본 생성자가 자동으로 추가된다.
  // public Score() {}

  //다음과 같이 개발자가 직접 기본 생성자를 정의할 수 있다.


  public static void main(String[] args) {
    // 생성자 호출 확인!
    System.out.println("---------------");
    new Score();
    System.out.println("---------------");
    new Score();
    System.out.println("---------------");
    new Score();
    System.out.println("---------------");
    new Score();
    System.out.println("---------------");

  }
}
/* 생성자
- 인스턴스가 생성된 후 자동으로 호출함.
- 인스턴스가 사용되기 전에 유효한 값으로 초기화하기 위해서.
- 모든 클래스는 반드시 한 개 이상의 생성자가 있어야 한다.
- 생성자를 만들지 않으면, 컴파일러가 기본 생성자를 자동으로 붙인다.

  생성자 문법
- 메서드 이름은 클래스 이름과 같아야 한다.
- 리턴 값이 없다. 그래서 리턴 타입을 적지 않는다.
- 파라미터가 없는 생성자를 기본 생성자라 부른다.
예) score() {....}

  인스턴스 생성 문법 분석
   new Score();
new => 인스턴스를 만들라는 명령어 (필수)
Score => 인스턴스를 만들 때 참조할 설계도 (필수)
() => 기본 생성자를 호출하라는 명령 (필수)
   => 아무런 값도 받지 않는 기본 생성자를 호출하라는 명령
*/
