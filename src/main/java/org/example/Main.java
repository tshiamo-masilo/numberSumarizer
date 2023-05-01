package org.example;

import java.math.BigInteger;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Enter number: ");
        Scanner scan = new Scanner(System.in);
        String inputNum = scan.next();
        BigInteger numToConvert = new BigInteger(inputNum);
        NumberReducer reducerObj = new NumberReducer(numToConvert);
        reducerObj.printNumber();
    }
}