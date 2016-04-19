/* 주제 : 인스턴스 초기화 블록


*/

package step09;

public class Exam05 {
  static class Score{
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    { // 인스턴스 초기화 블록
      System.out.println("인스턴스 초기화 블록1");
    }

    Score(String name, int kor, int eng, int math) {
      System.out.println("생성자 호출");
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
    }

    {
      System.out.println("인스턴스 초기화 블록2");
    }

  }

  //생성자가 단 한개라도 있으면 기본 생성자는 생성되지 않는다

  public static void main(String[] args) {
    /*Score[] scores = new Score[]{
      new Score("홍길동", 100, 100, 100),
      new Score("임꺽정", 90, 90, 90),
      new Score("유관순", 80, 80, 80)
  };*/
    System.out.println("---------------");
    /*scores[0] =*/ new Score("홍길동", 100, 100, 100);
    System.out.println("---------------");
    /*scores[1] =*/ new Score("임꺽정", 90, 90, 90);
    System.out.println("---------------");
    /*scores[2] =*/ new Score("유관순", 80, 80, 80);
    System.out.println("---------------");
    /*
    for (int i = 0; i < scores.length; i++) {
      scores[i].sum = scores[i].kor + scores[i].eng + scores[i].math;
      scores[i].aver = scores[i].sum / 3f;
    }
    System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", "이름", "국어", "영어", "수학", "총점", "평균");
    for (int i = 0; i < scores.length; i++) {
      System.out.printf("%s\t%d\t%d\t%d\t%d\t%f\n",
        scores[i].name, scores[i].kor, scores[i].eng, scores[i].math, scores[i].sum, scores[i].aver);
    }*/
  }
}
/* 인스턴스 초기화 블록
- 생성자처럼 인스턴스가 생성될 때 마다 실행되는 블록
  => 인스턴스 초기화 블록이 모두 실행된 후 생성자가 실행된다.
- 생성자가 있는데 왜 이 문법이 필요한가?
  언제 사용하는가?
  생성자가 없는 클래스에 초기화 작업을 추가하고 싶을 때
- 생성자가 없는 클래스?
  => 익명 중첩 클래스
*/
