package week01;

public class Loops {
    public static void main(String[] args) {
        // 1. for-loop
        // syntax
//        for(/* initialize loop var */; /* condition */; /* incr or decr */) {
//            // statements to execute
//        }

        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for(;;) {
            /* infinite loop */
            System.out.println("Hello");
            break;
        }

        // syntax (grammar)
//        while (/* condition */) {
//            // statements to execute
//        }


        int i = 0;
        while ( i < 10 ) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            // continue; skip to the next ç
            // break; stop the iteration
            i++;
        }

        while (true) {
            // infinite loop
            System.out.println("Hi");
            break;
        }
    }
}