// 주제 : 바이트 출력하기
package step22.exam02;

import java.io.File; 
import java.io.FileOutputStream;
import java.io.IOException;


public class Test01 {
  public static void main(String[] args) throws IOException {
    FileOutputStream out = new FileOutputStream("exam02.Test01.data");

    int value = 0x2a3b4c5d; // 708,529,245
    for (int i = 0; i < 3; i++) {
      out.write(value);
      value = value >> 8;
    }
    out.write(value);// 비록 파라미터 타입이 int라 하더라도 맨 끝 1바이트만 출력

    // 주의! OS 자원을 사용하는 경우, 사용 후 반드시 해제해야 한다.
    out.close();
  }
}

/*
Stream H/W에 상관없이 일관된 data 입출력을 위해 만든 API
# 자바 입출력
- data streaming 개념을 지원한다.
  즉 대상이 누구냐에 상관없이 단숭히 데이터 입출력 흐름으로 보는 것.
- 특징
 1) 입력과 출력 역할을 분리하였다.
 2) 바이트 스트림과 문자 스트림으로 구분하였다.
 3) 데이터를 목적지에 직접 읽고 쓰는 클래스와 중간에서 데이터를 처리하는 클래스로 구분
- 주요 클래스
 1) InputStream/OutputStream : 바이트 스트림을 다루는 추상 클래스.
  => Data Sink Stream Class (직접 읽고 쓰기)
    FileInputStream/FileOutputStream --> File에서 데이터를 읽고 쓰기 I/O 대상이 파일이다
    ByteArrayInputStream/ByteArrayOutputStream --> I/O 대상이 바이트 배열
    PipedInputStream/PipedOutputStream --> I/O 대상이 프로세스(다른 프로그램)
  => Data Processing Stream Class (중간에 데이터 가공)
    BufferedInputStream/BufferedOutnputStream --> 버퍼를 이용한 입출력 속도 개선
    DataInputStream/DataOutputStream --> 원시타입 등의 데이터를 입출력하기 쉽다.
    ObjectInputStream/ObjectOutputStream --> 인스턴스 입출력.
    PrintStream -> 바이트및 문자 출력 가능
    나머지 모두...
 2) Reader/Writer : 문자 스트림을 다루는 추상 클래스.
  => Data Sink Stream Class (직접 읽고 쓰기)
    FileReader/FileWriter --> I/O대상이 파일.
    CharArrayReader/CharArrayWriter --> I/O대상이 Char배열.
    StringReader/StringWriter --> I/O대상이 String
    PipedReader/PipedWriter I/O 대상이 프로세스(다른 프로그램)
  => Data Processing Stream Class (중간에 데이터 가공)
    BufferdReader/BufferdWriter --> 버퍼를 이용한 입출력 속도 개선
    PrintWriter --> 바이트및 문자 출력 가능


자바란
Write Once, Run Anywhere
  자바 언어로 작성한 코드를 자바컴파일러가 바이트코드로 변환하고
  이 바이트 코드를 JVM을 이용하여 실행시키게 됨
  따라서 어느 운영체제에서든 JVM을 설치할수 있다면 어디서든 실행이 가능
개발자란
  사람이 살아가면서 부딪히게 되는 불편한 문제점들을 해결해주는 사람
extends 와 implement
  클래스 상속 / 인터페이스 상속
오버라이딩 과 오버로딩
  서브 클래스에서 슈퍼 클래스의 메소드를 다른 방식으로 사용하고 싶을때
  동일한 메소드 이름으로 재정의 하는것을 오버라이딩이라 한다.
  오버 로딩은 메소드를 동일한 이름으로 여러가지 방식으로 사용하고 싶을때
  같은 이름으로 메소드를 재정의 하는것을 오버 로딩이라 한다
추상클래스 인터페이스



*/
