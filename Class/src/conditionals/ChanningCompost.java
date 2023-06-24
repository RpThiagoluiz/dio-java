package conditionals;

public class ChanningCompost {
  public static void main(String[] args) {
    int grade = 5;

    if (grade >= 7) {
      System.out.println("Pass");
    } else if (grade >= 5 && grade < 7) {
      System.out.println("Recovery");
    } else {
      System.out.println("Reprove");
    }
  }
}
