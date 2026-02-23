public class UseCase1PalindromeApp {


    public static void main(String[] args){

        //USE CASE 1
        /*
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");

        //USE CASE 2
        String input= "madam";
        if(input== null || input.trim().isEmpty()){
            System.out.println("Empty String, Please enter a String");
            return;//        }
        boolean plaindrome = true;
        for(int i=0;i<input.length()/2;i++){
            if(input.charAt(i) != input.charAt((input.length())-i-1)) {
                plaindrome = false;
            }
       }
       if(plaindrome){
          System.out.println("Is it a palindrome : "+plaindrome);
       }
       else{
            System.out.println("Is it a palindrome : "+plaindrome);
        }
*/
        String input ="radar";
        System.out.println("Input Text: "+ input);

        //USE CASE 3
/*
        String rev = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            rev = rev + input.charAt(i);
        }
        if (input.equals(rev)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        */

        //USE CASE 4

        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean Palindrome = true;

        while (start < end) {

            if (chars[start] != chars[end]) {
                Palindrome = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("Is it a palindrome: " + Palindrome);

    }
}
