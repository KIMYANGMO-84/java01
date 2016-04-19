package step13;
/* 문제1) 입력 받은 두 수 중 더 큰 수를 출력하시오.
*/
public class Quiz01 {
  public static void main(String[] args) {
    System.out.println(args.length);
    System.out.println("--------------------");
    int i1 = Integer.parseInt(args[0]);
    int i2 = Integer.parseInt(args[1]);
    if (i1 > i2){
      System.out.println("args[0] : " + args[0]);
    } else {
      System.out.println("args[1] : " + args[1]);
    }
  }
}
  /*
  */
