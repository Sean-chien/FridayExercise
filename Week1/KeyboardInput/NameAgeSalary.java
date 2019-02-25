package Week1.KeyboardInput;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Hi What is your name?  ");
        String name = input.nextLine();               //前面的 要跟next後面的一樣

        System.out.print("Hello Sean! How old are you?  ");
        double ages = input.nextDouble();

        System.out.print("So you're 30, eh?  That's not old at all!" +
                " How much do you make, Sean?  ");
        double paythemoney = input.nextDouble();
        System.out.println("20.0!" + "I'll pay for you,see you tomorrow!!");


        input.close();

    }


}