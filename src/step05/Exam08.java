/* 주제 : 다중 분기 조건문 switch */
package step05;

public class Exam08 {
    public static void main(String[] args) {
      int job = 3; // 1: 개발, 2: 운영팀, 3: 일반 관리직
      switch (job) {
        case 1:
            System.out.println("자바 자격증");
        case 2:
            System.out.println("리눅스 자격증");
        case 3:
            System.out.println("오피스 자격증");
            break;
        default:
            System.out.println("자격증이 필요없는 직종입니다.");
      }
  }
}

/*
*/
