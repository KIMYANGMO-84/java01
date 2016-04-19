package step13;
/* 문제2) 주어진 수를 오름차순으로 정렬하시오
*/
public class Quiz04 {
  public static void main(String[] args) {
    System.out.println(args.length);
    System.out.println("--------------------");
    int[] arri = new int[args.length];
    for (int i = 0; i < args.length; i++) {
        arri[i] = Integer.parseInt(args[i]);
        for (int j = 0; j < args.length; j++) {
          if (arri[j] > arri[i]){
          int temp = arri[j];
          arri[j] = arri[i];
          arri[i] = temp;
        }
      }
    }
    for (int value : arri) {
      System.out.println(value);
    }
  }
}
  /*
  */
