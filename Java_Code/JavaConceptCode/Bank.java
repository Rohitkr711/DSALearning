public class Bank {
  int bal = 1000;

  public void deposit(int dep) {
    if (dep <= 0) {
      System.out.println("Deposit more that 0");
    } else {
      bal = bal + dep;
      System.out.println(bal);
    }
  }

  public void withdraw(int withdrawAmount) {
    bal = bal - withdrawAmount;
    System.out.println(bal);
  }

  public static void main(String[] args) {
    System.out.println("ICICI");
  }
}