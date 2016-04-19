
import java.util.Scanner;
import java.sql.Date;
public class ProjectController {

  private Scanner keyScan;
  private LinkedList<Project> projects;
  private int count = 0;

  public ProjectController() {
    projects = new LinkedList<Project>();
  }

  public void setScanner(Scanner keyScan) {
    this.keyScan = keyScan;
  }

  public void doAdd() {
    Project project = new Project();
    System.out.print("프로젝트명 ? ");
    project.setName(keyScan.nextLine());
    System.out.print("시작일 ? ");
    project.setStartD(Date.valueOf(keyScan.nextLine()));
    System.out.print("종료일 ? ");
    project.setEndD(Date.valueOf(keyScan.nextLine()));
    System.out.print("설명 ? ");
    project.setDesc(keyScan.nextLine());

    if (confirm("저장하시겠습니까?")) {
      projects.add(project);
      System.out.println("저장되었습니다.");
    } else {
      System.out.println("취소되었습니다.");
    }

  }

  public void doList() {
    for (int i = 0; i < projects.size(); i++){
      System.out.printf("%d,%s", i, projects.get(i).toString());
    }
  }

  public void doUpdate() {
    Project project = new Project();
    System.out.println("변경하고 싶은 프로젝트 번호입력. ");
    int no = Integer.parseInt(keyScan.nextLine());
    System.out.print("프로젝트명 ? ");
    project.setName(keyScan.nextLine());
    System.out.print("시작일 ? ");
    project.setStartD(Date.valueOf(keyScan.nextLine()));
    System.out.print("종료일 ? ");
    project.setEndD(Date.valueOf(keyScan.nextLine()));
    System.out.print("설명 ? ");
    project.setDesc(keyScan.nextLine());

    if (confirm("저장하시겠습니까?")) {
      projects.set(no, project);
      System.out.println("저장되었습니다.");
    } else {
      System.out.println("취소되었습니다.");
    }

  }

  public void doDelete() {
    int no = Integer.parseInt(keyScan.nextLine());
    if(confirm("삭제 하시겠습니까?")) {
      projects.remove(no);
      count--;
      System.out.println("삭제하였습니다");
    } else {
      System.out.println("취소하였습니다.");
    }
  }

  public String prompt() {
    System.out.println("프로젝트> ");
    return keyScan.nextLine().toLowerCase();
  }

  public boolean confirm(String message) {
    while (true) {
      System.out.printf("%s (y/n)", message);
      String ans = keyScan.nextLine().toLowerCase();
      if (ans.equals("y")) {
        return true;
      } else if (ans.equals("n")) {
        return false;
      } else {
        System.out.println("잘못 입력 하셨습니다.");
      }
    }
  }

  public void service() {
    String input = prompt();
    while (true) {
      switch (input) {
        case "add": doAdd();
          break;
        case "delete": doDelete();
          break;
        case "list": doList();
          break;
        case "update":doUpdate();
          break;
        case "main":
            break;
        default:
          System.out.println("잘못입력하셨습니다.");
      }
    }
  }
}
