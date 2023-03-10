package com.stringcompare;

import java.util.Scanner;

public class stringcompare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        System.out.println("enter a first String");
        s1= sc.nextLine();

        System.out.println("enter a second String");
        s2= sc.nextLine();
        if( s1.equals(s2))
            System.out.println("both are same");

        else

            System.out.println("both are not same");

    }
}
