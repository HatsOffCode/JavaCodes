// One word answer for the sentence game

import java.util.*;

public class OneWordForTheSentenceGame {
    public static void main(String[] args) {
        // Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        // About the game & Rules
        System.out.println("This game is based on one word answer.\nPlease answer in one word of the " +
        "following sentences, the first letter of the word should be capital and the rest of all should be small.\n");
        // start playing
        System.out.println("Let's Play...!\n");
        // variable to store user's wish either he/she wants to play further or not
        String userWish;
        do {
            // Declaring & initializing the collection of questions with answer in pair using 2D array
            String[][] questions = {{"Biggest animal in today's era is? : ", "Blue whale"},
                    {"Smallest animal in the world? : ", "Bacteria"},
                    {"Fastest land animal is? : ", "Cheetah"},
                    {"Color of the sky on a clear day? : ", "Blue"},
                    {"Which planet is known as the Red Planet? : ", "Mars"},
                    {"What do bees produce? : ", "Honey"},
                    {"What gas do humans need to breathe? : ", "Oxygen"},
                    {"What is frozen water called? : ", "Ice"},
                    {"Tallest animal in the world? : ", "Giraffe"},
                    {"Which bird is known for wisdom? : ", "Owl"},
                    {"Something that is very difficult to deal with is? : ", "Challenging"},
                    {"What is the largest desert in the world? : ", "Antarctic"},
                    {"What is the largest ocean on Earth? : ", "Pacific"},
                    {"What is the smallest continent in the world? : ", "Australia"},
                    {"Which planet is known as the Red Planet? : ", "Mars"},
                    {"What art form is described as decorative handwriting or handwritten lettering? : ", "Calligraphy"},
                    {"In which country would you find Mount Kilimanjaro? : ", "Tanzania"},
                    {"Which country has the most islands? : ", "Sweden"},
                    {"Which is the only continent with land in all four hemispheres? : ", "Africa"},
                    {"What is the tallest type of tree? : ", "Redwood"},
                    {"What is the only flag that does not have four sides? : ", "Nepal"},
                    {"Which planet in the Milky Way is the hottest? : ", "Venus"},
                    {"Which planet has the most moons? : ", "Saturn"},
                    {"Which planet is closest to the sun?", "Mercury"},
                    {"Which is the only body part that is fully grown from birth? : ", "Eyes"},
                    {"What is the process by which plants convert sunlight to energy? : ", "Photosynthesis"},
                    {"What is the chemical element with the symbol Fe? : ", "Iron"},
                    {"What is the smallest unit of matter? : ", "Atom"},
                    {"What is the outermost layer of the Earth’s atmosphere called? : ", "Exosphere"},
                    {"What is the process by which a liquid changes into a gas? : ", "Evaporation"},
                    {"What was the name of the first computer virus? : ", "Creeper"},
                    {"What is the rarest and most expensive spice in the world by weight? : ", "Saffron"},
                    {"Which country is credited with inventing ice cream? : ", "China"},
                    {"What luxury brand is known for its iconic interlocking “C” logo? : ", "Chanel"},
                    {"Which country has won the most football World Cups? : ", "Brazil"},
                    {"Which country has won the most cricket World Cups? : ", "Australia"},
                    {"How many hearts does an octopus have? : ", "Three"},
                    {"What is the only bird who gives birth to her baby and doesn't lay eggs? : ", "Bat"},
                    {"What animal has the largest brain relative to body size? : ", "Dolphin"},
                    {"What animal has the longest tongue? : ", "Giraffe"}};
            // Declare & initialize a variable for the maximum number of attempts
            int attempt = 5;
            // variable to show the final score
            int score = 0;
            // shuffle the questions
            java.util.Collections.shuffle(java.util.Arrays.asList(questions));
            // loop to control the number of attempts & number of question ask
            for (int i = 0; i < 5 && i < questions.length; i++) {
                // assigning the shuffled array's first element in the question variable i.e. question only, not answer
                String question = questions[i][0];
                // assigning the shuffled array's second element in the answer variable to match with the answer of the given question
                String answer = questions[i][1];
                // prints  Q 1. and then shuffled question
                System.out.print("Q " + (i + 1) + ". " + question);
                // prompt the user to answer
                String userAns = sc.nextLine();
                // condition to check whether user's answer is right or wrong
                if (userAns.equals(answer)) {
                    System.out.println("Correct");
                    // increments the value of score if the answer is correct
                    score++;
                } else {
                    // prints the correct answer when user enter wrong answer
                    System.out.println("Incorrect, correct answer is : " + answer);
                }
            }
            // display the final score
            System.out.println("Your Score is : " + score + "/" + attempt);
            // prompt the user to check whether he/she wants to play again or not
            System.out.println("Do you want to play again? (yes/no): ");
            userWish = sc.nextLine();
        }
        // keep playing until user want
        while(userWish.equals("yes"));
    }
}
