import java.util.Scanner;

public class Menu {
    void display() {
        System.out.println("-------------------Menu----------------------------");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
    }
    boolean option(Auth Acc){
            int balence = Acc.getBalence();
            Account Ac = new Account();
        System.out.println("Enter your choice: ");
        Scanner sc3 = new Scanner(System.in);
        if (!sc3.hasNextInt()) {
            System.out.println("Use Number");
        }
        else {
            int ChosenNo = sc3.nextInt();
            switch (ChosenNo) {
                case 1:
                    Ac.CheckBalance(balence);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit : ");
                    Scanner sc4 =new Scanner(System.in);
                    int DepoMoney = sc4.nextInt();
                     balence =Ac.DepositMoney(DepoMoney,balence);
                    Acc.setBalence(balence);
                    System.out.println("Deposit successful!");
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw: ");
                    Scanner sc5 =new Scanner(System.in);
                    int withDraMoney = sc5.nextInt();
                    balence=Ac.WithdrawMoney(withDraMoney,balence);
                    Acc.setBalence(balence);
                    System.out.println("Withdrawal successful!");
                    break;
                case 4:
                    return false;
                default:
                    System.out.println("Enter Correct Number");
            }
        }
        return true;
    }
}
