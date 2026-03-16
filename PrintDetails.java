/* Program : Print user details
   Programmer : Reshma kuskar
   Description : This program accepts  details from user like name, age, city and prints it
 */

import java.util.Scanner;

public class PrintDetails {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);

        String name,city;
        int age;

        System.out.println("Enter your name : ");
        name=sc.nextLine();

        System.out.println("Enter your city : ");
        city=sc.nextLine();

        System.out.println("Enter your age : ");
        age=sc.nextInt();
        
        System.out.println("Details are : ");
        System.out.println("Name - " +name);
        System.out.println("Age - " +age);
        System.out.println("City - " +city);

        sc.close();
    }
}
