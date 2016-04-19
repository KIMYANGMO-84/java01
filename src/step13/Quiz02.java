package step13;
/* 문제2) 두 수 사이에 있는 수 중에서 짝수 값을 출력하시오
*/
public class Quiz02 {
  public static void main(String[] args) {
    System.out.println(args.length);
    System.out.println("--------------------");
    int i1 = Integer.parseInt(args[0]);
    int i2 = Integer.parseInt(args[1]);
    for (int i = i1; i <= i2; i++) {
      if (i % 2 == 0){
        System.out.println(i);
      }
    }
  }
}
  /*
  */
