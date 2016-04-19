// 주제 : 주어진 폴더를 뒤져서 중첩 클래스 파일만 이름을 출력하라
// > java -cp bin step22.exam01.Test08 ./bin ../project01/bin

package step22.exam01; 

import java.io.File;
import java.io.IOException;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.sql.Date;

public class Test08 {
  public static void main(String[] args) throws IOException {
    File f;
    for (int i = 0; i < args.length; i++) {
      f = new File(args[i]);
      printFilename(f, "$");
    }
  }

  static void printFilename(File f, String ext) throws IOException {
    if (f.isFile()) {
      if (f.getName().contains(ext)) {
        System.out.println(f.getCanonicalPath());
      }
    } else {
      File[] files = f.listFiles();
      for (File file : files) {
        printFilename(file, ext);
      }
    }
  }
}



/*

*/
