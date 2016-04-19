package step26.exam04;

import java.io.FileWriter;
import java.io.Writer;

public class Test2 {
  public static void main(String[] args) throws Exception {     
    // Object 레퍼런스가 하위 타입의 객체를 가리키는 것 처럼
    // 제네릭 변수도 다양한 객체를 가킬 수 없는가?
    
    // wildcard 타입을 지정하면 된다.
    Box<?> r1 = new Box<String>();
    r1 = new Box<Integer>();
    r1 = new Box<Writer>();
    
    Box<?> r2 = new Box<String>();
    //wildcard 레퍼런스는 제네릭의 편의성을 활용하지 못하게 한다.
    // String s = (String)r2.getValue(); <<와 같이 형변환을 해야 한다.
  }
}


/* # 제네릭 사용 후?
 * 1) 컴파일 할 때 데이터형을 엄격히 검사할 수 있다.
 * 2) 값을 꺼낼 때 마다 형변환 할 필요가 없다.
 * 
 */