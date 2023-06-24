package fundamentals;

public class Types {
  public static void main(String[] args) {
    byte age = 123;
    short year = 2021;
    int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo (String)
    long cpf = 98765432109L;
    // CPF -> se começar com zero, talvez tenha que ser outro tipo (String)
    // CPF -> long ele tbm tem que terminar com L pro java saber que ele é long para
    // armazenar
    float pi = 3.14F; // float tem que se encerrar com F
    double salary = 1275.33;

    // Caso vc tente aumentar o valor de um numero ele aceita, caso vc tente voltar
    // um numero maior, vc precisa informar que está ciente que poderá dar ruim essa
    // alteração.
    short shortNumber = 1;
    int normalNumber = shortNumber;
    short normalNumber2 = (short) normalNumber;

    System.out.print(normalNumber2 + "\n" + age + "\n" + year + "\n" + cep + "\n" + cpf + "\n" + pi + "\n" + salary);
  }

}
