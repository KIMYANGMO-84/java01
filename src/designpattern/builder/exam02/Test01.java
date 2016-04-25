//주제 : Builder 패턴 적용 후
// => 복잡한 복합 객체를 준비할 때 사용하는 패턴이다.
//      => 여러 객체를 조립하여 한 객체를 준비한다는 의미
// => 복잡한 단순 객체는 "Factory Method" 패턴을 사용하라!
package designpattern.builder.exam02;

public class Test01 {

  public static void main(String[] args) {
    //1) 자동차 공장을 만들어주는 건설사 객체를 준비한다.    
    //2) 설계도를 바탕으로 자동차 공장을 준비
    CarFactory factory =new CarFactoryBuilder().build(
        "tico,티코2,900;sonata,소나타2,1999;equs,에쿠스골드,3500");
    
    // 티코 객체 생성
    Car c1 = factory.createCar("tico");
    
    // 소나타 객체 생성
    Car c2 = factory.createCar("sonata");
    
    Car c3 = factory.createCar("equs");
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
  }

}

/* # 팩토리 메서드 설계 패턴
 * - 객체 생성 과정이 복잡한 경우, 매번 직접 객체를 생성하기 보다는
 *  메서드를 통해 객체를 얻는 것이 유지보수에 좋다.
 * - 메서드를 통해 객체를 생성하는 설계방식을 "Factory Method"패턴이라 부른다.
 * 
 * */
