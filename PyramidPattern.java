//Pyramid using star pattern

public class PyramidPattern {
    public static void main(String[] args){
        // outer loop to control the number of rows
        for (int i=0; i<5; i++){
            // inner loop to print the white spaces to make the diamond shape
            for (int j=5-i; j>1; j--){
                // prints the white space
                System.out.print(" ");
            }
            // nested inner loop to control the number of columns
            for (int k=0; k<=i; k++ ){
                // prints star and white space after printing the star
                System.out.print("* ");
            }
            // cursor move to the next line after printing the star in row or column
            System.out.println();
        }
    }
}
