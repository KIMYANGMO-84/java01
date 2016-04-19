/* 주제 : 중첩된 for문 탈출하기 */
package step05;

public class Exam17 {
    public static void main(String[] args) {
       for (int i = 2; i < 10; i++) {
         System.out.println("----------------------------------------");
         for (int j = 1; j < 10; j++) {
           System.out.printf("%d\tx\t%d\t=\t%d\n", i, j, i * j);
           if (i == 5 && j == 6){
            break ;
          }
        }
      }
      /*라벨*/first : 
      for (int i = 2; i < 10; i++) {
        System.out.println("----------------------------------------");
        for (int j = 1; j < 10; j++) {
          System.out.printf("%d\tx\t%d\t=\t%d\n", i, j, i * j);
          if (i == 5 && j == 6){
           break first;
         }
       }
     }
     System.out.println("------------------탈출------------------");
  }
}

/*
*/
