/* 주제 : String 주요 도구 사용법3 - static method */
package step03;

public class Exam09 {
    public static void main(String[] args){
        String s1 = "국어";
        String s2 = "영어";
        String s3 = "수학";
        String s4 = String.format("%s\t%s\t%s\n", s1, s2, s3);
        System.out.println(s4);
        int i = s1.compareTo(s2);
        System.out.println(i);
    }
}

/* 도구(method)의 종류
=> static method
  - 클래스 이름으로 바로 사용할 수 있는 도구
  - 특정 물건에 상관없이 사용 가능
  - 예) String.format()

=> instance method
  - 반드시 물건이 있어야만 사용할 수 있는 도구
  - 특정 물건에 대해 작업을 수행한다.
  - 예) s1.concat(), replace()

API 문서를 보고 method가 static인지 instance인지 알아내기
=> method signature에 static이 선언되어 있으면 static method 이다.
=> 그 외는 모두 인스턴스(non-static) method이다.
*/
