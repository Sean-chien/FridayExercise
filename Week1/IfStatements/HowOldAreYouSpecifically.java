package Week1.IfStatements;
import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("%8s","Hey, What's your name ?(Sorry I keep forgetting.)");
        String name = input.nextLine();

        System.out.printf("%8s","Ok, " + name + " " + "how old are you ?");
        int ages = input.nextInt();


        if(ages<=16){
            System.out.println("You can't drive");
        }
        else if(ages == 16 || ages == 17){
            System.out.println("You can drive,but not vote");
        }
        else if(ages >= 18 && ages <= 24){
            System.out.println("You can vote but not rent a car");
        }
        else if (ages >= 25){
            System.out.println("You can do pretty much anything.");
        }
        else{
            System.out.println("try to check again");
        }
    }

}
