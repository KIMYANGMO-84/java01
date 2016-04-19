/* 주제 : 비트 연산자 사용*/
package step04;

public class Exam05 {
    public static void main(String[] args){
      // & (AND) => 특정 비트들을 걸러내는 효과가 있다.
      int a = 0b0101_0011;
      int b = 0b0000_1111;
      String result = Integer.toBinaryString(a & b);

      System.out.println(result);
      System.out.println(a & b);

      // \ (OR) =>특정 비트의 값을 강화하는 효과가 있다.
      result = Integer.toBinaryString(a | b);
      System.out.println(result);
      System.out.println(a | b);

      // ~ (NOT) => 전체 비트의 값을 반전 시키는 효과가 있다.
      result = Integer.toBinaryString(~a);
      System.out.println(result);
      System.out.println(~a);

      // ^ (Exclusive OR) => 특정 비트의 값을 제거(반전)하는 것.
      //                    영상 크로마킹 기법에 많이 사용한다.
      a = 0b0101_0011;
      b = 0b0000_1111;
      result = Integer.toBinaryString(a ^ b);
      System.out.println(result);
      System.out.println(a ^ b);

      //
  }
}

/*
비트연산자에서 &연산자 사용시 비트값을
1111을 주면 그대로 통과시키는 효과를 주고
0000을 주면 0으로 막는 효과를 준다
*/
