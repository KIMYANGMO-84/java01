// 주제 : 파일 생성 삭제
package step22.exam01;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

public class Test02 {
  public static void main(String[] args) throws IOException {
    File f = new File("./test02.txt"); // 현재 경로
    // f.createNewFile(); // 동일한 이름의 파일이 없으면 생성, 있으면 생성하지 않음
    // f.delete(); //동일한 이름의 파일이 있으면 삭제
    File f2 = new File("./testok.txt");
    // f.renameTo(f2);
    // f.mkdir();
    if (f.delete()) {
      System.out.println("삭제 성공");
    } else {
      System.out.println("삭제 실패");
    }
  }
}

/*

*/
