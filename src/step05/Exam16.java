/* 주제 : for문 중첩하기 */
package step05;

public class Exam16 {
    public static void main(String[] args) {
      for (int i = 2; i < 10; i++) {
        System.out.println("----------------------------------------");
        for (int j = 1; j < 10; j++) {
          System.out.printf("%d\tx\t%d\t=\t%d\n", i, j, i*j);
        }
      }
  }
}

/*
*/
