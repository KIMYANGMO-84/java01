/* 주제 : 생성자 오버로딩 */

package step11;

public class Exam01 {
  public static void main(String[] args) {
    Score s = new Score("홍길동", 100, 100, 100);
    System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", "이름", "국어", "영어", "수학", "총점", "평균");
    System.out.printf("%s\t%d\t%d\t%d\t%d\t%f\n",
      s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getSummary(), s.getAverage());

    Score s2 = new Score();
    s2.setName("오로");
    s2.setKor(100);
    s2.setEng(80);
    s2.setMath(85);
    System.out.printf("%s\t%d\t%d\t%d\t%d\t%f\n",
      s2.getName(), s2.getKor(), s2.getEng(), s2.getMath(), s2.getSummary(), s2.getAverage());
  }
}
/* 오버로딩
- 비록 파라미터가 다르더라도 같은 기능을 수행하는 메서드에 대해
  같은 이름을 부여함으로써 프로그래밍의 일관성을 확보하는 문법


*/
