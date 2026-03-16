/* Program - Swap two numbers
   Programmer - Reshma Kuskar
   Description - This program accepts two numbers from user and swap them using third variable
 */

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter two numbers for swapping : ");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("After swapping numbers are : " + n1 + " " + n2);

        sc.close();
    }
}
