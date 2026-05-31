package stage01basics;

import java.util.Scanner;

public class collegePortal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the College Portal   \nThe options are as follows : ");
        System.out.println("1. Student\n" +
                "2. Faculty");
        System.out.print("Enter your choice [1/2] : ");
        int ch = scanner.nextInt();

        switch (ch)
        {
            case 1 : {
                System.out.println("Student ");
                System.out.println("Your options are ");
                System.out.println("1. View Result \n" + "2. Pay Fees");
                System.out.print("Enter your choice [1/2] : ");
                int ch1 = scanner.nextInt();
                switch (ch1)
                {
                    case 1 :
                        System.out.println("1. View Result...");
                        break;
                    case 2 :
                        System.out.println("2. Pay Fees...");
                        break;
                    default:
                        System.out.println("Enter a valid number [1/2] ");
                }
                break;
            }
            case 2 : {
                System.out.println("Faculty ");
                System.out.println("Your options are ");
                System.out.println("1. Mark Attendance\n" + "2. Upload Marks");
                System.out.print("Enter your choice [1/2] : ");
                int ch2 = scanner.nextInt();
                switch (ch2)
                {
                    case 1 :
                        System.out.println("1. Mark Attendance...");
                        break;
                    case 2 :
                        System.out.println("2. Upload Marks...");
                        break;
                    default:
                        System.out.println("Enter a valid number [1/2] ");
                }
                break;
            }
            default:
                System.out.println("Enter a valid number [1/2] ");
        }
        scanner.close();
    }
}
