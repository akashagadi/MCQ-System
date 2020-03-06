package com.company;

/*
 * This class is created to read the java.CSV class which consists the questions and their answers
 */

import java.io.File;   /* Import File Class */
import java.io.FileNotFoundException;   /* Import FileNotFoundException Class */
import java.util.Scanner;   /* Import Scanner Class */
public class Controlstr {
    int total;
    String name = "Controlstructures.CSV";  /* Import CSV File  */
    File aka = new File (name);
    int constant = 0;
    public int controls() {          /* new method created */
        try{                            /* Implementing Try Catch */
            Scanner A = new Scanner(aka);
            while (A.hasNext()) {       /* Declaring While Condition */
                String data = A.nextLine();
                String[] split = data.split(",");
                System.out.println();
                /* Taking Values in an array */
                System.out.println(split[0]);
                System.out.println(split[1]);
                System.out.println(split[2]);
                System.out.println(split[3]);
                System.out.println(split[4]);
                int answer = Integer.parseInt(split[5]);
                Option a = new Option();
                int set = a.value();
                if (set == answer) {         /* Declaring If Else Condition */
                    System.out.println("Correct");
                    System.out.println();
                    constant++;
                    total++;
                } else {
                    System.out.println("Wrong answer, the correct answer is " + split[answer]);
                    System.out.println();
                    total++;
                }
            }
            A.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return constant;
    }
}


