package Week1.IfStatements;
import java.util.Scanner;
public class ALittleQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-10s","Are you ready for a quiz ?" + " ");
        String answer = input.nextLine();
        System.out.println("okay, here it comes!");
        System.out.println(" ");
        System.out.printf("%-10s","Q1) What is the capital of Alaska?" + " ");

        int answers = input.nextInt();

        if(answers == 1){
            System.out.println("    " + "Melbourne");
            System.out.println("    " + "Error");
        }
        else if(answers == 2){
            System.out.println("    " + "Anchorage");
            System.out.println("    " + "Error");
        }
        else if(answers == 3){
            System.out.println("    " + "Juneau");
            System.out.println("    " + "That's right");
        }
        System.out.println(" ");
        System.out.printf("%-10s","Q2) Can you store the value + \"cat\" + in a variable of type int ?\n" + " ");
        System.out.println(" ");
        int Answer = input.nextInt();

        if(Answer == 1){
            System.out.println("    " + "yes");
            System.out.println("You are right!");
        }
        else if(Answer == 2){
            System.out.println("    " + "no");
            System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.\n");
        }
        System.out.println(" ");
        System.out.printf("%-10s","Q3) What is the result of 9+6/3 ?");
        int Answers = input.nextInt();

        if(Answers == 1){
            System.out.println("    " + "5");
            System.out.println("Error");
        }
        else if(Answers == 2){
            System.out.println("    " + "11");
            System.out.println("That's correct!");
        }
        else if(Answers == 3){
            System.out.println("    " + "15/3");
            System.out.println("Error");
        }
        System.out.println(" ");
        int result = input.nextInt();

        if(result == 1){
            System.out.println("overall, you got 1 out of 3 correct!");
            System.out.println("Thank for playing");

        }
        else if(result == 2){
            System.out.println("overall, you got 2 out of 3 correct!");
            System.out.println("Thank for playing");
        }
        else if(result == 3){
            System.out.println("good job!");
            System.out.println("Thank for playing");

        }
        input.close();
    }

}
