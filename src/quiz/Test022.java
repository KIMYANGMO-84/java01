package quiz;
//copyright by codefights.com
//한 줄에 버그가 있다. 고쳐라!
/*
Find the largest number from the given three integers

[input] integer a

[input] integer b

[input] integer c

[output] integer

max of a,b and c
 */
public class Test022 {
  static int myMaxOfThree(int a, int b, int c) {
    if (a > b && a > c) {
        return a;
      } else if (b > a && b > c) {
        return b;
      } else {
        return c;
      }    
  }
  public static void main(String[] args) {
    int a = (int) (Math.random()*10);
    int b = (int) (Math.random()*10);
    int c = (int) (Math.random()*10);
    System.out.printf("%d, %d, %d", a, b, c);
    System.out.println(myMaxOfThree(a, b, c)); //결과는 8이어야 한다.

  }

}
