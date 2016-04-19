// 주제 : 디렉토리에 있는 모든 파일 목록을 알아내기(디렉토리 제외)
package step22.exam01;

import java.io.File;
import java.io.IOException;
import java.io.FileFilter;
import java.sql.Date;

public class Test05 {
  public static void main(String[] args) throws IOException {
    File f = new File("."); // 현재 경로
    // 파일 필터 클래스 정의

    // 현재 폴더의 파일과 디렉토리 이름을 모두 출력한다.
    File[] file = f.listFiles(new FileFilter(){
      @Override
      public boolean accept(File file) {
        if (file.isFile()) {
          return true;
        } else {
         return false;
        }
      }
    });
    for (File fileList : file) {
        System.out.println(fileList);
    }
  }
}

/*

*/
