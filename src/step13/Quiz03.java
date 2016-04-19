package step13;
/* 문제2) 주어진 수의 약수를 모두 출력하시오
*/
public class Quiz03 {
  public static void main(String[] args) {
    System.out.println(args.length);
    System.out.println("--------------------");
    int i1 = Integer.parseInt(args[0]);
    //int i2 = Integer.parseInt(args[1]);
    for (int i = 1; i <= i1; i++) {
      if (i1 % i == 0){
        System.out.println(i);
      }
    }
  }
}
  /*
  */
