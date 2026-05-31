package stage01basics;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Alphabet : ");
        char c = scanner.next().trim().toLowerCase().charAt(0);
        if(c>='a'&&c<='z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                System.out.println("Its a vowel");
            else
                System.out.println("Its a consonant");

        }
        else
            System.out.println("Invalid input. Please enter a single alphabet (a–z).");
        scanner.close();
    }
}
