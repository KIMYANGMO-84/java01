/* 주제 : 배열의 선언*/
package step02;

public class Exam05 {
    public static void main(String[] args){
      // 국어, 영어, 수학 점수를 개별적으로 저장
      int kor, eng, math;

      // 배열을 사용
      int[] scores = new int[3];
      char[] chars = new char[10];
      boolean [] tf = new boolean[5];
      float[] avers = new float[10];
      double[] money = new double[100];
      byte[] bytes = new byte[1024];
      short[] s = new short[30];
      long[] ll = new long[345];
  }
}

/* 배열(array)
- 같은 종류의 메모리를 여러 개 준비하는 명령어
- 문법
  데이터 타입[] 배열의 별명 = new 데이터타입[개수];
  예) int[] a = new int[20];
  예) int a[] = new int[20]; <--- c언어 방식의 문법으로 추천하지 않는다.
- 배열은 new 명령으로 생성해야 한다.
*/
