package week01;

import java.util.Arrays;


public class ArraryExample {
    public static void main(String[] args) {
        // Arrays : fixed size, same data type
        /* array literal */
        int[] ages = {19, 20, 23, 25, 27, 28, 30, 32, 35, 45};

        /* creating an array of size 5 with default value 0 */
        int[] scores = new int[5];
        scores[0] = 100;
        scores[1] = 95;
        scores[2] = 94;
        scores[3] = 85;
        scores[4] = 78;

        double[] records = {1.12, 42.0, 32.01};
        double[] records2 = {1.12, 42.0, 32.01};
        System.out.println(records == records2); // false

        char[] letters = {'A', 'B', 'C'};

        System.out.println(letters.length);
        System.out.println(letters[letters.length - 1]); // last element

        /* for each loop */
        for(char letter: letters) {
            // for each element letter in letters array
            System.out.println(letter);
        }

        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }

        System.out.println(records);
        // option + enter: import!
        System.out.println(Arrays.toString(records));

    }
}
