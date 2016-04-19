// 키보드로부터 데이터 읽기

package step17;

import java.util.Scanner;

public class Exam01 {
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("문자를 입력하세요 : ");
    String str = keyScan.nextLine();
    System.out.println("--->" + str);

    System.out.print("문자를 입력하세요 : ");
    str = keyScan.nextLine();
    System.out.println("--->" + str);

    System.out.print("문자를 입력하세요 : ");
    str = keyScan.nextLine();
    System.out.println("--->" + str);
  }
}

/*
System.in : 키보드를 가리키는 레퍼런스
System.out : 콘솔을 가리키는 레퍼런스
System.err : 콘솔을 가리키는 레퍼런스
Scanner : 특정 입력 장치로부터 데이터를 읽어 들이는 도구


*/
