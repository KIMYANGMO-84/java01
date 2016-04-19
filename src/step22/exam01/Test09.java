// 주제 : 주어진 폴더를 뒤져서 중첩 클래스 파일만 이름을 출력하라
// > java -cp bin step22.exam01.Test08 ./bin ../project01/bin

package step22.exam01; 

import java.io.File;
import java.io.IOException;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.sql.Date;

public class Test09 {
  public static void main(String[] args) throws IOException {
    File f;
    for (int i = 0; i < args.length; i++) {
      f = new File(args[i]);
      printFilename(f, "$");
    }
  }


  public static void printFilename(File file, String ext) {
    if (file.isFile()) {
      if (file.getName().contains(ext)) {
        System.out.println();
      }
    } else {
      File[] list = file.listFiles();
      for (File fileList : list) {
        printFilename(fileList, ext);
      }
    }
  }
}



/*

*/
