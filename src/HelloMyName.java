import java.util.Scanner;
public class HelloMyName {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your username");
        String username = keyboard.next();
        System.out.println("Enter your password");
        int password = keyboard.nextInt();
        System.out.println("Hello " + username + ". Welcome to CSC 200 class! Your Password is " + password + ".");
    }
}
