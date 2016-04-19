package step01;

//  주제 : 주석 


/** javadoc 주석
  - 소스 파일에서 이 주석을 추출하여 HTML API 문서를 만든다.
  - $JAVA_HOME/bin/javadoc.exe 가 이 주석을 사용하는 문서생성기 이다.
    이 사이에 있는 텍스트는 HTML 문서를 만들 때 사용된다.
    클래스 앞에 선언하여 해당 클래스에 대한 정보를 제공한다.
*/
public class Exam00 {
  /** 인스턴스 변수 앞에 선언하여
      변수에 대한 정보를 제공한다.
  */
  int i;

  /** method앞에 선언하여 해당 method에 대한 정보를 제공한다.
  */
  public static void main(String[] args){
    System.out.println("Hello World"); // 모니터 출력 명령어
  }
/*애노테이션
- 컴파일러나 JVM에게 명령잉나 값을 전달하는 아주 특별한 주석
- @애노테이션 이름(속성 = 값, 속성=값,````)
*/
@Override // <---애노테이션
  public String toString(){
    return "okok";
  }
}

// 주석의 종류
/* 1) 여러 줄 주석
     이사이에 있는 모든 내용은 주석으로 간주한다.
     컴파일러가 무시
*/

// 2) 한 줄 주석 : 해당 라인만 주석으로 취급한다.
/* 3) javadoc 문서 생성 주석
- 클래스나
4) 애노테이션
*/
