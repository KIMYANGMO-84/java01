/* 주제 : 조건문 if ~ else*/
package step05;

public class Exam03 {
    public static void main(String[] args) {
      // if ~ else ~
      if (10 > 20) {
        System.out.println("10 > 20");
      } else {
        System.out.println("1 <= 20 ");
      }
      // if ~ else ~ 는 한 문장으로 취급한다.
      // 따라서 else문만 별도로 사용할 수 없다.
      int age = 30;
      if (age < 18) {
        if (age <= 13)
          System.out.println("아동 입니다.");
      } else {
          System.out.println("성인 입니다.");
      } // 위와 같이 블록을 사용하면 코드를 좀 더 명확하게 읽을 수 있다.
  }
}

/*
*/
