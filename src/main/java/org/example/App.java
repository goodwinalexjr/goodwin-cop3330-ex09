package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner paint = new Scanner(System.in);
        System.out.print("What is the length of the ceiling? ");
        int a = paint.nextInt();
        System.out.print("What is the width of the ceiling? ");
        int b = paint.nextInt();
        int c = a * b;
        int d =(int) Math.ceil(c / 350.0);
        System.out.println("You will need to purchase " + d + " gallons of paint to cover " + c + " square feet.");
    }
}
