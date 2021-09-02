/*
 *   Created by IntelliJ IDEA.
 *   User: Tiwari
 *   Date: 9/1/2021
 *   Time: 8:59 PM
 */
package stepGame;

import java.util.Scanner;

public class StepGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int noOfSteps = scanner.nextInt();
           minimum(noOfSteps);
    }
    public static void minimum(int no_of_steps){
        int evenCounter = 0;
        int oddCounter = 0;
        while(no_of_steps > 0){
            if(no_of_steps % 2 != 0){
                no_of_steps = no_of_steps - 1;
                oddCounter++;
            }
            else {
                no_of_steps /= 2;
                evenCounter++;
            }
        }
        System.out.println(oddCounter + evenCounter);
    }
}
