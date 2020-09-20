import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if ((ch >= 65) && (ch <= 90)) {
            int cap = ch +32;
            ch = (char)(cap);
            return ch;
        }
        else {
            ch  = (char) (ch);
            return ch;
        }
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        int lenStr = str.length();
        String LowCaseString = "";
        for (int i = 0; i < lenStr; i++) {
            char ch = str.charAt(i);
            if ((ch >= 65) && (ch <= 90)) {
                int cap = ch + 32;
                ch = (char)(cap);
                LowCaseString += ch;
            }
            else {
                ch = (char)(ch);
                LowCaseString += ch;
            }
        }
        return LowCaseString;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if (ch<97) {
            return ch;
        }
        else {
            return (char)(ch -32);
        }
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        String returnstring = "";
        int Strlength = str.length();
        for (int i = 0; i < Strlength;i++) {
            if (str.charAt(i)<97){
                returnstring += str.charAt(i);
            }
            else{
                returnstring += (char)(str.charAt(i)-32);
            }
        }
        return returnstring;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String InputStr = scan.nextLine();
        Scanner scan2 = new Scanner (System.in);
        System.out.println("What would you like to make your string lowercase or uppercase?");
        String InputStr2 = scan2.nextLine();
        if (InputStr2.equals("lowercase")) {
            System.out.println("Here is your string in lowercase: " + myToLowerCase(InputStr));
        }
        else if (InputStr2.equals("uppercase")) {
            System.out.println("Here is your string in uppercase: " + myToUpperCase(InputStr));
        }
    }
}
