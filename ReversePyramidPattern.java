// Reverse pyramid pattern using asterisk(*)
public class ReversePyramidPattern {
    public static void main(String[] args){
        // outer loop to control the number of row
        for (int i=5; i>0; i--){
            // inner loop to print the white spaces to make the diamond shape
            for (int j=0+i; j<5; j++){
                // prints white space
                System.out.print(" ");
            }
            // nested inner loop to control the number of columns
            for (int k=1; k<=i; k++ ){
                // prints star and white space after printing the star
                System.out.print("* ");
            }
            // cursor move to the next line after printing the star in row or column
            System.out.println();
        }

    }
}
