package designpattern.abstractfactory.exam01;

import java.util.Scanner;

public class Game {
  Scanner keyScan = new Scanner(System.in);
  int selectedRace;
  Home home;
  
  public void service() throws Exception {
    selectRace();
    
    String command = null;
    do {
      System.out.print("명령> ");
      command = keyScan.nextLine();
      if (command.equals("home")) {
        doHome();
      } else {
        System.out.println("유효하지 않은 명령어 입니다.");
      }
    } while (!command.equals("quit"));
    System.out.println("게임종료");
  }
  
  private void doHome() {
    if (selectedRace == 1) {
      HumanHomeFactory factory = new HumanHomeFactory();
      home = factory.createHome();
    } else if (selectedRace == 2) {
      AlienHomeFactory factory = new AlienHomeFactory();
      home = factory.createHome();
    } else if (selectedRace == 3) {
      MonsterHomeFactory factory = new MonsterHomeFactory();
      home = factory.createHome();
    } 
    System.out.println("집짓기 완료");
    System.out.print("[집정보]--> ");
    System.out.println(home);
  }

  private void selectRace() {
    System.out.printf("1)%s\t2)%s\t3)%s\n", "Human", "Alien", "Monster");
    System.out.print("종족을 선택하세요? ");
    selectedRace = Integer.parseInt(keyScan.nextLine());
    
  }
  public static void main(String[] args) throws Exception {
    Game game = new Game();
    game.service();
  }

}
