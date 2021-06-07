/*
UCF COP3330 Summer 2021 Assignment 1 Solution
Copyright 2021 Melissa Cabrera

Exercise 2 - Counting the Number of Characters
Create a program that prompts for an input string and displays output that shows the input string and the number of characters the string contains.

Example Output

What is the input string? Homer
Homer has 5 characters.

Constraints

Be sure the output contains the original string.
Use a single output statement to construct the output.
Use a built-in function of the programming language to determine the length of the string.
*/


import util.Output;
import util.StringLength;
import util.UsrInput;

public class CountCharApp {

    public static void main(String[] args) {
        String inputString = UsrInput.readInput();
        int length = StringLength.calculateLength(inputString);
        Output.printOutput(inputString, length);
    }
}
