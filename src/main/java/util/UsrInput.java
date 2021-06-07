package util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);
    static public String readInput() {
        System.out.print("What is the input string? ");
        return input.nextLine();
    }
}
