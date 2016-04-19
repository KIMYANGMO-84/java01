// 주제 : 원시 타입 값을 출력하기 - 코드 개선(상속)
package step22.exam04; 

import java.io.IOException;


public class Test06 {
  public static void main(String[] args) throws IOException {
    MyDataOutputStream4 out = new MyDataOutputStream4("exam04.Test06.data");

    short no = 17;
    int kor = 100;
    int eng = 89;
    int math = 75;

    out.writerShort(no);
    out.writerInt(kor);
    out.writerInt(eng);
    out.writerInt(math);

    // 주의! OS 자원을 사용하는 경우, 사용 후 반드시 해제해야 한다.
    out.close();
  }

}

/*

*/
