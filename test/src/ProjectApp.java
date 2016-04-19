


public class ProjectApp {

static Scanner keyScan = new Sanner(System.in);
static ProjectController projectController = new ProjectController();

  public static void main(String[] args) {
    projectController.setScanner(keyScan);
    String input;

    do {
      input = prompt();
      processCommand(input);
    } while (!input.equals("quit"));

  }

  static  void processCommand(String input) {
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
