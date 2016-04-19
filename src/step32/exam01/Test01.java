package step32.exam01;

public class Test01 {

  public static void main(String[] args) throws Exception {    
    // Carfactory 추상클래스의 스태틱 메서드를 호출할 수 있다.
    CarFactory factory = CarFactory.newInstance();
    
    // 실제 CarFactorydml newInstance()가 리턴하는 객체는
    // VM 아규먼트의 -D옵션으로 지정된
    // step32.exam01.bit.CarFactoryImpl 인스턴스이다.
    System.out.println(factory.getClass().getName());

    Car c1 = factory.newCar("tico");
    Car c2 = factory.newCar("sonata");
    
    System.out.println(c1);
    System.out.println(c2);
  }

}

/* 
 * 
 */
