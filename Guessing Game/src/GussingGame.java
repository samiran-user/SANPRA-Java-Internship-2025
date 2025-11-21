import java.util.Scanner;
public class GussingGame {
    public static void main(String[] args) {
        int Number;
        int Attempt = 1;
        int option;
        boolean play = true;
        boolean isplay = true;
        System.out.println("         Welcome to the Number Guessing Game!\n");
        Game game = new Game();
        game.selectNumber();
        while (play) {
        System.out.print("Attempts : " + Attempt + "\nChoose a number between 1 and 100 : ");
            Scanner sc = new Scanner(System.in);
            Attempt = Attempt + 1;
            if (!sc.hasNextInt()) {
                System.out.println("Choose correct number !!");
            } else {
                Number = sc.nextInt();
                if(Number <0 || Number > 100){
                    System.out.println("Choose number b/w valid range !!");
                }else{
                    isplay = game.checkNumber(Number);
                    while (isplay) {
                        System.out.print("Do you want to play again? (1.yes/2.no)\n" +
                                "Choose an option : ");
                        Scanner sc1 = new Scanner(System.in);
                        if (!sc1.hasNextInt()) {
                            System.out.println("Choose correct option ");
                        } else {
                            option = sc1.nextInt();
                            switch (option) {
                                case 1:
                                    isplay = false;
                                    break;
                                case 2:
                                    isplay = false;
                                    play = false;
                                    break;
                                default:
                                    System.out.println("Choose a correct option!!");

                            }
                        }
                    }

                }
            }
        }
    }
}