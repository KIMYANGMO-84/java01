/* 주제 : 반복문 for */
package step05;

public class Exam12 {
    public static void main(String[] args) {
      for (/*1*/int i = 0; /*2*/ i < 3; /*4*/i++){
        /*3*/System.out.println(i);
      }
      // for 실행 순서
      // 1 --> 2 --> 3 --> 4 --> 2(반복)
      System.out.println("----------------");

      // 1) 초기화문장 생략
      int i = 0; // for문 안에 선언된 변수는 for 문이 끝나면 삭제된다.
      for (; i < 3; i++){
        System.out.println(i);
      }
      System.out.println("----------------");

      // 2) 증감문 생략
      i = 0; // for문 안에 선언된 변수는 for 문이 끝나면 삭제된다.
      for (; i < 3; ){
        System.out.println(i++);
      }
      System.out.println("----------------");

      // 3) 조건문 생략
      i = 0; // for문 안에 선언된 변수는 for 문이 끝나면 삭제된다.
      for ( ; ; ){
        System.out.println(i++);
        if (i >= 10){
          break;
        }
      }
      System.out.println("----------------");
  }
}

/*
*/
