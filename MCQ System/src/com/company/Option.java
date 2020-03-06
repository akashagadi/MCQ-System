/*
 * This class is created to check whether the option received is correct or not
 */

package com.company;    /* Import com.company package */

import java.util.Scanner;   /* Import Scanner Class */

public class Option {
int z;
public  int value() {
    System.out.println("\nYour Choice ; ");
    Scanner c = new Scanner(System.in);     /* New Instance Created called 'c' */
    String choice = c.next();
    System.out.println();
    if (choice.equals("a")  ||  choice.equals("A")){         /* Declaring If Else Condition */
        z = 1;
        return z;
    }
   else if(choice.equals("b")  ||  choice.equals("B")) {      /*Initializing If ELSE ladder */
        z = 2;
        return z;
    }
    else if(choice.equals("c")  ||  choice.equals("C")) {
        z = 3;
        return z;
    }
    else if(choice.equals("d")  ||  choice.equals("D")) {
        z = 4;
        return z;
    }
    else {
        System.out.println("Invalid Input");
        value();
    }
    return z;
}
}










