package step17;

import java.util.Scanner;

public class Member {
  static Scanner sc = new Scanner(System.in);
  static String ans;
  static boolean b;
  String[][] member;

  public void memberAdd() {
    member = new String[5][4];
    for (int i = 0; i < member.length;) {
      b = true;
      System.out.println("현재 count : " + (i + 1));
      System.out.print("이름 : ");
      member[i][0] = sc.nextLine();
      System.out.print("이메일 : ");
      member[i][1] = sc.nextLine();
      System.out.print("암호 : ");
      member[i][2] = sc.nextLine();
      System.out.print("전화 : ");
      member[i][3] = sc.nextLine();

      while(b) {
        System.out.print("정말 저장 하시겠습니까? (y/n) ");
        ans = sc.nextLine();
        if (ans.equals("Y") || ans.equals("y")) {
          b = false;
          i++;
          System.out.println("저장되었습니다.");
          System.out.println("------------------------------");
        } else if (ans.equals("N") || ans.equals("n")) {
          b = false;
          System.out.println("취소 되었습니다.");
        } else {
          System.out.print("잘못 입력하셨습니다. Y 또는 N을 선택하세요" );
        }
      }
    }
  }

  public void memberInfo() {
    System.out.println("현재 저장된 회원 정보는 다음과 같습니다.");
    System.out.printf("%s\t%s\t%s\t%s\n", "이름", "이메일", "암호", "전화");
    for (int i = 0; i < member.length; i++){
      System.out.printf("%s\t%s\t%s\t%s\n", member[i][0], member[i][1], member[i][2], member[i][3]);
    }
  }
}
/* 5명의 회원정보를 입력 받아서 보관하라!
> java -cp bin step17.Quiz
> 이름 ? 홍길동
> 이메일 ? hong@teat.com
> 암호 ? 1111
> 전화 ? 111-1111
> 정말 저장하시겠습니까? (y/n)
> 저장했습니다.
-----------------------------
5번 반복
> 지금까지 입력한 회원 정보는 다음과 같습니다.
홍길동,
*/
