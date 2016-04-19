package step15;

public class DeveloperCalculator extends CalculatorPlus {
  public void printResult(int radix) {
    switch (radix) {
      case 2:
        System.out.println("2진수로 표현 : " + Integer.toBinaryString(this.result));
        break;
      case 8:
        System.out.println("8진수로 표현 : " + Integer.toOctalString(this.result));
        break;
      case 16:
        System.out.println("16진수로 표현 : " + Integer.toHexString(this.result));
        break;
      default:
        this.printResult();
    }
  }
}
