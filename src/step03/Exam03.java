/* 주제 : 물건(object)과 이름표(reference)의 관계*/
package step03;

public class Exam03 {
    public static void main(String[] args){
      String s1 = "Hello";
      String s2 = "World";
      String s3 = s1;

      System.out.printf("%s %s %s\n", s1, s2, s3);

      s1 = s2;
      System.out.printf("%s %s %s\n", s1, s2, s3);
    }
}

/*
*/
