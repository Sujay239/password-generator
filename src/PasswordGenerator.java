import java.security.SecureRandom;

public class PasswordGenerator {
    private static  final String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String lowercase = "abcdefijklmnopqrstuvwxyz";
    private static final String numbers = "0123456789";
    private static final String specialChars = "!@#$%^&*()-_=+[]{}|;:,.<>?/~`";

    private static final SecureRandom random = new SecureRandom();

    public static String generatePassword(int length, boolean useUppercase, boolean useLowercase, boolean useNumbers, boolean useSpecialChars){
        if(length <= 0) throw new IllegalArgumentException("Password length must be greater than 0");
        StringBuilder characterPool = new StringBuilder();
        if(useUppercase) characterPool.append(uppercase);
        if(useLowercase) characterPool.append(lowercase);
        if(useNumbers) characterPool.append(numbers);
        if(useSpecialChars) characterPool.append(specialChars);

        if(characterPool.isEmpty()) throw new IllegalArgumentException("At least one character type must be selected");
        StringBuilder password = new StringBuilder(length);
        for(int  i = 0; i < length; i++){
            int index = random.nextInt(characterPool.length());
            password.append(characterPool.charAt(index));
        }
        return password.toString();
    }
}
