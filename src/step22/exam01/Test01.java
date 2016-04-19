// 주제 : 파일 정보 다루기
package step22.exam01;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

public class Test01 {
  public static void main(String[] args) throws IOException {
    File f = new File("../project00/src/bitcamp/pms/ProjectApp.java"); // 현재 경로
    System.out.printf("getName() : %s\n", f.getName()); //파일 명만 출력
    System.out.printf("getPath() : %s\n", f.getPath()); // 사용자가 지정한경로 출력
    System.out.printf("getAbsolutePath() : %s\n", f.getAbsolutePath()); // 전체 경로 출력
    System.out.printf("getCanonicalPath() : %s\n", f.getCanonicalPath());
    //. 또는 ..에 대해 계산을 완료한 경로
    // . => 현재폴더
    // .. => 상위 폴더
    System.out.printf("getParent() : %s\n", f.getParent()); // 파일인 경우 폴더를 가리킨다.
    System.out.printf("length() : %s\n", f.length()); // 파일의 크기 출력(byte)
    System.out.printf("toURI() : %s\n", f.toURI());
    System.out.printf("isFile() : %s\n", f.isFile()); //파일 및 디렉토리 여부 검사
    System.out.printf("isDirectory() : %s\n", f.isDirectory()); //파일 및 디렉토리 여부 검사
    System.out.printf("exists() : %s\n", f.exists()); // 파일의 존재여부 검사
    System.out.printf("getTotalSpace()  : %s\n", f.getTotalSpace());
    System.out.printf("getFreeSpace()   : %s\n", f.getFreeSpace());
    System.out.printf("getUsableSpace() : %s\n", f.getUsableSpace());

    // 파일 작성일 또는 마지막으로 변경한 날짜
    long millis = f.lastModified();
    Date date = new Date(millis);
    System.out.printf("lastModified() : %s\n", date.toString());
  }
}

/*
# 파일의 위치 정보 표현
1) path
  - OS의 파일 시스템 경로 정보이다
  - 예) 윈도 => c:\Program Files\Java\jdk1.8.0_74
  - 예) 리눅스 => /usr/local/jdk1.8.0_74
2) URI(Uniform Resource Indicator)
  - 웹 주소 형태로 표현하는 경로 정보이다.
  - 예) 윈도 => file://c:/program+Files/Java/jdk1.8.0_74
  - 예) 리눅스 => file:///usr//local/jdk1.8.0_74

# URI, URL, URN
- URI(Uniform Resource Indicator)
  => 네트워크 상에 있는 자원의 주소를 표현하는 방법
  => 표현 방법
    1) URL(Uniform Resource Locator)
      프로토콜://서버주소:포트번호/.../자원경로
      예) http://www.bitcamp.co.kr/board/index/html
    2) URN(Uniform Resource Name)
      예) urn:ISSN:0167-6423
*/
