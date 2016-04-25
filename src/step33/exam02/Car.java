package step33.exam02;

public class Car {
  String model;
  int    cc;
  String maker;  
  
  public Car(String model, int cc) {    
    System.out.println("model, cc 생성자");
    this.model = model;
    this.cc = cc;
  }

  public Car(String model, String maker) {
    System.out.println("model, maker 생성자");
    this.model = model;
    this.maker = maker;
  }

  public Car(String model, int cc, String maker) {
    System.out.println("model, cc, maker 생성자");
    this.model = model;
    this.cc = cc;
    this.maker = maker;
  }

  public Car() {
    System.out.println("기본생성자");
  }

  @Override
  public String toString() {
    return "Car [model=" + model + ", cc=" + cc + ", maker=" + maker + "]";
  }
  
}