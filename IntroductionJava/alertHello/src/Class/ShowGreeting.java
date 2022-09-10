package Class;

import java.util.Scanner;

public class ShowGreeting {
    public static void main(String[] args) {
        Scanner greeting = new Scanner(System.in);
        System.out.println("Input the name");
        String name = greeting.nextLine();

        System.out.println("Hello " + name);
    }
}
