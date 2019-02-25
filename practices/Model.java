package practices;

public class Model {
        static String occupation = "modeling";
        private String firstName;
        private String lastName;
        private int height;
        private double weight;
        private boolean canTravel;
        private boolean smokes;

        // Method overloading: methods with the same name, but different set of parameters.
        public Model() {

        }

        public Model(String firstName, String lastName, int height, double weightKg, boolean canTravel, boolean smokes) {
            setFirstName(firstName);
            setLastName(lastName);
            setHeight(height);
            setWeight(weightKg); // pass as Kg -> setWeight(long kg);
            setCanTravel(canTravel);
            setSmokes(smokes);
        }

        public Model(String firstName, String lastName, int height, double weight) {
            setFirstName(firstName);
            setLastName(lastName);
            setHeight(height);
            setWeight(weight);
            setCanTravel(true);
            setSmokes(false);
        }

        // getters (accessors)
        public static String getOccupation() {
            return occupation;
        }

        /**
         * Getter for firstName
         * @return firstName
         */
        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getHeight() {
            return height;
        }

        public String getHeightInFeetAndInches() {
            int feet = height / 12;
            int inches = height % 12;

            String fUnit = "";
            if (feet > 1) {
                fUnit = feet + " feet";
            } else if (feet == 1) {
                fUnit = feet + " foot";
            }

            String iUnit = "";
            if (inches > 1) {
                iUnit = inches + " inches";
            } else if (inches == 1) {
                iUnit = inches + " inch";
            }

            return fUnit + iUnit;
        }

        public double getWeight() {
            return weight;
        }

        public long getWeightKg() {
            return Math.round(weight * 0.45);
        }

        public boolean isCanTravel() {
            return canTravel;
        }

        public boolean isSmokes() {
            return smokes;
        }

        // setters (mutators)
        public final void setCanTravel(boolean canTravel) {
            this.canTravel = canTravel;
        }

        public final void setFirstName(String firstName) {
            if ((firstName != null) && (firstName.length() >= 3) && (firstName.length() <= 20)) {
                this.firstName = firstName;
            }
        }

        public final void setLastName(String lastName) {
            if ((lastName != null) && (lastName.length() >= 3) && (lastName.length() <= 20)) {
                this.lastName = lastName;
            }
        }

        public final void setHeight(int inches) {
            if (inches >= 24 && inches <= 84) {
                this.height = inches;
            }
        }

        public final void setHeight(int feet, int inches) {
            int inInches = feet * 12 + inches;
            setHeight(inInches);
        }

        public final void setWeight(double pounds) {
            if (pounds >= 80 && pounds <= 280) {
                this.weight = pounds;
            }
        }

        public final void setWeight(long kilograms) {
            double inPounds = kilograms * 2.205;
            setWeight(inPounds);
        }

        public void setSmokes(boolean smokes) {
            this.smokes = smokes;
        }

        public void printDetails() {
            System.out.println("Name: " + getFirstName() + " " + getLastName());
            System.out.println("Height: " + getHeight() + " inches");
            System.out.println("Weight: " + Math.round(getWeight()) + " pounds");
            if (canTravel) {
                System.out.println("Does travel ");
            } else {
                System.out.println("Does not travel ");
            }

            if (smokes) {
                System.out.println("Does smoke ");
            } else {
                System.out.println("Does not smoke ");
            }
        }
    }

