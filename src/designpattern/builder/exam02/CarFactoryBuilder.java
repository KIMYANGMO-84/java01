package designpattern.builder.exam02;

import java.util.HashMap;

public class CarFactoryBuilder {
  
  public CarFactory build(String bluePrint) {
    //blueprint 형식 "key,model,cc;key,model,cc"
    HashMap<String, Car> carMap = new HashMap<>();
    String[] carInfos = bluePrint.split(";");
    for(String carInfo : carInfos) {
      carMap.put(getKey(carInfo), generate(carInfo));
    }
    
    CarFactory factory = new CarFactory();
    factory.setCarMap(carMap);
    return factory;
  }
  private String getKey(String carInfo) {
    // carInfo : "key,model,cc"
    return carInfo.split(",")[0];
  }
  
  private Car generate(String carInfo) {
    // carInfo : "key,model,cc"
    String[] values = carInfo.split(",");
    Car c = new Car();
    c.model = values[1];
    c.cc = Integer.parseInt(values[2]);
    return c;
  }
}
