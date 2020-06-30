package ru.geekbrains.lesson3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Color {

    protected static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {


        while (true){
            printif();
            switch (in.next()){
                case "1": colorRed();break;
                case "2": colorCyan();break;
                case "3": colorYellow();break;
                case "4": colorBlue();break;
                case "0": doExit();
                default:
                    System.out.println("try one more time ");
            }
        }
    }

    public static void printif(){
        System.out.println("\nChoose color of terminal: ");
        System.out.println("1. Red");
        System.out.println("2. Cyan");
        System.out.println("3. Yellow");
        System.out.println("4. Blue");
        System.out.println("0. Exit");
    }

    public static void colorRed(){
        System.out.println("\u001B[31m");
    }
    public static void colorCyan(){
        System.out.println("\u001B[36m");
    }
    public static void colorYellow(){
        System.out.println("\u001B[33m");
    }
    public static void colorBlue(){
        System.out.println("\u001B[34m");
    }

    private static void doExit() {
        System.out.println("Are you sure?? y/n ");
        if (in.next().equals("y")){
            System.exit(0);
        }
    }


}
