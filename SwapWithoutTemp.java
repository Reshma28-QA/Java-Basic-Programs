/* Program - Swapping numbers without using third variable
   Programmer - Reshma Kuskar
   Description - This program takes two numbers from user and swaps them without
                 using third variable
 */

import java.util.Scanner;

public class SwapWithoutTemp {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers to swap : ");

        int n1=sc.nextInt();
        int n2=sc.nextInt();

        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;

        System.out.println("Two numbers after swapping are : " + n1 + " " + n2);
        sc.close();
    }

}
