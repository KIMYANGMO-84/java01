/* 주제 : 메모리와 숫자 */
package step01;

public class Exam08 {
  public static void main(String[] args){
    System.out.println(-2147483648);       // 4Byte
    System.out.println(2147483647);       // 4Byte
    System.out.println(9223372036854775807L);      // 8Byte
    System.out.println(-9223372036854775808L);      // 8Byte
  }
}

/* 메모리(RAM을 기준)
- 전하(전기)를 보관하는 반도체.
- 한 개의 전하를 보관하는 곳을 "비트"라고 부른다.

8bit(1byte)  : 0 ~ 255 (-128 ~ 127)
32bit(4byte) : 0 ~ 4,294,967,295 (-2147483648 ~ 2147483647)
64bit(8byte) : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

자바 리터럴은 기본으로 4바이트 정수와 8바이트 정수를 표현할 수 있다.
default 4바이트, 값 뒤에 'L', 'l'을 붙이면 8바이트로 표현한다.

*/
