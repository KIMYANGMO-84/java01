/* 주제 : 전위/후위 증감 연산자 수행원리 비교*/
package step04;

public class Exam11 {
    public static void main(String[] args){
      int i = 10;
      int r1 = ++i + ++i + ++i; // 11 + 12 + 13
      System.out.println("r1 = " + r1);

      int j = 10;
      int r2 = j++ + j++ + j++; // 10 + 11 + 12
      System.out.println("r2 = " + r2);

      
      i = 10;
      i = i++;
      System.out.println(i);
  }
}

/*

*/
