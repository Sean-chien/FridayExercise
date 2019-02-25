package week01;

import java.util.Scanner;

public class IDExample {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Which language (en, es, pt, jp, cn, kr, pr, tr, tw, md): ");
        while (true) {
            String line = myScanner.nextLine();
            if (line.equals("en")) {
                System.out.println("Hello!");
            } else if (line.equals("es")) {
                System.out.println("Hola!");
            } else if (line.equals("pt")) {
                System.out.println("Ola");
            } else if (line.equals("jp")) {
                System.out.println("Konnichiwa");
            } else if (line.equals("cn")) {
                System.out.println("Nihao");
            } else if (line.equals("kr")) {
                System.out.println("Annyong");
            } else if (line.equals("pr")) {
                System.out.println("Salam");
            } else if (line.equals("tr")) {
                System.out.println("Selam");
            } else if (line.equals("tw")) {
                System.out.println("NNihao");
            } else if (line.equals("md")){
                System.out.println("Salut");
            } else {
                System.out.println("Not found.");
                break;
            }
        }
    }
}
