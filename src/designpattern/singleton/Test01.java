//주제 : 싱글톤 패턴 적용
package designpattern.singleton;

public class Test01 {

  public static void main(String[] args) {
    //싱글톤 방식으로 객체 생
    CarFactory factory = CarFactory.newInstance();
    CarFactory factory2 = CarFactory.newInstance();
    CarFactory factory3 = CarFactory.newInstance();

    if (factory == factory2 && factory2 == factory3) {
      System.out.println("factory factory2 factory3 은 같다");
    }
    // 티코 객체 생성
    Car c1 = factory.newCar("tico");
    
    // 소나타 객체 생성
    Car c2 = factory.newCar("sonata");
    
    
    System.out.println(c1);
    System.out.println(c2);
  }

}

/* # 싱글톤 패턴
 * - 객체를 오직 한 개만 생성하도록 제어하고 싶을 경우.
 * - 최근에는 싱글톤 패턴을 지양한다.
 *   이유? 빈(bean) 컨테이너로 객체를 관리하기 때문이다
 * 
 * */
