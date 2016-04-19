package step26.exam02;

public class Test {
  public static void main(String[] args) {
    Box<String> box = new Box<>();
    box.setValue("문자열");
    //box.setValue(new Date());
    //box.setValue(10); // <--- auto-boxing
    
    String s = box.getValue();
  }
}


/* # 제네릭 사용 후?
 * 1) 컴파일 할 때 데이터형을 엄격히 검사할 수 있다.
 * 2) 값을 꺼낼 때 마다 형변환 할 필요가 없다.
 * 
 */