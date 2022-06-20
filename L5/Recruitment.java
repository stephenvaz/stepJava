import java.util.Scanner;
import java.util.Random;

class Recruitment {
    String[] ques = { "What is the vision of the company?", "How long will you stay in this role?",
            "What is final method in Java?", "What is the latest version of Java?",
            "What did you learn about Java in last job?", "What do you wish to learn?", "What makes a team successful?",
            "Do you work faster in team or as individual?" };
}

class Testing extends Recruitment {

    void takeTest() {
        Scanner tsC = new Scanner(System.in);
        System.out.println("Welcome to the Recruitment Test");
        System.out.println("Please answer the following questions");
        for (int i = 0; i < ques.length; i++) {
            System.out.println(ques[i]);
            String ans = tsC.nextLine();

        }
        tsC.close();
        generateResult();
    }

    void generateResult() {
        Random r = new Random();
        int score = r.nextInt(100);
        System.out.println("Your score is " + score);
        System.out.printf("%s\n", (score >= 60 ? "Congratulations! You are selected" : "Sorry! You are not selected"));
    }
}

class Tester {
    public static void main(String[] args) {
        Testing t = new Testing();
        t.takeTest();

    }
}