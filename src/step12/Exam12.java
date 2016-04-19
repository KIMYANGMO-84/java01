/* 주제 : 스태틱 변수의 활용*/

package step12;

public class Exam12 {
  public static void main(String[] args) {
    //Car9.model = "tico";
    System.out.println(Car9.model);


  }
}

/*
# 변수 앞에 final을 붙이는 경우
- 주소 조회용 값을 저장하고 싶을 때
- 클래스가 로딩될 때 딱 한번만 만들기 위해
  static과 함께 사용한다.
*/
