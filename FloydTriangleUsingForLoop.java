//Floyd Triangle Pattern using For-loop with asterisk(star)

public class FloydTriangleUsingForLoop {
    public static void main(String[] args) {
        //outer loop to control number of rows
        for(int i=1;i<=5;i++){
            //inner loop to control number of columns
            for(int j=1;j<=i;j++){
                // printing asterisk for rows and columns
                System.out.print(" * ");
            }
            //new line after executing both the loops for row and column
            System.out.println();
        }
    }
}
