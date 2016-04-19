package step26.exam03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Test {
  public static void main(String[] args) throws Exception {     
    // Box<String> box1 = new Box<>(); // Wirter를 상속받지 않아 형식지정 오류 발생
    // Box<Object> box2 = new Box<>()
    Box<FileWriter> box3 = new Box<>();
    box3.setValue(new FileWriter(""));
    Box<Writer> box4 = new Box<>();
    box4.setValue(new FileWriter(""));
    box4.setValue(new BufferedWriter(null));
    
    
  }
}


/* # 제네릭 사용 후?
 * 1) 컴파일 할 때 데이터형을 엄격히 검사할 수 있다.
 * 2) 값을 꺼낼 때 마다 형변환 할 필요가 없다.
 * 
 */