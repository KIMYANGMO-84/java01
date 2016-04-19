/* 주제 : 반복문 break, continue */
package step05;

public class Exam15 {
    public static void main(String[] args) {
      // break => 특정 조건에서 반복문을 멈추고 싶을때
      for (int i = 0; i < 10; i++){
        if (i == 5){
          break; // 즉시 반복문을 멈춘다.
        }
        System.out.println(i);
      }

      System.out.println("--------------");

      // continue => 특정 조건에 해당하는 항목을 건너 뛰고 싶을때
      for (int i = 0; i < 10; i++){
        if (i == 5){
          continue; // 다음 문장을 실행하지 않고 증가/감소문으로 이동한다.
        }
        System.out.println(i);
      }
  }
}

/*
*/
