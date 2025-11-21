import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        int AccountNo;
        int Password;
        boolean flag=true;
        try {
                        Auth ar = new Auth();
                System.out.println("Hi,There");
            while (flag) {
                System.out.print("Enter you Account no : ");
                Scanner sc1 = new Scanner(System.in);
                if (!sc1.hasNextInt()) {
                    System.out.println("Use Number");
                }
                else {
                AccountNo = sc1.nextInt();
                    System.out.print("Enter you Password : ");
                    Scanner sc2 = new Scanner(System.in);
                    if (!sc2.hasNextInt()) {
                                        System.out.println("Use Number");
                    }
                    else {
                        boolean isExit=true;
                        Password = sc2.nextInt();
                        boolean validation = ar.check(AccountNo,Password);
                        if(validation){
                            Menu me = new Menu();
                            while (isExit){
                            me.display();
                           isExit= me.option(ar);
                            }
                                            }
                        else {
                            System.out.println("Invalid details");
                                            }
                    }
                    }
                 }
                System.out.println("fill Again...");

        }
            catch( Exception e){
                throw new Exception();
            }

    }
}