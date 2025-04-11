
package smallestnumbersquared;

import java.util.Scanner;


public class SmallestNumberSquared {

    
    public static void main(String[] args) {
        // Read in 2 numbers from the keyboard.
        // Display the square of the smallest number.
        // Has an output message that displays both the smallest number and square of the number. 
        
        Scanner kbd = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int num1 = kbd.nextInt();
        int result1 = num1 * num1;
        
        System.out.println("Enter the second number: ");
        int num2 = kbd.nextInt();
        int result2 = num2 * num2;
        
        if(num1 > num2){
            System.out.println(num2 + " is the smallest number and " + num2 + " squared is " + result2);
        } else {
            System.out.println(num1 + " is the smallest number and " + num1 + " squared is " + result1);
        }
    }
    
}
