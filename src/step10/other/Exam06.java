/* 주제 : 클레스 접근 레벨 */
package step10.other;
import step10.Score4; // score4의 소속을 컴파일러에게 알린다.
                      // 컴파일 후에 제거되는 명령문이다.
                      // import문의 개수가 많다고 걱정하지 말라!

public class Exam06 {
  public static void main(String[] args) {
    // 방법1) 정확하게 패키지 이름까지 적으면 된다.
    //step10.Score4 s = new step10.Score4("홍길동", 100, 100, 100);

    // 방법2) import를 사용하여 패키지 정보를 미리 알려준다.
    Score4 s = new Score4("홍길동", 100, 100, 100);
    s.setKor(50);
    System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", "이름", "국어", "영어", "수학", "총점", "평균");
    System.out.printf("%s\t%d\t%d\t%d\t%d\t%f\n",
      s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getSummary(), s.getAverage());
  }
}
/* 클래스 접근 레벨?
- public : 다른 패키지에 공개
- (default) : 같은 패키지 클래스만 접근 가능

- 패키지 직속 클래스를 "패키지 멤버 클래스"라고 부른다.
- 우리가 보통 작성하는 클래스가 모두 패키지 멤버 클래스이다.

클래스 멤버(변수, 메서드, 중첩 클래스)의 접근 레벨?
- public : 모두 공개
- (default) : 같은 패키지의 클래스만 접근 가능
- protected : 같은 패키지 + 자식 클래스
- private : 해당 내부 클래스 내부에서만 사용

*/
