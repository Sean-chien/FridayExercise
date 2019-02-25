package Week1.KeyboardInput;
import java.util.Scanner;
public class AgeinFiveYears {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Hello. " + "What is your name?" ,"%10s"," ");
        String name = input.nextLine();
        System.out.println("Hi" + " " + name + "!");
        System.out.printf("How old are you?" + " ");
        int ages = input.nextInt();
        System.out.println("    " + "Did you know that in five years you will be " + (ages + 5) + " !" + " years old.");
        System.out.println("    " + "And five years ago you were " + (ages - 5) + " !" + " Imagine that!");

        input.close();

    }
}
