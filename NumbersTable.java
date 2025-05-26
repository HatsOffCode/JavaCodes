// Program to print number's table
import java.util.*;

public class NumbersTable {
    public static void main(String[] args) {
        // Scanner object
        Scanner sc = new Scanner(System.in);
        // Declaring variables
        int from, till, time;
        // Prompt the user to enter start number of table
        System.out.print("Enter the start number from where to start : ");
        from = sc.nextInt();
        // Prompt the user to enter end number of table
        System.out.print("Enter the last number till where to print : ");
        time = sc.nextInt();
        // Prompt the user to enter number of times
        System.out.print("Enter how many time table should print : ");
        till = sc.nextInt();
        // Outer loop to control start number & number of times the table will print
        for(int i = from; i <= time; i++){
            // Inner loop to control end number lf table
            for(int j = 1; j <= till; j++){
                // printing tables
                System.out.println(i + " * " + j + " = " + i*j);
            }
            // move to the next line after printing the table of a number
            System.out.println();
        }
    }
}
