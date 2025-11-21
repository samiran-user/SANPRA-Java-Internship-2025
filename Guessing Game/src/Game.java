import java.util.Random;
public class Game {
    private int RandomNumber;
    void selectNumber(){
        Random random = new Random();
        RandomNumber = random.nextInt(100) + 1;
    }
    boolean checkNumber(int GuessingNumber){
        System.out.println(RandomNumber);
        if(GuessingNumber == RandomNumber){
            System.out.println("You got it!");
            return false;
        }
        else if(GuessingNumber<RandomNumber){
            System.out.println("Guess high Number");
        }
        else {
            System.out.println("Guess Low Number");
        }
        return true;
    }
}
