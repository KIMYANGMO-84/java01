package step33.exam04;

public class Engine {
  private int cc;
  private int valve;
  private String type;
  
  public Engine() {
    System.out.println("Engine() 호출");
    }

  @Override
  public String toString() {
    return "Engine [cc=" + cc + ", valve=" + valve + ", type=" + type + "]";
  }

  public int getCc() {
    return cc;
  }

  public void setCc(int cc) {
    System.out.println("setCc() 호출");
    this.cc = cc;    
  }

  public int getValve() {
    return valve;
  }

  public void setValve(int valve) {
    System.out.println("setValve() 호출");
    this.valve = valve;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    System.out.println("setType() 호출");
    this.type = type;
  }
  
  
}
