
package step32.exam01;

public abstract class CarFactory {
  public static CarFactory newInstance() throws Exception {    
    String className = System.getProperty("CarFactory");
    Class<?> clazz = Class.forName(className);
    return (CarFactory)clazz.newInstance();
  } 
  
  
  public abstract Car newCar(String name); 
//{
//    Car c = new Car();
//    
//    switch (name) {
//    case "tico":
//      c.model = "티코";
//      c.cc    = 800;
//      return c;
//    case "sonata":
//      c.model = "소나타";
//      c.cc    = 1997;
//      return c;
//    default:
//      return null;      
//    }
//  }
}
