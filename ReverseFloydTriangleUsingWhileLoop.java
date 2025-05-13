// Reverse Floyd Triangle pattern using While-loop with Asterisk(star)

public class ReverseFloydTriangleUsingWhileLoop {
    public static void main(String[] args) {
        // base case or starting number
        int i = 1;
        //outer loop to control number of rows
        while(i<=5) {
            // print a single * for row
            System.out.print(" * ");
            // now increments the value of i after printing a single *
            i++;
            // here j is assigned to the current value of i
            int j = i;
            // inner loop to control number of columns
            while (j <= 5) {
                // print a single * for column
                System.out.print(" * ");
                // increments the value of j after printing a single *
                j++;
            }
            //move to the next line after printing asterisk for both the rows and columns
            System.out.println();
        }
    }
}
