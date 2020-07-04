package ru.geekbrains.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// сделала по разбору ДЗ
public class RiddleGame {

    public static final int FAKE_WORD_LENGTH = 15;
    public static final String[] WORDS = new String[] {
            "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
            "olive", "pea", "peanut", "pear", "pepper", "pumpkin", "potato"};

    public  static void main(String[] args) {

        System.out.println("Here is words. I'm made a word. Can you guess it: " + Arrays.toString(WORDS));

        Random random = new Random();
        int index = random.nextInt(WORDS.length);
        String targetWord = WORDS[index];
        String userWord = null;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Write the word: ");
            userWord = scanner.nextLine();

            if(isWin(targetWord, userWord)) {
                System.out.println("You're RIGHT!");
                break;
            }

            System.out.println("Mistake. I'll help you.");
            printPrompt(targetWord, userWord);
            System.out.println();
        } while(true);

        System.out.println("Game is over!");
    }

    private  static void printPrompt(String targetWord, String userWord) {
        for(int i = 0; i < FAKE_WORD_LENGTH; i++) {
            char chr = '#';
            if (i < userWord.length() && i < targetWord.length() && userWord.charAt(i) == targetWord.charAt(i)){
                chr = userWord.charAt(i);
            }
            System.out.print(chr);
        }
    }

    private static boolean isWin(String targetWord, String userWord){
        return targetWord.equals(userWord);
    }

}
