/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Sarim Jatt
 */
package org.example;
import java.util.Scanner;
public class App {
    public static void main( String[] args ) {

        Scanner in = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? ");
        char silent = in.next().charAt(0);
        if(silent == 'y') {
            System.out.print("Are the battery terminals corroded? ");
            char corroded = in.next().charAt(0);
            if(corroded == 'y') {
                System.out.println("Clean terminals and try starting again.");
                return;
            }
            else if(corroded == 'n') {
                System.out.println("Replace cables and try again.");
                return;
            }
        }
        else if(silent == 'n') {
            System.out.print("Does the car make a slicking noise? ");
            char slicking = in.next().charAt(0);
            if(slicking == 'y') {
                System.out.println("Replace the battery.");
                return;
            }
            else if(slicking == 'n') {
                System.out.print("Does the car crank up but fail to start? ");
                char crank = in.next().charAt(0);
                if(crank == 'y') {
                    System.out.println("Check spark plug connections.");
                    return;
                }
                else if(crank == 'n') {
                    System.out.print("Does the engine start and then die? ");
                    char engine = in.next().charAt(0);
                    if(engine == 'y') {
                        System.out.print("Does your car have fuel injection? ");
                        char fuel = in.next().charAt(0);
                        if (fuel == 'y') {
                            System.out.print("Get it in for service. ");
                            return;
                        } else if (fuel == 'n') {
                            System.out.print("Check to ensure the choke is opening and closing.");
                            return;
                        }
                    }
                    else if(engine == 'n') {
                        System.out.print("This should not be possible.");
                        return;
                    }
                }
            }
        }
        in.close();
    }
}