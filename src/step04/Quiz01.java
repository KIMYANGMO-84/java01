/* 문제 :
개인이 좋아하는 영화 장르를 저장하고 출력하는 프로그램을 작성하라.
=> 장르의 선호 여부를 표현할 때 비트로 표현할 것.
=> 비트 연산자를 이용하여 검사할 것.
=> 참고 예제 : Exam06
장르 :
범죄, 드라마, 코미디, 로맨스, 스릴러,
가족, 판타지, 액션, SF, 애니메이션,
다큐멘터리, 공포

테스트 데이터:
=> 홍길동이 좋아하는 장르 : 드라마, 액션, SF, 다큐멘터리
*/

package step04;

public class Quiz01{
  public static void main(String[] args){
    // 이름 홍길동과 좋아하는 장르 선언
    String[] genre = {"범죄", "드라마", "코미디", "로맨스", "스릴러",
    "가족", "판타지", "액션", "SF", "애니메이션", "다큐멘터리", "공포"};
    String name = "홍길동";
    int likegenre = 0b0100_0001_1010; // 0x41A

    // 좋아하는 장르를 검사할 마스크 선언
    // 16진수를 2진수로 변환할때 4비트씩 끊어서 변환하면 쉽다
    int g1 = 0b1000_0000_0000; // 0x800
    int g2 = 0b0100_0000_0000; // 0x400
    int g3 = 0b0010_0000_0000; // 0x200
    int g4 = 0b0001_0000_0000; // 0x100
    int g5 = 0b0000_1000_0000; // 0x80
    int g6 = 0b0000_0100_0000; // 0x40
    int g7 = 0b0000_0010_0000; // 0x20
    int g8 = 0b0000_0001_0000; // 0x10
    int g9 = 0b0000_0000_1000; // 0x8
    int g10 = 0b0000_0000_0100; // 0x4
    int g11 = 0b0000_0000_0010; // 0x2
    int g12 = 0b0000_0000_0001; // 0x1

    System.out.println(name + "이 좋아하는 장르는?");

    // 좋아하는 장르를 체크하는 조건문
    if ((likegenre & g1) == g1)
      System.out.println(genre[0]);
    if ((likegenre & g2) == g2)
      System.out.println(genre[1]);
    if ((likegenre & g3) == g3)
      System.out.println(genre[2]);
    if ((likegenre & g4) == g4)
      System.out.println(genre[3]);
    if ((likegenre & g5) == g5)
      System.out.println(genre[4]);
    if ((likegenre & g6) == g6)
      System.out.println(genre[5]);
    if ((likegenre & g7) == g7)
      System.out.println(genre[6]);
    if ((likegenre & g8) == g8)
      System.out.println(genre[7]);
    if ((likegenre & g9) == g9)
      System.out.println(genre[8]);
    if ((likegenre & g10) == g10)
      System.out.println(genre[9]);
    if ((likegenre & g11) == g11)
      System.out.println(genre[10]);
    if ((likegenre & g12) == g12)
      System.out.println(genre[11]);
  }
}
