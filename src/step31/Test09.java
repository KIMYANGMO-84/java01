package step31;

import java.util.Scanner;

public class Test09 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);    
    
//  연속 문자열 검사
//    String regex = "ab"; // a다음에 b
//    String regex = "a|b"; // a 또는 b
    String regex = "(a|b)(x|y)"; // a 또는 b
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