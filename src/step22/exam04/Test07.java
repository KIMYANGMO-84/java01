// 주제 : 원시 타입 값을 출력하기 - 코드 개선(Decorator 패턴)
package step22.exam04;
 
import java.io.IOException;
import java.io.FileOutputStream;


public class Test07 {
  public static void main(String[] args) throws IOException {
    // 실제 작업을 수행할 객체를 준비한다.
    FileOutputStream out = new FileOutputStream("exam04.Test07.data");

    //작업할 객체에 보조 기능을 장착한다.
    // => 보조 기능을 가진 객체를 "데코레이터(decorator)"라 부른다.
    // => 보조 기능은 필요할때 언제나 붙일 수 있다.
    //    필요 없으면 떼면 된다.
  //  OutputStreamDecorator1 d1 = new OutputStreamDecorator1(out);
    OutputStreamDecorator2 d2 = new OutputStreamDecorator2(out);

    short no = 17;
    int kor = 100;
    int eng = 89;
    int math = 75;

    //d1.writerShort(no);
    d2.writerInt(kor);
    d2.writerInt(eng);
    d2.writerInt(math);

    // 주의! OS 자원을 사용하는 경우, 사용 후 반드시 해제해야 한다.
    out.close();
  }

}

/*

*/
