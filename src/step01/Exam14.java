/* 주제 : 특수 문자의 표현 - Escape문자 사용 */
package step01;

public class Exam14 {
  public static void main(String[] args){
    System.out.print("Hello");
    System.out.print('\b'); // return backspace code : 0x0008
    System.out.print("World");
    System.out.print('\n'); // return linefeed(LF) code : 0x000a


    System.out.print("This is \"홍길동\"");
    System.out.print('\n');

    System.out.print((int)'\'');
    System.out.print('\n');

    System.out.println('\\'); //0x005C

  }
}

/* Escape문자
- \b : backspace
- \t : tab
- \n : linefeed(LF)
- \f : formfeed
- \r : carrage return(CR)
- \" : double quote
- \' : single qoute
- \\ : backslash

줄바꿈?
- windows OS : 0D0A (2바이트로 표현)
- Unix/Linux : 0A (1바이트로 표현)

*/
