package step33.exam06;

import java.util.Map;

public class Car {
  String model;
  String maker;
  Map<String,Object> specs;
  
  public Car() {
    System.out.println("기본생성자");
  }
  
  public void setSpecs(Map<String, Object> specs) {
    this.specs = specs;
  }
  
  @Override
  public String toString() {
    return "Car [model=" + model + ", maker=" + maker + ", specs=" + specs + "]";
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    System.out.println("setModel() 호출");
    this.model = model;
  }  

  public String getMaker() {
    return maker;
  }

  public void setMaker(String maker) {
    System.out.println("setMaker() 호출");
    this.maker = maker;
  }

}