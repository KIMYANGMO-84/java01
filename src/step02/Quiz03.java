/* 퀴즈 : 다음 값을 저장할 수 있는 변수를 선언하시오!
- 학생 30명의 국어, 영어, 수학, 평균, 합계 점수를 저장할 변수
- 인덱스 5번 학생의 점수를 저장하라. 점수는 다음과 같다.
국어 100, 영어 90, 수학 50
- 인덱스 5번 학생의 국어, 영어, 수학, 합계, 평균을 출력하라.
*/
package step02;
/*public class Quiz03 {
  public static void main(String[] agrs){
    int[][] scores = new int[30][4];
    float[] avers = new float[30];

    scores[5][0] = 100;
    scores[5][1] = 90;
    scores[5][2] = 50;
    scores[5][3] = scores[5][0] + scores[5][1] + scores[5][2];
    avers[5] = scores[5][3] / 3;
    System.out.printf("%d %d %d %d %f\n", scores[5][0], scores[5][1], scores[5][2], scores[5][3], avers[5]);

  }
}
*/

  public class Quiz03{
    public static void main(String[] args){
      int[][] scores = new int[30][4];
      float[] avers = new float[30];

      scores[5][0] = 100;
      scores[5][1] = 90;
      scores[5][2] = 50;
      scores[5][3] = scores[5][0] + scores[5][1] + scores[5][2];
      avers[5] = scores[5][3] / 3;

      System.out.printf("%d %d %d %d %f\n", scores[5][0], scores[5][1], scores[5][2], scores[5][3], avers[5]);
    }
}
