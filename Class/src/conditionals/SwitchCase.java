package conditionals;

public class SwitchCase {
  public static void main(String[] args) {
    String key = "A";

    switch (key) {
      case "S":
        System.out.println("Small");
        break;
      case "B":
        System.out.println("Big");
        break;

      default:
        System.out.println("Average");
        break;
    }
  }
}
