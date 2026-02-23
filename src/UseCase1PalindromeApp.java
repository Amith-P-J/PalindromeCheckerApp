public class UseCase1PalindromeApp {
    public static void main(String[] args){
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");
        String input= "madam";
        System.out.println("Input Text: " + input);


        if(input== null || input.trim().isEmpty()){
            System.out.println("Empty String, Please enter a String");
            return;
        }


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
    }
}
