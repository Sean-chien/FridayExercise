package Week1.WhileLoops;
import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
        int max = 10 ,min = 0, i;
        int j;
        j = (int)(Math.random() * 10 +1);
        System.out.println("answer: ***");
        System.out.println("That is incorrect. Guess again.");

        while(true){
            System.out.println("Please input a number:  ");

            Scanner inScanner = new Scanner(System.in);
            i = inScanner.nextInt();
            System.out.println("You guess: " + i);


            if (i == j){
                System.out.println("You got it!!");
                break;
            }
            else if(i < j){
                System.out.println("This is incorrect. Guess again");
                System.out.println(i + "~" + max);
                System.out.println(" ");
                min = i;
            }
            else if(i > j){
                System.out.println("This is incorrect. Guess again");
                System.out.println(min + "~" + i);
                System.out.println(" ");
                max = i;
            }

        }
    }
}
