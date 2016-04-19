/* 주제 : 값의 표현(Literal) */
package step01;

public class Exam07 {
  public static void main(String[] args){
    System.out.println("문자열"); // object
    System.out.println(20);       // 4Byte
    System.out.println(20L);      // 8Byte
    System.out.println(20l);      // 8Byte
    System.out.println(3.14159);  // 4Byte
    System.out.println(3.14159F); // 8Byte
    System.out.println(3.14159f); // 8Byte
    System.out.println(true);     // 1byte
    System.out.println(false);    // 1byte
    System.out.println('A');      // 2byte
    System.out.println('가');     // 2byte
    //System.out.println('가나'); // 오류
    //System.out.println(null);
  }
}

/*리터럴(Literal)
- 자바 코드로 표현한 값
1) 문자열 : 큰따옴표("")로 표현한다.
2) 숫자 : 4Byte/8Byte 숫자로 표현할 수 있다.
  4Byte : 20
  8Byte : 20L(이 표현을 많이 사용),20l
3) 소수점이 있는 숫자(부동소수점) : 4Byte/8Byte 숫자로 표현할 수 있다.
  4Byte : 3.14159F, 3.14159f(이 표현을 많이 사용)
  8Byte : 3.14159
4) 논리 값 : true, false 로 표현
5) 문자 : 작은 따옴표('')로 표현. 한 개의 문자 표현.

*/
