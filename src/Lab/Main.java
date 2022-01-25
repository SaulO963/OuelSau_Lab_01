package Lab;

import java.util.Scanner;

/***
 * Name: Saul Ouellet
 * Date: January 18th 2022
 * Description: Simple hello world project to get everything working! Also a small amount of playing
 *              around with scanners and arrays just for fun.
 */

public class Main {

    /***
     * it's a main function, what else is there to say?
     * @param args This supplies arguments to the main function.
     */
    public static void main(String[] args) {

    System.out.println("Hello World! I'm doing well, how're you doing?");

    Scanner sc = new Scanner(System.in);
    String scanned = sc.nextLine();

    System.out.println("You said: " + scanned + ".\nThat's great to hear! Have a good day."); //RIP cout and cin, you will be missed

    String[] newArr = {"These","are","just","random","strings!"};

    for(int i = 0; i<newArr.length;i++){
        System.out.println((i+1) + " " + newArr[i] + " ");
    }

    }//main bracket

}//Main bracket
