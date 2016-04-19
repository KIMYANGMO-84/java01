//메뉴를 처리하기 위해 호출하는 service() 메서드를 규칙으로 정의한다.
// => 향후 메뉴를 처리하는 모든 클래스는 이 인터페이스의 규칙에 따라 작성해야 한다.
package bitcamp.pms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

import bitcamp.pms.controller.MemberController;
import bitcamp.pms.controller.MenuController;
import bitcamp.pms.controller.ProjectController;

public class ProjectApp {
  static Scanner keyScan = new Scanner(System.in);
  static HashMap<String, MenuController> menuMap = new HashMap<>();


  public static void main(String[] args) throws Exception {
    menuMap.put("member", new MemberController());
    menuMap.put("project", new ProjectController());      
    
    Collection<MenuController> controllers = menuMap.values();
  
    String input;
    do {
      input = prompt();
      processCommand(input);
    } while (!input.equals("quit"));

    keyScan.close(); // 항상 다 쓴 자원은 해제해야 한다.
  }

  static void processCommand(String input) {
    String[] cmds = input.split(" ");

    if (cmds[0].equals("quit")) {
      doQuit();
    } else if (cmds[0].equals("about")) {
      doAbout();
    } else if (cmds[0].equals("go")) {
      doGo(cmds);
    } else {
      doError();
    }
  }

  static String prompt() {
    System.out.print("명령> ");
    return keyScan.nextLine().toLowerCase();
  }

  static void doQuit() {
    try {
   
      System.out.println("데이터를 저장했습니다.");

    } catch (Exception e) {
      System.out.println("데이터 저장에 실패했습니다!");
    }
    System.out.println("안녕히 가세요!");
  }

  static void doError() {
    System.out.println("올바르지 않은 명령어입니다.");
  }

  static void doAbout() {
    System.out.println("비트캠프 80기 프로젝트 관리 시스템!");
  }

  static void doGo(String[] cmds) {
    if (cmds.length < 2) {
      System.out.println("메뉴 이름을 지정하세요.");
      System.out.println("예) go member");
      return ;
    }
    MenuController controller = menuMap.get(cmds[1]);
    
    if (controller != null) {
      controller.service(keyScan);
      
    } else {
        System.out.println("없는 메뉴입니다.");
    }
  }
}
