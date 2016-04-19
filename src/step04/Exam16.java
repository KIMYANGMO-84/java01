/* 주제 : 명시적 형변환과 암시적 형변환*/
package step04;

public class Exam16 {
    public static void main(String[] args){
      float i = 5f;
      int b = 2;
      float f = i / b; // 명시적 형변환 수행
      System.out.println(f); // 2.0

  }
}

/* 암시적 형변환
=> float / int : 연산불가!
=> int 값을 float으로 바꿔서 나누기 연산을 수행한다.
=> how?
   float 임시 메모리를 만들어 b의 값을 저장하고
   a와 임시 메모리 값을 연산한다.
   float / int
          임시 float 메모리에 int 값을 넣어 float값을 생성
  float / 임시 float 메모리에 저장된 int값

정적 타입 바인딩(static type binding) *java
=> 한 번 변수의 타입이 결정되면 절대 바뀌지 않는다.
=> int i = 10;
      i  = "Hello"; <-- 컴파일 오류

동적 타입 바인딩(dynamic type binding)
=> 값을 저장할 때 변수의 타입이 결정된다.
=> 다른 타입의 값으로 변경하면 변수의 타입도 변경된다.
=> var i = 10; // Integer
    i = "Hello"; // String으로 변경됨
*/
