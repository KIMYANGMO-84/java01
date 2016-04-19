/* 주제 : 캡슐화 적용전
* 외부 클래스의 메서드는 내부 클래스의 격리 레벨에 상관없이
  무제한 접근이 가능하다
  격리 레벨을 테스트 하기 위해 Score 클래스를 일반 클래스로 만들어 테스트한다.
  일반 클래스?
  => 패키지 직속 클래스
  중첩 클래스?
  => 다른 클래스 안에 선언된 클래스
*/

package step10;

public class Exam01 {
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    Score(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
    }

    void summary() {
      this.sum = this.kor + this.eng + this.math;
    }

    void average() {
      this.aver = this.sum / 3f;
    }
  }

  public static void main(String[] args) {
    Score s = new Score("홍길동", 100, 100, 100);
    // 특정 항목에 대해 유효 범위를 넘어가는 값으로 변경
    s.kor = 120; // 문법은 ok, 작업은 무효하다.

    s.summary();
    s.average();
    // 특정 항목의 값을 임의로 변경
    s.sum = 88; // 문법은 ok, 작업은 무효하다.

    System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", "이름", "국어", "영어", "수학", "총점", "평균");
    System.out.printf("%s\t%d\t%d\t%d\t%d\t%f\n", s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }
}
/* 무효한 값을 설정할 때?
- 문법 상으로는 문제가 없지만, 프로그램의 목적 또는 작업의 목적에는 부합하지 않는 경우
  문제가 된다.
- 이런 문제가 발생한 이유/
  인스턴스 변수에 임의적으로 접근할 때.
  내부에서 실행될 명령어가 외부에서 실행할 때
- 해결책?
  외부로부터 변수나 메서드에 대해 격리시키기
  => 캡슐화(encapsulation)
- 캡슐화 격리 레벨
  1) private : 내부에서만 접근 가능
  2) public : 완전 공개
  3) (default) : 같은 패키지에 소속된 클래스에서는 접근 가능
  4) protected : 같은 패키지 + 자식 클래스에서는 접근 가능
*/
