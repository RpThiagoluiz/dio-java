package conditionals;

public class Compost {
  public void name() {
    double balance = 25.0;
    double request = 17.0;

    if (request < balance) {
      balance = balance - request;
      System.out.println("New balance is " + balance);
    } else {
      System.out.println("Insufficient Balance");
    }

  }
}
