/* 주제 : class로 사용자 정의 타입 만들기 복잡한 데이터를 다루기*/
package step09;

public class Exam02 {
  static class Score{
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }

  public static void main(String[] args) {
    Score[] scores = new Score[3]; // 인스턴스 주소를 저장할 레퍼런스 변수 3개

    scores[0] = new Score(); // 인스턴스 생성
    scores[0].name = "홍길동";
    scores[0].kor = 100;
    scores[0].eng = 90;
    scores[0].math = 100;

    scores[1] = new Score(); // 인스턴스 생성
    scores[1].name = "임꺽정";
    scores[1].kor = 90;
    scores[1].eng = 90;
    scores[1].math = 80;

    scores[2] = new Score(); // 인스턴스 생성
    scores[2].name = "유관순";
    scores[2].kor = 100;
    scores[2].eng = 100;
    scores[2].math = 100;

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
/* 기본 데이터 타입만을 사용하여 데이터를 다룰 때 문제점?
=> 여러 개의 타입으로 이루어진 복합 데이터를 다룰 떄 불편하다.
=> 예) 학생 성적, 인사 정보, 주문 정보, 결제 정보, 도서 정보
=> 해결책?
   그 데이터에 적합한 타입을 정의하여 사용하면 된다.
   => 사용자 정의 타입
   => class 문법을 사용하여 사용자 정의 타입을 만든다.

*/
