package chapter8;

public class ReverseString {

    public static void main(String[] args){
        reverseString("I love dogs!");
    }

    /**
     * Prints a String in reverse order
     * @param text String to reverse
     */
    public static void reverseString(String text){
        for(int i=text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }
    }
}

