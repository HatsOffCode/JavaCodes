// Floyd Triangle Pattern Using do...while-loop with asterisk(star)

public class FloydTriangleUsingDoWhile {
    public static void main(String[] args) {
        // starting number for row
        int i=1;
        do{
            // starting number for column
            int j=1;
            do{
                //printing a single asterisk
                System.out.print(" * ");
                // increments the value of j after printing a *
                j++;
            }
            // inner loop to control number of columns
            while(j<=i);
            // move to new line after printing asterisk for each row and column
            System.out.println();
            // increments the value of i after printing a single asterisk
            i++;
        }
        // outer loop to control the number rows
        while(i<=5);
    }
}
