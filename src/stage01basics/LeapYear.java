package stage01basics;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Year : ");
        int year = scanner.nextInt();

        if(year%100==0 && year % 400 ==0 )
            System.out.println("Its a leap year ");
        else if(year%100!=0 && year%4==0)
            System.out.println("Its is a leap year ");
        else
            System.out.println("Its not a leap year");
    }
}
