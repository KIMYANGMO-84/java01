package step31;

import java.util.Scanner;

public class Test05 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);    
    
//    String regex = "^a\\d"; // 시작 문자가 a, 뒤에 0~9 숫자 1개
//    String regex = "^\\p{Alpha}\\w"; // 알파벳 문자로 시작하고 알파벳 또는 숫자
    String regex = "\\wx$"; // 알파벳또는 숫자로 시작하고 'x'문자로 끝나는 문자열
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
