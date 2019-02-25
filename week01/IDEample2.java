package week01;

import java.util.Scanner;

public class IDEample2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
        System.out.println("Enter another number");
        int b = in.nextInt();

        String f = String.format("number1: %d, number2: %d", a, b);
        System.out.println(f);
        System.out.println("The sum is " + (a + b));
    }
}
