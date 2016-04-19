/* 주제 : 다른 패키지의 클래스 사용
 */
package step10.other;
import step10.Score3; // score3의 소속을 컴파일러에게 알린다.
                      // 컴파일 후에 제거되는 명령문이다.
                      // import문의 개수가 많다고 걱정하지 말라!

public class Exam05 {
  public static void main(String[] args) {
    // 방법1) 정확하게 패키지 이름까지 적으면 된다.
    //step10.Score3 s = new step10.Score3("홍길동", 100, 100, 100);

    // 방법2) import를 사용하여 패키지 정보를 미리 알려준다.
    Score3 s = new Score3("홍길동", 100, 100, 100);
    s.setKor(50);
    System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", "이름", "국어", "영어", "수학", "총점", "평균");
    System.out.printf("%s\t%d\t%d\t%d\t%d\t%f\n",
      s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getSummary(), s.getAverage());
  }
}
/* 다른 패키지 클래스 사용법
방법1) 클래스 이름 앞에 패키지 이름을 모두 적어라
방법2) 패키지 선언 아래에 클래스의 패키지 정보를 등록한다.
 => import step10.score3;
 => import step10.*; <--- 클래스의 소속을 직관적으로 알 수 없기때문에 쓰지 않는 방법

컴파일할 때 오류발생/
- Score3의 class 접근 레벨이 default이기 때문이다.
- default는 오직 같은 패키지에 소속된 클래스만 접근할 수 있다.
- Exam05는 Score3와 다른 패키지에 소속되어 있기 때문에 Score3에 접근할 수 없다
*/
