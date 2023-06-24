package conditionals;

public class Ternary {
  public static void main(String[] args) {
    int grade = 7;

    String result = grade >= 7 ? "Approved" : "Reproved";

    System.out.println("Ternary.main() " + result);
  }
}
