package fundamentals;

public class Variables {
  // method main
  public static void main(String[] args) {

    final String firstName = "Thiago";

    final String lastName = "Gonçalves";

    String fullName = fullName(firstName, lastName);

    System.out.print(fullName);

  }

  public static String fullName(String firstName, String lastName) {

    return "Method return " + firstName.concat(" ").concat(lastName);
  }

}
