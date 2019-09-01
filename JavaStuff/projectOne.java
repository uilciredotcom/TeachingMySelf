import java.util.Scanner;

public class projectOne {
    public static void main(String []args) {
        System.out.println("Hello everyone! This is just a test.");
        
        for (int x = 0; x <= 10; x++ ){
            System.out.println(x);
        }

        Scanner input = new Scanner(System.in);

        System.out.println("What is your favorite color?");
        String answer = input.next();

        System.out.println("You favorite color is " + answer);
        
    
    }
    
}