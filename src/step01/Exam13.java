/* 주제 : 문자 값 표현 */
package step01;

public class Exam13 {
  public static void main(String[] args){
    System.out.print((char)0x0048);
    System.out.print((char)0x0065);
    System.out.print((char)0x006c);
    System.out.print((char)0x006c);
    System.out.println((char)0x006f);

    // 자바에서 제공하는 특수한 연산자
    System.out.println('A');
    System.out.println('a');
    System.out.println('가');

    int a = 'A';
    int b = 'a';
    int c = '가';
    System.out.println(Integer.toHexString(a));
    System.out.println(Integer.toHexString(b));
    System.out.println(Integer.toHexString(c));
  }
}

/* 자바의 문자
- 자바는 유니코드 명세에 따라 문자를 2byte 메모리에 저장한다.
A => 0x0041 => 0000 0000 0100 0001
B => 0x0042 => 0000 0000 0100 0010
a => 0x0061 => 0000 0000 0110 0001
b => 0x0062 => 0000 0000 0110 0010
가 => 0xAC00 => 1011 1101 0000 0000
각 => 0xAC01 => 1011 1101 0000 0001

1) ASCII(7bit)
ABC abc 가각간 똘똠똥 ==>41 42 43 61 62 63 ---- ---- ---- ---- ---- ----

2) ISO-8859-1(8bit)
-ASCII + 유럽문자

3)EUC-KR(16bit)
-2350자
ABC abc 가각간 똘똠똥 ==>41 42 43 61 62 63 b0a1 b0a2 b0a3 b6ca ---- b6cb

4)조합형(16bit)
-초성(5bit),중성(5bit),종성(5bit)로 정의
-첫 비트는 한글이라는 의미로 1로 설정
- 1[초성][중성][종성]=16비트
-국제 표준 아님

5)MS949(16bit)
- 윈도우 95부터 추가된 문자집합
- ECU-KR + 추가한글 = 11172자
- 국제 표준 아님
ABC abc 가각간 똘똠똥 ==>41 42 43 61 62 63 b0a1 b0a2 b0a3 b6ca bc63 b6cb

6)UNICODE(16bit)
영어, 한글 모두 2바이트로 정의
-한글은 새로운 코드 값으로 정의 => EUC-KR과 호환이 안됨

7)UTF-8(1~4바이트)
-유니코드 문자를 재정의
-1바이트로 표현 사능한것은 그대로 1바이트로 표현하고
-2바이트 문자는 2~4바이트로 변환하여 표현한다


'\'u를 이용한 문자 표현
-문법 : '\'u유니코드'
예) '\uac00', '\u0041'

*/
