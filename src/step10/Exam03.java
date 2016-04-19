/* 주제 : 캡슐화 적용 후*/
//셋터 메소드 사용
package step10;

public class Exam03 {

  public static void main(String[] args) {
    Score2 s = new Score2("홍길동", 100, 100, 100);
    // 셋터를 이용하면 인스턴스를 생성한 후에도 값을 변경할 수 있다.
    // 또한 setter 내부에서 값을 저장하기 전에 값의 유효 여부를 검사하기 때문에
    // => 무효한 값이 저장되는것을 막을 수 있다.
    // 오동작을 일으킬 값을 넣지 않는다.

    s.setKor(120); // <-- 무효한 정수이기 때문에 값을 넣지 않는다.
    s.setKor(50); // 유효한 값이기 떄문에 저장될 것이다.
  

    // 외부에서 직접 접근 불가 컴파일 오류 발생
    // s.sum = 88;
    // 외부에서 접근이 불가하기 때문에 값도 불러올수 없음
    // System.out.printf("%s\t%d\t%d\t%d\t%d\t%f\n", s.name, s.kor, s.eng, s.math, s.sum, s.aver);
     System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", "이름", "국어", "영어", "수학", "총점", "평균");
     System.out.printf("%s\t%d\t%d\t%d\t%d\t%f\n",
      s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getSummary(), s.getAverage());
  }
}
/* 격리 레벨을 높이면 값을 꺼낼 수 없다.
- 해결책?
  값을 넣고 꺼내주는 연산자를 추가하라
- 값을 꺼내는 연산자 => 겟터(getter)
  int getKor() {}
- 값을 저장하는 연산자 =>(setter)
  void setKor(int value) {}

  개선점?
- 현재 Score는 인스턴스를 생성할 때 값을 저장할 수 있다.
- 인스턴스를 생성한 후에는 값을 변경할 수 없다.
- 왜? 모든 변수가 private로 접근 레벨이 높아졌지 때문이다.
- 해결책? 값을 설정해주는 연산자를 추가하라
 => setter추가

*/
