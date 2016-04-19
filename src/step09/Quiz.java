package step09;
public class Quiz {
  static int testFraction(int[] n, int[] d) {
    int index=0;
    for (int i = 1; i < n.length; i++) {
      if (n[index] * d[i] < n[i] * d[index]) {
        index = i;
      }
    }
    return index;
  }

  public static void main(String[] args) {
    int index = testFraction(new int[]{5, 2, 5, 2, 9}, new int[]{6, 3, 4, 8, 2});
    System.out.println(index);
  }
}
