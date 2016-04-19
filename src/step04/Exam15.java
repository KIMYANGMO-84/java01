/* 주제 : 명시적 형변환과 암시적 형변환*/
package step04;

public class Exam15 {
    public static void main(String[] args){
      int i = 5;
      int b = 2;
      float f = (float)i / (float)b; // 명시적 형변환 수행
      System.out.println(f); // 2.0

  }
}

/* 명시적 형변환
=> (원하는타입) 변수
=> 주의!
   작은 크기의 값을 큰 메모리 타입으로 바꾸는 것은 가능하나
   큰 크기의 값을 작은 메모리의 타입으로 바꾸려 한다면, 값이 짤리는 문제가 발생한다.

형변환 가능 타입
=> 정수 --> 실수
=> 실수 --> 정수
=> 논리값 -x-> 정수, 실수
=> 정수, 실수 -x-> 논리값
=> primitive type -x-> 물건(object)(허용안됨)=> 단, 특별한 method를 사용하면 가능
=> 물건(object) -x-> primitive type(허용안됨)=> 단, 특별한 method를 사용하면 가능

*/
