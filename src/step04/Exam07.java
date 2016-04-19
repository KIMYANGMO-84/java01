/* 주제 : 비트 이동 연산자*/
package step04;

public class Exam07 {
    public static void main(String[] args){
      //왼쪽으로 비트를 이동시키기
      int a = 0b0000_1100; // 0x0c =12
      System.out.println(a << 1); // 0001_100x => 빈자리는 0으로 채워진다.
      System.out.println(a << 2); // 0011_00xx => 빈자리는 0으로 채워진다.
      System.out.println(a << 3); // 0110_0xxx => 빈자리는 0으로 채워진다.

      // 왼쪽으로 x 비트 만큼 이동 ==> 값 * 2^x 한 것과 같다
      // 곱하기를 하는 것 보다 실행 속도가 빠르다.

      // 오른쪽으로 비트를 이동시키기 => 값/2^x 나눗셈을 수행한 것 보다 더 계산 속도가 빠르다.
      int b = 0b1100_0000; // 0xc0 == 192
      System.out.println(b);
      System.out.println(b >> 1); // x110_0000|0 => 넘어간 비트는 버린다.
      System.out.println(b >> 2); // xx11_0000|00 => 빈자리는 부호 비트로 채운다.
      System.out.println(b >> 3); // xxx1_1000|000 => +값은 0, -는 1
      // 음수의 이동

      b = -3;
      System.out.printf("%s =======> %d\n",Integer.toBinaryString(b), b);
      System.out.printf("%s =======> %d\n", Integer.toBinaryString(b >> 1), b >> 1);

      // 오른쪽으로 이동시키는 특별한 연산 >>>
      // => 빈자리를 무조건 0으로 채운다.
      // => 양수를 오른쪽으로 이동하는 경우 >> 와 결과가 같다.
      // => 그러나 음수의 경우 양수의 변환된다.
      System.out.printf("%s =======> %d\n",Integer.toBinaryString(b), b);
      System.out.printf("%s =======> %d\n", Integer.toBinaryString(b >>> 1), b >>> 1);
      System.out.printf("%s =======> %d\n", Integer.toBinaryString(b >>> 2), b >>> 2);
  }
}

/*
비트연산자에서 &연산자 사용시 비트값을
1111을 주면 그대로 통과시키는 효과를 주고
0000을 주면 0으로 막는 효과를 준다
*/
