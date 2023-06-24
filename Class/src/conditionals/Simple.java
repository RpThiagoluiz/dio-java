package conditionals;

public class Simple {
  public void name() {
    double balance = 25.0;
    double request = 17.0;

    if (request < balance)
      balance = balance - request;

    System.out.println(balance);

  }
}
