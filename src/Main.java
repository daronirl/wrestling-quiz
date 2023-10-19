import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input to ask you your name and if you want to take the quiz
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ", welcome to the wrestling quiz!");
        System.out.println("Are you ready to answer some wrestling questions? Answer yes or no");
        String answer = scanner.nextLine();


        if (answer.equals("yes")){
            System.out.println("Great! Lets get started!");
            // Wrestling Questions
            ArrayList<String> wrestlingQuestions = new ArrayList<>();
            wrestlingQuestions.add("Who is the Universal Heavyweight Champion in WWE?");
            wrestlingQuestions.add("Who is the longest reigning Intercontinental Champion?");
            wrestlingQuestions.add("Tony Khan is the owner of which wrestling company?");
            wrestlingQuestions.add("Who is the AEW World Champion?");
            // Wrestling Answers
            ArrayList<String> wrestlingAnswers = new ArrayList<>();
            wrestlingAnswers.add("Roman Reigns");
            wrestlingAnswers.add("Gunther");
            wrestlingAnswers.add("AEW");
            wrestlingAnswers.add("MJF");
            // Score variable to increase for every right answer
            int score = 0;


            for (int i = 0; i < wrestlingQuestions.size(); i++) {
                System.out.println(wrestlingQuestions.get(i));

                String userAnswer = scanner.nextLine();

                if (userAnswer.equalsIgnoreCase(wrestlingAnswers.get(i))) {
                        score++;
                    System.out.println("Your answer was " + userAnswer + ", That is correct!!!");
                } else {
                    System.out.println("Your answer was wrong");
                }


            }

            if (score == 4) {
                System.out.println("Thanks for playing! " + "Your score is " + score + " Your grade is an A!");
            } else if (score == 3) {
                System.out.println("Thanks for playing! " + "Your score is " + score + " Your grade is a B!");
            } else if (score == 2) {
                System.out.println("Thanks for playing! " + "Your score is " + score + " Your grade is a C!");
            } else if (score == 1) {
                System.out.println("Thanks for playing! " + "Your score is " + score + " Your grade is a D!");
            } else if (score == 0) {
                System.out.println("Ouch, you got all questions wrong! that means you got a big fat F!");
            }
        } else {
            System.out.println("Guess you don't want to play, bye!");
        }

    }
}


