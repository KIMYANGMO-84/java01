package step12;

public class Car6 {
  // 모든 인스턴스가 공유하는 데이터는 스태틱 변수에 보관하라.
  static int count;

  private int carNumber;
  private String model;
  private String brand;
  private int cc;
  private int pp;

  //인스턴트 블록 - 인스턴스가 생성될때 실행되므로 생성자보다 먼저 실행됨
  {
    this.carNumber = ++count;
  }
  public Car6() {} // 오버로딩

  public Car6(String model, String brand, int cc, int pp) {
    this.setModel(model);
    this.setBrand(brand);
    this.setCc(cc);
    this.setPp(pp);
  }
  public int getCarNumber() {
    return this.carNumber;
  }

  public String getModel() {
    return this.model;
   }
  public void setModel(String model) {
    this.model = model;
  }

  public String getBrand() {
    return this.brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getCc() {
    return this.cc;
  }

  public void setCc(int cc) {
    if (cc > 0 && cc <= 10000) {
    this.cc = cc;
    }
  }

  public int getPp() {
    return this.pp;
  }

  public void setPp(int pp) {
    if (pp > 0 && pp <= 100) {
    this.pp = pp;
    }
  }


}
