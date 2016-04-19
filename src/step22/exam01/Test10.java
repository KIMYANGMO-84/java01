// 주제 : 주어진 폴더를 뒤져서 중첩 클래스 파일만 이름을 출력하라
// > java -cp bin step22.exam01.Test08 ./bin ../project01/bin

package step22.exam01; 

import java.io.File;
import java.io.IOException;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.sql.Date;
import java.util.Scanner;
public class Test10 {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    String input;
    File f;
    System.out.print("찾을 문자열 입력 : ");
    input = sc.nextLine().toLowerCase();
    for (int i = 0; i < args.length; i++) {
      f = new File(args[i]);
      printSearchClass(f, input);
    }
  }

  public static void printSearchClass(File file, String word) throws IOException {
    if (file.isFile()) {
      if (file.getName().contains(word)) {
        System.out.println(file.getCanonicalPath());
      }
    } else {
      File[] list = file.listFiles();
      for (File folderList : list) {
        printSearchClass(folderList, word);
      }
    }
  }
}



/*

*/
