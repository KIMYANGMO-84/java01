package step01;

import java.util.Scanner;

public class Test11 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    int a;
    int b = 10;
    System.out.print("A : ");
    a = Integer.parseInt(keyScan.nextLine());    
    System.out.println((a > b)? "a가 크다":"a가 작다" );
  }

}
