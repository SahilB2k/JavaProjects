package passwordGenerator;
import java.util.Random;

public class PassGenerator {
    private boolean hasOverlap(String s1, String s2) {
        for (char c : s1.toCharArray()) {
            if (s2.indexOf(c) != -1) {  // More efficient than contains()
                return true;
            }
        }
        return false;
    }

    public String generatePassword(int length, boolean useLowercase, boolean useUppercase, boolean useNumbers, boolean useSpecialChars) {
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "1234567890";  // Fixed the numbers
        String symbols = "!@#$%^&*()?";

        StringBuilder charOptions = new StringBuilder();

        if (useLowercase) {
            charOptions.append(lowercase);
        }
        if (useUppercase) {
            charOptions.append(uppercase);
        }
        if (useNumbers) {
            charOptions.append(digits);
        }
        if (useSpecialChars) {
            charOptions.append(symbols);
        }

        if (charOptions.length() == 0) {
            throw new IllegalArgumentException("At least one character set must be enabled.");
        }

        String allChars = charOptions.toString();
        Random rand = new Random();

        while (true) {
            StringBuilder password = new StringBuilder();

            for (int i = 0; i < length; i++) {
                char nextChar = allChars.charAt(rand.nextInt(allChars.length()));
                password.append(nextChar);
            }

            String pass = password.toString();
            boolean passwordIsValid = true;

            if (useLowercase && !hasOverlap(pass, lowercase)) {
                passwordIsValid = false;
            }
            if (useUppercase && !hasOverlap(pass, uppercase)) {
                passwordIsValid = false;
            }
            if (useNumbers && !hasOverlap(pass, digits)) {
                passwordIsValid = false;
            }
            if (useSpecialChars && !hasOverlap(pass, symbols)) {
                passwordIsValid = false;
            }

            if (passwordIsValid) {
                return pass;  // Return only when valid
            }

            System.out.println("Password failed . trying again..."+pass);
        }
    }

    public static void main(String[] args) {
        PassGenerator generator = new PassGenerator();
        String password = generator.generatePassword(12, true, true, true, true);
        System.out.println("Generated Password: " + password);
    }
}
