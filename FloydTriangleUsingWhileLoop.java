// Floyd Triangle Pattern using While-loop with Asterisk(star)

public class FloydTriangleUsingWhileLoop {
    public static void main(String[] args) {
        //starting number for row
        int i = 1;
        //outer loop to control number of rows
        while(i<=5) {
            //starting number for column
            int j = 1;
            //inner loop to control number of columns
            while (j <= i) {
                System.out.print(" * ");
                j++;//increments the value of j after printing a single asterisk
            }
            //new line after executing both the loops for row and column
            System.out.println();
            i++;//increments the value of i after printing a single asterisk
        }
    }
}
