package step31;

import java.util.Scanner;

public class Test03 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);    
    
    // 문자집합 [abc] => a or b or c
    // String regex = "[abc]"; // --> a | b | c 중 문자 1개
//    String regex = "[^abc]"; // ^ 제외 a,b,c를 제외한 문자
//    String regex = "[a-z]"; // a~z까지중 문자 1개
//    String regex = "[a-zA-Z]"; // a~z 또는 A~Z까지 중 문자 1개
//    String regex = "[a-d[x-z]]"; // --> a | b | c | d | x | y | z 중 1개
    String regex = "[a-f&&[d-m]]"; // --> &&교집합 d| e | f 중 1개 
    String input = null;
    
    while (true) {
      System.out.print("입력: ");
      input = keyScan.nextLine();
      if (input.equals("quit")) {
        break;
      }
      System.out.println(input.matches(regex));
    }
    keyScan.close();
  }

}
