import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ", welcome to the wrestling quiz!");
        System.out.println("Are you ready to answer some wrestling questions? Answer yes or no");
        String answer = scanner.nextLine();

        // Wrestling Questions
        ArrayList<String> wrestlingQuestions = new ArrayList<>();
        wrestlingQuestions.add("Who is the Universal Heavyweight Champion in WWE?");
        wrestlingQuestions.add("Who is the longest reigning Intercontinental Champion?");
        wrestlingQuestions.add("Tony Khan is the owner of which wrestling company?");
        wrestlingQuestions.add("Who is the AEW World Champion?");

        ArrayList<String> wrestlingAnswers = new ArrayList<>();
        wrestlingAnswers.add("Roman Reigns");
        wrestlingAnswers.add("Gunther");
        wrestlingAnswers.add("AEW");
        wrestlingAnswers.add("MJF");

        int score = 0;

        if (answer.equals("yes")) {
            System.out.println("Great! Lets get started!");
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
        }
        System.out.println("Thanks for playing! " + "Your " + score);

    }



}