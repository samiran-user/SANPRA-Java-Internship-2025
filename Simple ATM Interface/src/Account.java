import java.util.Scanner;

public class Account {
    void CheckBalance(int balence) {
        System.out.println("Your current balance is: ₹" + balence);
        }

    int  DepositMoney(int bal,int CurrentBalence)
    {
        return  CurrentBalence+bal;
    }
    int WithdrawMoney(int bal,int CurrentBalence){

        if(CurrentBalence-bal<0){
            System.out.println("Insufficient balance! Withdrawal failed.");
        }
        return CurrentBalence-bal;
    }
}
