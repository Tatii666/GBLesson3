package ru.geekbrains.lesson3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int answer = (int) (Math.random() * 10);
        int maxTryCount = 3;

        Scanner scanner = new Scanner(System.in);
         while (true) {
             printChange();
             int change = scanner.nextInt();
             if (change == 0) {
                 System.exit(0);
             }

             System.out.println("Guess the number from 0 to 9: ");
             int userAnswer = scanner.nextInt();
             System.out.println("User answer is: " + userAnswer);

             for (int tryCount = 1; tryCount <= maxTryCount; tryCount++) {
                 if (userAnswer == answer) {
                     System.out.println("Congratulation! You WON!");
                     break;
                 } else if (userAnswer > answer) {
                     System.out.println("Your number too big.");
                 } else if (userAnswer < answer) {
                     System.out.println("Your number too small.");
                 }
                 System.out.println("Try one more time. Guess the number 0 to 9\n You have: " + (maxTryCount - tryCount) + " attempts");
                 userAnswer = scanner.nextInt();

                 if (tryCount == maxTryCount)
                     System.out.println("You lose!");

             }
         }
    }
    public static void printChange(){
        System.out.println("Welcome, my friend!");
        System.out.println("Choose the options:");
        System.out.println("1. Play");
        System.out.println("0. Exit");
    }



}


