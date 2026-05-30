package stage01basics;

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to MadLibs -  The World's Strangest Internship");
        System.out.println("Don't think. Type the first thing that comes to mind");
        System.out.println("//////////////////////Lets Go////////////////////// ");

        System.out.print("Enter a person's name: ");
        String name = sc.nextLine();

        System.out.print("Enter a job title: ");
        String job = sc.nextLine();

        System.out.print("Enter a place: ");
        String place = sc.nextLine();

        System.out.print("Enter an animal: ");
        String animal = sc.nextLine();

        System.out.print("Enter an object: ");
        String object = sc.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = sc.nextLine();

        System.out.print("Enter a verb: ");
        String verb = sc.nextLine();

        System.out.print("Enter a food: ");
        String food = sc.nextLine();

        System.out.print("Enter a celebrity name: ");
        String celebrity = sc.nextLine();

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("\n--- MAD LIBS STORY ---\n");

        System.out.println("One morning, " + name +
                " woke up and discovered they had become the world's first " + job + ".");

        System.out.println("Their mission was to travel to " + place +
                " and rescue a lost " + animal + ".");

        System.out.println("Armed with only a " + object +
                ", they set off on their adventure.");

        System.out.println("The journey was extremely " + adjective +
                ", but that didn't stop them from trying to " + verb + ".");

        System.out.println("After " + number +
                " hours, they finally found the animal eating " + food + ".");

        System.out.println("Just then, " + celebrity +
                " appeared and congratulated them for completing the mission.");

        System.out.println("Everyone celebrated, and the story became legendary!");

        sc.close();
    }
}
