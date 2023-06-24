package AboutMe;

import java.util.Locale;
import java.util.Scanner;

public class Exec {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Enter name");
    String name = scanner.next();

    System.out.println("Enter last name");
    String lastName = scanner.next();

    System.out.println("Enter age");
    int age = scanner.nextInt();

    System.out.println("Digite sua altura");
    double height = scanner.nextDouble();

    System.out.println("Hi my name is " + name + " " + lastName);
    System.out.println("I'm " + age + " old");
    System.out.println("and, my height is " + height);

  }
}
