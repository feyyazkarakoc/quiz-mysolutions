package quiz;

public class Q_02 {

    public static void main(String[] args) {


        //Java Program to Check Palindrome String.

        String str = "Java";
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        if (str.equals(reversedStr)) {
            System.out.println(str + " is is a palindrome word.");
        } else {
            System.out.println(str + " is not a palindrome word.");
        }
    }
}
