/* Program - Program to add two numbers
   Programmer - Reshma Kuskar
   Description - This program takes two numbers from user and prints their addition
 */

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number : ");
        int n1=sc.nextInt();

        System.out.println("Enter second number : ");
        int n2=sc.nextInt();

        System.out.println("Addition of " + n1 + " and " + n2 + " is : " +(n1+n2));

        sc.close();
    }
}
