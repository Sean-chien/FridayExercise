package week02;

/**
 * Driver or Client class : It's a class we can run!
 *                          It's a class that has main method!
 */
public class Driver {
    public static void main(String[] args) {
        // making an instance: calling a special method (Constructor)
        //  - constructor : same as type name
        // Java gives you a default Constructor
        person p1 = new person("Peter", 25, "Male");
        person p2 = new person("Ariana", 23, "Female", "American", "Brown");

        p1.eat("Taco");
        p2.eat("Sushi");
        p1.sleep(5);
        p2.pray(101);

        // mechanism to change instance variables
        // (methods)
        // - getter : to get
        // p1.name = ""; // X : private
        System.out.println(p1.getName());

        // - setter : to set
        p2.setName("Miranda");
        p2.eat("Pizza");
    }
}

