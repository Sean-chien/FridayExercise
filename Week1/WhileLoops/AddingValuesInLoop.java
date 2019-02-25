package Week1.WhileLoops;
import java.util.Scanner;
public class AddingValuesInLoop {
    public static void main(String[] args) {
        System.out.println("I will add up the numbers you give me.");
        Scanner input = new Scanner(System.in);
        int total = input.nextInt();
        int i = 6, j = 6, sum = i + j;

        while (i == j) {

            System.out.println("The total so far is " + (i + j));
            System.out.println(sum);
            break;
        }
    }
}
