package step31;

import java.util.Scanner;

public class Test04 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);    
    
    // 미리 정의된 문자집합
//    String regex = "[0-9]"; // 0-9까지중 한 개 문자
//    String regex = "\\d"; // 0-9까지중 한 개 문자
//    String regex = "[a-zA-Z0-9]"; // 문자 1개
//    String regex = "\\w"; // 위와 같음
//    String regex = "."; //어떤 문자든 1개
      String regex = "\\."; // '.' 문자 1개
    
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
