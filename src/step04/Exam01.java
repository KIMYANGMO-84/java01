/* 주제 : 산술 연산자 사용*/
package step04;

public class Exam01 {
    public static void main(String[] args){
      int v1 = 10;
      int v2 = 20;
      int result = v1 + v2; // -, * , /, %
      System.out.println(result);

      //byte b = 10;
      //byte b = v1; // 변수의 경우 비록 작은 값이라 할 지라도 허락하지 않는다.

      byte b1 = 10;
      byte b2 = 20;
      //byte b3 = b1 + b2;
      //byte b3 = 10 + 20;
      //byte b3 = b1 + 20;
      //byte b3 = 10 + b2;

      short s1 = 20;
      //short s3 = b1 + s1;

      int i1 = b1 + s1;

      System.out.println(b1 + " + " + s1 + " = " + i1);

  }
}

/*
4바이트 리터럴 값을 byte, short 메모리에 저장하는 규칙
- 메모리에 저장이 가능하다면 허락한다.

변수는 허락되지 않는다.

리터럴 값들의 연산 결과는 리터럴 값으로 취급한다.
- 리터럴은 값은 연산을 하더라도 변하지 않는다. => 컴파일(번역) 과정에서 검증할 수 있다.
- 기존의 법칙 : 리터럴 값이 비록 4바이트라고 하더라도 메모리에 저장할 수 있다면, 허락한다.

자바의 기본 연산결과는 int이다.
- byte 변수와 byte 변수의 연산 결과는 int 이다.
- short 변수와 short 변수의 연산 결과는 int 이다.

리터럴과 변수의 연산 결과는 변수로 취급된다.
- 변수의 값에 따라 연산 결과가 달라지기 때문에
  메모리에 저장할 수 있는지 확실하지 않다.
  그래서 기본 크기 보다 작은 메모리에 저장하는 것을 허락하지 않는다.
*/
