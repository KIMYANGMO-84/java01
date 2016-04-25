package step33.exam04;

public class Car {
  String model;
  String maker;
  Engine engine ;
  
    
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    System.out.println("setModel() 호출");
    this.model = model;
  }  

  public void setEngine(Engine engine) {
    System.out.println("setEngine() 호출");
    this.engine = engine;
  }

  @Override
  public String toString() {
    return "Car [model=" + model + ", engine=" + engine + ", maker=" + maker + "]";
  }

  public String getMaker() {
    return maker;
  }

  public void setMaker(String maker) {
    System.out.println("setMaker() 호출");
    this.maker = maker;
  }

  public Car() {
    System.out.println("기본생성자");
  }

}