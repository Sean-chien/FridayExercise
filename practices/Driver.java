package practices;
import java.util.Scanner;

public class Driver {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String line = in.nextLine(); // user input

            Model m1 = new Model("Susan", "Smith", 70, 120, false, true);
            m1.setHeight(6, 10);
            m1.printDetails();
        }
    }


