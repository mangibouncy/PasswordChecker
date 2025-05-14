public class PasswordChecker {
    
    public static String checkStrength(String password){
        
        boolean hasNumber = false;
        boolean hasLetter = false;
        boolean hasSpecial = false;

        if (password.length() < 8) {
            return "weak password";
        }

        for (int i = 0; i < password.length(); i++) {
            char letter = password.charAt(i);

            if (Character.isDigit(letter)) {
                hasNumber = true;
            } else if (Character.isLetter(letter)) {
                hasLetter = true;
            } else if (!Character.isWhitespace(letter)) {
                hasSpecial = true;
            }
        }

        if (hasNumber && hasLetter && hasSpecial) {
            return "good password";
        } else {
            return "weak password";
        }
    }

    public static void main(String[] args) {
        StdOut.print("Enter your password: ");
        String password = StdIn.readLine();
        String result = checkStrength(password);
        StdOut.println(result);
    }
}
