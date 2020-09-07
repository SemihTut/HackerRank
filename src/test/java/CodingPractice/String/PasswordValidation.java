package CodingPractice.String;

public class PasswordValidation {
    public static void main(String[] args) {

        /*
        1. Password MUST be at least have 6 characters and should not contain space

        2. PassWord should at least contain one upper case letter

        3. PassWord should at least contain one lowercase letter

        4. Password should at least contain one special characters

        5. Password should at least contain a digit
         */
    }
//testing
    public static boolean isValid(String password){
        //regex
        String lowercase = "(.*[a-z])";
        String uppercase = "(.*[A-Z])";
        String numbers="(.*[0-9].*)";
        String specialchars="(.*[ -/, :-@].*)";

        boolean hasLower = password.matches(lowercase),
                hasUpper = password.matches(uppercase),
                hasSpecial = password.matches(specialchars),
                hasDigits = password.matches(numbers),
                Valid = false;

        if(password.length()>=6 && !password.contains(" ")){

            if(hasLower&&hasSpecial&&hasUpper&&hasDigits){

                Valid=true;
            }
        }
        return Valid;
    }
}
