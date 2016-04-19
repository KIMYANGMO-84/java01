/* 주제 : 인스턴스 데이터를 다루는 연산자(operator) 추가하기*/

package step09;

public class Exam07 {
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

    // 연산자 추가하기
    void summary() { // 국,영,수 합계를 계산하는 연산자
      this.sum = this.kor + this.eng + this.math;
    }

    void average() {
      this.aver = this.sum / 3f;
    }
  }

  public static void main(String[] args) {
    Score s = new Score("홍길동", 100, 100, 100);

    //메서드를 실행하는 것은
    //인스턴스에 대해 연산자를 실행하는것과 같다.
    s.summary(); // s 데이터에 대해 summary() 연산을 수행한다.
    s.average(); // s 데이터에 대해 average() 연산을 수행한다.

    System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", "이름", "국어", "영어", "수학", "총점", "평균");
    System.out.printf("%s\t%d\t%d\t%d\t%d\t%f\n", s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }
}
/* 메서드?
- 특정기능을 수행하는 명령어를 묶어 둔 것.
- 사용자가 정의한 타입(클래스)의 데이터를 다루는 연산자를 정의할 때
  메서드 문법을 사용한다. => method == operator
- 메서드 실행은 물건에게 명령을 내리기 위해 전달하는 메시지이다. => method == message
*/
