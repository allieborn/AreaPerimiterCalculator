package com.InClassLabs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            String moveForward = " ";

             while (!moveForward.equals("n")) {

                 System.out.println("Grand Circus Room Size Calculator!");

                 System.out.println("Enter width of classroom: ");
                 Scanner scannersize = new Scanner(System.in);
                 double width = scannersize.nextDouble();

                 System.out.println("Enter length of classroom: ");
                 scannersize.nextLine();
                 double length = scannersize.nextDouble();

                 double area = length * width;
                 System.out.println("The area of your classroom is: " + area);

                 double perimiter = length + length + width + width;
                 System.out.println("The perimiter of your classroom is: " + perimiter);

                 System.out.println("Would you like to continue calculating (y/n)?");
                 scannersize.nextLine();
                 moveForward = scannersize.nextLine();
             }

             System.out.println("Alright, we won't calculate anything.");

    }






    }

