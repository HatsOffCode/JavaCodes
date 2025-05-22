// Full diamond pattern using asterisk(*)

public class FullDiamondPattern {
    public static void main(String[] args){
        // initialize variables
        int i, j, k, l, m, n;
        // pyramid pattern code
        // start...
        for (i=0; i<5; i++){
            for (j=5-i; j>1; j--){
                System.out.print(" ");
            }
            for (k=0; k<=i; k++ ){
                System.out.print("* ");
            }
            System.out.println();
        } // ...end

        // reverse pyramid pattern
        // start...
        for (l=4; l>0; l--){
            for (m=0+l; m<5; m++){
                System.out.print(" ");
            }
            for (n=1; n<=l; n++ ){
                System.out.print("* ");
            }
            System.out.println();
        } // ...end
        // by combining both the straight & reverse pyramid pattern code, we get the full diamond pattern

    }
}
