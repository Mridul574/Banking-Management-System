import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account =
                new BankAccount("Mridul", 5000);

        ATM atm = new ATM(account);

        PaymentMode p1 = new UPI();

        while (true) {

            System.out.println("\n===== Banking Management System =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Make Payment");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Amount: ");
                    atm.depositMoney(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter Amount: ");
                    atm.withdrawMoney(sc.nextDouble());
                    break;

                case 3:
                    atm.checkBalance();
                    break;

                case 4:
                    p1.pay();
                    break;

                case 5:
                    System.out.println("Thank You");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
