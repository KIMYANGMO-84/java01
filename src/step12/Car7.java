package step12;

public class Car7 {
  // 모든 인스턴스가 공유하는 데이터는 스태틱 변수에 보관하라.
  static int count;

  private int carNumber;
  private String model;
  private String brand;
  private int cc;
  private int pp;

  // 인스턴트 블록 - 인스턴스가 생성될때 실행되므로 생성자보다 먼저 실행됨
  {
  // 인스턴스 블록/메서드 에서는 this를 생략할 수 있다.
  // 자기가 속해있는 클래스의 스태틱 변수나 메소드를 호출할때 클래스 이름을 생략할 수 있다.
    carNumber = ++Car7.count; // 생략하는것은 해당 변수가 가르키는 것을 명확하게 알 수 없으므로 생략하지 않는것이 좋다
  }
  public Car7() {} // 오버로딩

  public Car7(String model, String brand, int cc, int pp) {
    // 인스턴스 블록/메서드에서 다른 인스턴스 메서드를 호출할 때 this를 생략할 수 있다.
    // this를 생략하면 컴파일러가 자동으로 this를 붙여 컴파일한다.
    setModel(model);
    setBrand(brand);
    setCc(cc);
    setPp(pp);
  }
  public int getCarNumber() {
    return this.carNumber;
  }

  public String getModel() {
    return this.model;
   }
  public void setModel(String model) {
    // 이 경우는 this를 생략할 수 없다.
    // 로컬변수 이름이 인스턴스 변수 이름과 같기 때문에 this를 빼면 구분할 수 없다
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
