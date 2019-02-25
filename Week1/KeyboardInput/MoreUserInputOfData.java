package Week1.KeyboardInput;
import java.util.Scanner;

public class MoreUserInputOfData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("First name: ");
        String Firstname = input.nextLine();

        System.out.printf("Last name: ");
        String Lastname = input.nextLine();

        System.out.printf("Grade: ");
        int Grade = input.nextInt();

        System.out.printf("Student ID number: ");
        int IDnumber = input.nextInt();

        System.out.printf("Login: ");
        String Login = input.next();

        System.out.printf("GPA(0.0-4.0): ");
        double GPA = input.nextDouble();


        System.out.println("Your information: ");
        System.out.println("====================================================");
        System.out.printf("%-10s"," ");
        System.out.println("Login: " + Login);
        System.out.printf("%-10s"," ");
        System.out.println("ID: " + IDnumber);
        System.out.printf("%-10s"," ");
        System.out.println("Name: " + Firstname + "-" + Lastname);
        System.out.printf("%-10s"," ");
        System.out.println("GPA: " + GPA);
        System.out.printf("%-10s"," ");
        System.out.println("Grade: " + Grade);


        input.close();


    }

}
