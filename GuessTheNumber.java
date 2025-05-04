import java.util.*;

public class GuessTheNumber {
    public static void main(String[] args) {

        //Generating a random number
        int number = (int)(Math.random()*1*100);

        //Define and initialize variables
        int score=100, attempt=0, guess, press;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\t*****PLEASE NOTE*****");
        System.out.println("You have to guess the actual number in minimum attempts to score" +
                " high, as much as you'll attempts to guess the number your score will be" +
                " decreasing based on your numbers of attempt\n");
        System.out.print("\tIf you want to play the game...press - 1, otherwise - 0 : ");
        press = sc.nextInt();
        if(press==1) {
            while(number > 0){
                System.out.print("\nGuess the Number between 1 and 100 : ");
                guess = sc.nextInt();
                if(guess < 1 && guess > 100){
                    System.out.println("Enter a valid number");
                }
                else if (guess < number) {
                    System.out.println(guess + " is smaller");
                    attempt++;
                } else if (guess > number) {
                    System.out.println(guess + " is greater");
                    attempt++;
                } else if (guess == number) {
                    System.out.println("Correct Guess! .. Actual Number is " + guess);
                    score -= attempt;
                    System.out.println("Your Score is " + score);
                    break;
                } else {
                    System.out.println("Please enter a valid number");
                }
            }

        }
        else{
            System.out.println("Sorry for Inconvenience!");
        }

    }
}
