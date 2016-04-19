package step12;

public class Car5 {
  // 자동차 마다 개별 정보를 저장할 변수
  /* static String model;
  static String brand;
  static int cc;
  static int pp; */
  //static 변수선언 - class가 로딩될때 메모리 변수 생성

  private String model;
  private String brand;
  private int cc;
  private int pp;

  public Car5() {} // 오버로딩

  public Car5(String model, String brand, int cc, int pp) {
    this.setModel(model);
    this.setBrand(brand);
    this.setCc(cc);
    this.setPp(pp);
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
