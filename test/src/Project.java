import java.sql.Date;

public class Project {
  private String name;
  private Date startD;
  private Date endD;
  private String desc;

  public Project() {
  }

  public Project(String name, Date startD, Date endD, String desc) {
    this.name = name;
    this.startD = startD;
    this.endD = endD;
    this.desc = desc;
  }

  @Override
  public String toString() {
    return this.name + "," + this.startD + "," + this.endD + "," + this.desc;
  }

  public String getName() {
    return name;
  }
  public Date getStartD() {
    return startD;
  }
  public Date getEndD() {
    return endD;
  }
  public String getDesc() {
    return desc;
  }

  public void setName(String name) {
    this.name = name;
  }
  public void setStartD(Date startD) {
    this.startD = startD;
  }
  public void setEndD(Date endD) {
    this.endD = endD;
  }
  public void setDesc(String desc) {
    this.desc = desc;
  }

}
