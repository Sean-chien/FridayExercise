package Week1.IfStatements;

import java.util.Scanner;

public class WeekdayName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // used scanner wanna to put in keybroad.
        System.out.println("What is the day today?");
        int day = sc.nextInt();


            if (day == 1) {
                System.out.println("Today is a Sunday");
            } else if (day == 2) {
                System.out.println("Today is a Monday");
            } else if (day == 3) {
                System.out.println("Today is a Tuesday");
            } else if (day == 4) {
                System.out.println("Today is a Wednesday");
            } else if (day == 5) {
                System.out.println("Today is a Thursday");
            } else if (day == 6) {
                System.out.println("Today is a Friday");
            } else if (day == 7) {
                System.out.println("Today is a Saturday");
            } else if (day == 0) {
                System.out.println("Today is a Saturday");
            } else {
                System.out.println("error");
            }

        }

    }
