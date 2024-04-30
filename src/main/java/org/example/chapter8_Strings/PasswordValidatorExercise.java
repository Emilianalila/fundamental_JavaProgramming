package org.example.chapter8_Strings;
/*You will need to verify the strength of a proposal password change*/
/*Rules:
_at least 8 characters long _contain an uppercase letter
_ contain a special character _not contain the username
_not the same as the ols password*/

import java.util.Scanner;

public class PasswordValidatorExercise {
    static String oldPassword = "Chocolate10%";
    static String userName = "PepeArgento";

    public static void main(String[] args) {
    // new password
        System.out.println("Enter your new Password, must contain: at least 8 characters long, an uppercase letter and a special character");
        Scanner scanner = new Scanner(System.in);
        String newPassword = scanner.nextLine();
        // validate the new proposed password
        validatePassword(newPassword);
        scanner.close();
    }
    public static String validatePassword(String newPassword){
        if (newPassword.length() < 8){
            System.out.println("Your password is too short, at least 8 characters long");
        }else if (newPassword.matches("[a-zA-Z0-9]*")){                                       //The regular expression or "regex" [a-zA-Z0-9 ], matches any character that is not an uppercase or lowercase letter, a digit from 0 to 9, or a blank space like this example. This regular expression is commonly used to search for characters that do not belong to a specific set.
            System.out.println("Enter at least one special character");                            // without the (*) it would match only strings containing exactly "one character" of any lowercase, uppercase letter, digit, not whitespace.
        } else if (newPassword.equals(oldPassword)) {
            System.out.println("Enter a different password");
        } else if (newPassword.equals(newPassword.toLowerCase())) {
            System.out.println("Your password must include an uppercase letter");                  // this way check if there is at least one letter in uppercase
        } else if (newPassword.toUpperCase().contains(userName.toUpperCase())) {                  // just in case the name is written in lower Case, the idea is to put everything in upper case and then control if the password have the same name
            System.out.println("Don't use your name in your new password");
        }else if (newPassword.contains(" ")) {
                System.out.println("The password can't have any blank space, try again!");
        }else{
            System.out.println("Your new password is now validate!! "+ newPassword);
        }
        return newPassword;
    }
}


/*. If the password contains at least one character that is not a letter,
 digit, or blank, then the regular expression will not match,
  indicating that the password contains at least one special character or number.
  "easy" else if (newPassword.matches("[a-zA-Z0-9]*")){
So if the password matches this "regular expression", it means that it contains only letters or digits!!! therefor show the message asking to add a special letter,
But if it "doesn't match", it means it contains at least one character that is not a letter or
digit, which means it could contain a special character or another type of symbol. so continue reading the next line

the caret at the regex expression means ("[^a-zA-Z0-9]*") Any characters other than from a to z etc....*/