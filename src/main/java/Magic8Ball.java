import java.util.Random;
import java.util.Scanner;

/*
 * Create a Magic 8-ball program that gives custom responses to yes or no questions
 * To get a response from the user, use the getUserQuestion() method at the bottom of this file
 */
public class Magic8Ball {

    // 1. Make a main method that includes all the steps below

    // 2. Ask the user to enter a question for the magic 8-ball


    // 3. Call the getUserQuestion() method to get a question from the user
    //    String userQuestion = getUserQuestion();


    // 4. Make a variable and initialize it to a random number
    //
    //    // Get random a number from: [0, 1, 2, 3]
    //    int randNumber = new Random().nextInt(4);


    // 5. If the random number is 0

        // Tell the user "Yes"


    // 6. If the random number is 1

        // Tell the user "No"


    // 7. If the random number is 2

        // Tell the user a custom response


    // 8. If the random number is 3

        // Tell the user a custom response


    /**
     * @return The user's response as a String
     */
    public static String getUserQuestion(){
        Scanner scanner = new Scanner(System.in);
        String question = scanner.nextLine();
        return question;
    }
}




