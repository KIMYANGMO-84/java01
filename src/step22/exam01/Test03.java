// 주제 : 디렉토리에 있는 모든 파일(디렉토리 포함) 목록을 알아내기
package step22.exam01;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

public class Test03 {
  public static void main(String[] args) throws IOException {
    File f = new File("."); // 현재 경로
    String[] list = f.list();
    // 현재 폴더의 파일과 디렉토리 이름을 모두 출력한다.    
    for (Object fileList : list) {
      System.out.println(fileList);
    }

  }
}

/*

*/
