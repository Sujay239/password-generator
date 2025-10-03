public class MainApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Password Generator!");
        // Here you can add code to interact with the user and call PasswordGenerator.generatePassword()
        PasswordGenerator generator = new PasswordGenerator();
        String password = PasswordGenerator.generatePassword(12, true, true, true, true);
        System.out.println("Generated Password: " + password);
    }
}
