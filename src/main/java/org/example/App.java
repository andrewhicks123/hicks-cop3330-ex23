/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Andrew Hicks
 */

package org.example;
import java.util.*;

public class App {
    public static void main( String[] args) {
        Scanner input = new Scanner(System.in);
        char letter;
        System.out.print("Is the car silent when you turn the key? ");
        letter = input.next().charAt(0);
        if (letter == 'y') {
            System.out.print("Are the battery terminals corroded? ");
            letter = input.next().charAt(0);
            if (letter == 'y')
                System.out.println("Battery may not be clean.\nClean the terminals and try starting again.");
            else
                System.out.println("The battery cables may be damaged.\nReplace cables and try again");
        } else {
            System.out.print("Does the car make a slicking noise? ");
            letter = input.next().charAt(0);
            if (letter == 'y')
                System.out.println("Battery may be damaged.\nReplace the Battery.");
            else {
                System.out.print("Does the car crank up but fail to start? ");
                letter = input.next().charAt(0);
                if (letter == 'y')
                    System.out.println("Spark plug connection may be loose.\nCheck spark plug connection.");
                else {
                    System.out.print("Does the engine start and then die? ");
                    letter = input.next().charAt(0);
                    if (letter == 'y') {
                        System.out.println("Does your car have fuel injection? ");
                        letter = input.next().charAt(0);
                        if (letter == 'y')
                            System.out.println("Get in it for service.");
                        else
                            System.out.println("Check to ensure the choke is opening and closing.");
                    } else {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }

}