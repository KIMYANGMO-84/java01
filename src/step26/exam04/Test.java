package step26.exam04;

import java.io.FileWriter;
import java.io.Writer;

public class Test {
  public static void main(String[] args) throws Exception {     
    // => 항상 상위 타입의 레퍼런스는 하위 타입을 가리킬 수 있다. 
    Object r1 = new FileWriter("");
    Writer r2 = new FileWriter("");
    FileWriter r3 = new FileWriter("");
    
    //Box<Object>는 Box<String>의 상위 타입이 아니다.
    //Box<Object> b2 = new Box<String>();
    //Box<FileWriter> b2 = new Box<Writer>();
    
  }
}


/* # 제네릭 사용 후?
 * 1) 컴파일 할 때 데이터형을 엄격히 검사할 수 있다.
 * 2) 값을 꺼낼 때 마다 형변환 할 필요가 없다.
 * 
 */