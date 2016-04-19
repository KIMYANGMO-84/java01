// 주제 : .txt 확장자를 갖는 파일명만 출력하라
package step22.exam01; 

import java.io.File;
import java.io.IOException;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.sql.Date;

public class Test06 {
  public static void main(String[] args) throws IOException {
    File f = new File("."); // 현재 경로
    // 파일 필터 클래스 정의

    // 현재 폴더의 파일과 디렉토리 이름을 모두 출력한다.
    File[] file = f.listFiles(new FilenameFilter(){
      @Override
      public boolean accept(File file, String name) {
        File temp = new File(file, name);
        if (temp.isFile() && name.endsWith(".txt")) {
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
