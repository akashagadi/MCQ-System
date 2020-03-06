/*
 * This class is created to execute the program, it is the entry point, The Main Class
 */
package com.company;  /* Import com.company package */
public class Main {
    public static void main(String []args){  /* main method */


        Titlename setname =new Titlename();

        String name =setname.takeName();
         Pickset loadfile = new Pickset();
        int file = loadfile.takeFile();
        if (file==2){
            Controlstr mcq = new Controlstr();
            int constant =mcq.controls();
            int total = mcq.total;
            int wrongans = total-constant;
            int percentage =(constant*100)/total;
            System.out.println(name+", you answered\n"+constant+"\nquestion right ,"+wrongans+"\nquestion wrong for a total\n"+ percentage +"%");


        }
        else if (file==1)
        {
            JavaBasics mcq = new JavaBasics();
            int constant =mcq.javabasics();
            int total = mcq.total;
            int wrongans = total-constant;
            int percentage =(constant*100)/total;
            System.out.println(name+", you answered\n"+constant+"\nquestion right,"+wrongans+"\nquestion wrong for a total\n"+percentage +"%");
        }


    }
}