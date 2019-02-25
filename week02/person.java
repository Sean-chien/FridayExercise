package week02;


// Type - Template (Blueprint)
// att
public class person {
    // attributes - instance variables (private!)
    // Data Encapsulation!
    private String name;
    private int age;
    private String gender;
    private String nationality;
    private String eyeColor;

    // constructor - default -> within package
    public person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // CMD(CTRL) + N (generate code)
    public person(String name, int age, String gender, String nationality, String eyeColor) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
        this.eyeColor = eyeColor;
    }
    // getter and setters
    public String getName() {
        // getter for name
        return this.name;
    }

    public void setName(String name) {
        // setter for name
        this.name = name;
    }

    public String getEyeColor() {
        return this.eyeColor;
    }

    // returnType methodName(parameters) {
    //     << body >>
    // }
    // behaviors - methods
    public void eat(String food) {
        // this -> instance that's calling the method.
        System.out.println(this.name + " Eating " + food);
    }

    public void sleep(int hours) {
        System.out.println(this.name + " is about to sleep for " + hours + " hours.");
    }

    public void pray(int effort) {
        boolean hired = prayForJobs(effort);
        // ternary operator (un -> one, bi -> two, ter -> three)
        //  <boolean expression> ? <exp1> : <exp2>;
        String message = hired ? "Hired!" : "More effort";
        System.out.println(message);
    }

    private boolean prayForJobs(int effort) {
        // helper method
        if (effort > 100) {
            return true;
        } else {
            return false;
        }
    }
}

