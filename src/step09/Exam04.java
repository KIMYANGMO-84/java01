/* 주제 : 파라미터를 갖는 생성자 (constructor)
  인스턴스를 생성할 때 외부에서 주입한 값으로 초기화 시키기

*/

package step09;

public class Exam04 {
  static class Score{
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
  }

  //생성자가 단 한개라도 있으면 기본 생성자는 생성되지 않는다

  public static void main(String[] args) {
    Score[] scores = new Score[]{
      new Score("홍길동", 100, 100, 100),
      new Score("임꺽정", 90, 90, 90),
      new Score("유관순", 80, 80, 80)
  };
  /*  System.out.println("---------------");
    scores[0] = new Score("홍길동", 100, 100, 100);
    System.out.println("---------------");
    scores[1] = new Score("임꺽정", 90, 90, 90);
    System.out.println("---------------");
    scores[2] = new Score("유관순", 80, 80, 80);
    System.out.println("---------------");
    */
    for (int i = 0; i < scores.length; i++) {
      scores[i].sum = scores[i].kor + scores[i].eng + scores[i].math;
      scores[i].aver = scores[i].sum / 3f;
    }
    System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", "이름", "국어", "영어", "수학", "총점", "평균");
    for (int i = 0; i < scores.length; i++) {
      System.out.printf("%s\t%d\t%d\t%d\t%d\t%f\n",
        scores[i].name, scores[i].kor, scores[i].eng, scores[i].math, scores[i].sum, scores[i].aver);

    }
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
