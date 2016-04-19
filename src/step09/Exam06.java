/* 주제 : 인스천스 초기화 문장

*/

package step09;

public class Exam06 {
  static class Score{
    String name = "오호라"; // 인스턴스 변수 선언 + 초기화 문장
    int kor = 50;
    int eng = 50;
    int math = 50;
    int sum = 0;
    float aver = 50f;

    { // 인스턴스 초기화 블록
      name = "우헤헤";
    }

    Score() {
      sum = 150;
    }
  }

  //생성자가 단 한개라도 있으면 기본 생성자는 생성되지 않는다

  public static void main(String[] args) {
    Score obj = new Score();
    System.out.printf("%s,%d,%d,%d,%d,%f\n", obj.name, obj.kor, obj.eng, obj.math, obj.sum, obj.aver);
    /*Score[] scores = new Score[]{
      new Score("홍길동", 100, 100, 100),
      new Score("임꺽정", 90, 90, 90),
      new Score("유관순", 80, 80, 80)
  };*/
    /*System.out.println("---------------");
    scores[0] = new Score("홍길동", 100, 100, 100);
    System.out.println("---------------");
    scores[1] = new Score("임꺽정", 90, 90, 90);
    System.out.println("---------------");
    scores[2] = new Score("유관순", 80, 80, 80);
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
/* 인스턴스 생성 후 초기화 작업 순서
1) 인스턴스 초기화 문장 실행
2) 인스턴스 초기화 블록 실행
3) 생성자 실행
*/
