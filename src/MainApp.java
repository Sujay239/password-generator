import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Password Generator!");
        // Here you can add code to interact with the user and call PasswordGenerator.generatePassword()
        PasswordGenerator generator = new PasswordGenerator();
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter desired password length: ");
        int length = sc.nextInt();
        System.out.print("Include uppercase letters? (y/n): ");
        boolean useUppercase = sc.next().equalsIgnoreCase("y");
        System.out.print("Include lowercase letters? (y/n): ");
        boolean useLowercase = sc.next().equalsIgnoreCase("y");
        System.out.print("Include numbers? (y/n): ");
        boolean useNumbers = sc.next().equalsIgnoreCase("y");
        System.out.print("Include special characters? (y/n): ");
        boolean useSpecialChars = sc.next().equalsIgnoreCase("y");

        try {
            String password = PasswordGenerator.generatePassword(length, useUppercase, useLowercase, useNumbers, useSpecialChars);
            System.out.println("Generated Password: " + password);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
