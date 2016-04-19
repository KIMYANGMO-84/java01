/* 주제 : 문자열 배열 */
package step02;

public class Exam11 {
    public static void main(String[] args){
      String[] names = new String[5];
      names[0] = "홍길동";
      names[1] = "임꺽정";
      names[2] = "유관순";
      names[3] = "광대토대왕";
      names[4] = "장수왕";

      String[] names2;
      names2 = new String[]{"홍길동", "임꺽정", "유관순"};

      String[] names3 = {"홍길동", "임꺽정", "유관순"};

      System.out.printf("%s\t%s\t%s\t\n", names[0], names2[1], names3[2]);
  }
}

/*
*/
