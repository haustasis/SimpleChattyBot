package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        // reading all remainders
        int[] arrA = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        int age = (arrA[0]*70 + arrA[1]*21 + arrA[2]*15) % 15;

        System.out.printf("Your age is %d; that's a good time to start programming!", age);
    }
}
