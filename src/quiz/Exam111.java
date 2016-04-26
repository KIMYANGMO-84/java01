package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam111 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    int count = (int) (Math.random() * 10) + 3;
    int mCount = 0;
    ArrayList<String> input = new ArrayList<>();
    char[] c1 = null;
    char[] c2 = null;
    int result = 1;
    
    System.out.print("시작 단어 입력 : ");
    input.add(0, keyScan.nextLine());
    
    System.out.println("count : " + count);
   
    while (!(result == count)) {
      System.out.printf("%d번 바꿀 단어 : ", result);
      input.add(result, keyScan.nextLine());
      if (input.get(result-1).length() == input.get(result).length()) {
        c1 = input.get(result-1).toCharArray();
        c2 = input.get(result).toCharArray();
        for (int i = 0; i < c1.length; i++) {
          if(!(c1[i] == c2[i])) {
            mCount += 1;
          }
        }
        if (mCount == 1) {
          result++;
          mCount = 0; 
        } else {
          mCount = 0;
          System.out.println("잘못 입력 하셨습니다.");
          System.out.println("한글자만 바꿔 다른단어를 만들어 주세요");
        }
      } else {
        System.out.printf("%d글자의 단어를 입력하세요\n", input.get(0).length());
      }
    }
  }
}
