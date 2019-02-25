package Review2016;
import java.util.Scanner;

public class TestBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight = 65.5;
        double height = 160;
        double bmi = height / weight;


        if (bmi < 18.5) {
            System.out.println("underweight");

        } else if (bmi >= 18.5 || bmi < 24) {
            System.out.println("normal");
        } else if (bmi > 24) {
            System.out.println("heavy over");
            input.close();
        }
        else
            return  ;


    }
}


