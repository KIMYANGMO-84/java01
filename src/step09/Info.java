package step09;

public class Info{
    private String name;
    private int age;
    private String addr;
    private String pn;
    private String cc;

  public Info(String name, int age, String addr, String pn, String cc){ //생성자
      this.name = name;
      this.age = age;
      this.addr = addr;
      this.pn = pn;
      this.cc = cc;
    }

    public void country() { //Info class 연산자 생성
      if (this.cc == "kr") {
        this.cc = "한국인";
      } else {
        this.cc = "외국인";
      }
    }

    public String getName() {
      return this.name;
    }

    public int getAge() {
      return this.age;
    }

    public String getAddr() {
      return this.addr;
    }

    public String getPn() {
      return this.pn;
    }

    public String getCc() {
      return this.cc;
    }
  }
