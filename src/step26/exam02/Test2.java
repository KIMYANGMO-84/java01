package step26.exam02;

import java.util.Date;

public class Test2 {
  public static void main(String[] args) {
    //다양한 타입으로 사용하기    
    Box<String> box1 = new Box<>();
    Box<Integer> box2 = new Box<>();
    Box<Date> box3 = new Box<>();
    Box<Object> box4 = new Box<>();
    
    box1.setValue("문자열");
    box2.setValue(20);
    box3.setValue(new Date());
    // 지정된 타입 외의 값을 저장하면 컴파일 오류 발생
//    box1.setValue(20);
//    box2.setValue("20");
//    box3.setValue(true);
    // Object 형식은 항상 다형적 변수의 활용법에 따라 하위 객체를 저장할 수 있다.
    box4.setValue("문자열");
    box4.setValue(20); // --> auto-boxing
    box4.setValue(new Date());
    box4.setValue(true); // --> auto-boxing
  }
}


/* # 제네릭 사용 후?
 * 1) 컴파일 할 때 데이터형을 엄격히 검사할 수 있다.
 * 2) 값을 꺼낼 때 마다 형변환 할 필요가 없다.
 * 
 */