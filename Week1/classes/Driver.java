package Week1.classes;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String color = in.nextLine();

        Rectangle r1 = new Rectangle("Blue",5,7);
        Rectangle r2 = new Rectangle("Green",10,2);
        Rectangle r3 = new Rectangle("Red",15,12);

        r1.paint();
        r1.setColor("Blue");
        r2.paint();
        r2.setColor("Green");
        r3.paint();
        r3.setColor("Red");



    }

}
