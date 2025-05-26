// Simple Calculator in Java

import java.util.*;

public class SimpleCalculator {
    // method or function to perform addition
    static double add(double num1, double num2){
        // return the final value after adding 1st & 2nd operand
        return (num1 + num2);
    }
    // method to perform subtraction
    static double subtract(double num1, double num2){
        // return the final value after subtracting the 2nd operand with the 1st operand
        return (num1 - num2);
    }
    // method to perform multiplication
    static double multiply(double num1, double num2){
        // return the final value after multiplying 1st operand by the 2nd operand
        return (num1 * num2);
    }
    // method to perform division
    static double divide(double num1, double num2){
        if(num2 == 0){
            System.out.println("Undefined! .. denominator can't be zero");
        }
        // return the final value after dividing the 1st operand by the 2nd operand
        return (num1 / num2);
    }
    // method to perform modulation
    static double modulo(double num1, double num2){
        // return the reminder after dividing the 1st operand by the 2nd operand
        return (num1 % num2);
    }

    // main method
    public static void main(String[] args) {
        // declare & initialize a variable to store final results
        double result = 0;
        // scanner object
        Scanner sc = new Scanner(System.in);
        // prompt the user for 1st operand
        System.out.print("Enter fist number : ");
        double x = sc.nextDouble();
        // prompt the user for operator
        System.out.print("Enter operator ('+, -, *, /, %') : ");
        char operator = sc.next().charAt(0);
        // prompt the user for 2nd operand
        System.out.print("Enter second number : ");        double y = sc.nextDouble();
        // condition to calculate
        if(operator == '+'){
            result = add(x,y);
        }
        else if(operator == '-'){
            result = subtract(x,y);
        }
        else if(operator == '*'){
            result = multiply(x,y);
        }
        else if(operator == '/'){
            result = divide(x,y);
        }
        else if(operator == '%'){
            result = modulo(x,y);
        }
        else{
            System.out.println("Please enter a valid operator.");
        }
        // displaying the final result after calculation
        System.out.println("The result is : "+result);

    }
}
