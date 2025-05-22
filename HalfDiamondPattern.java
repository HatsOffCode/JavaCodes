// Half diamond pattern using asterisk symbol.

public class HalfDiamondPattern {
    public static void main(String[] args) {
        // initialize variables
        int i, j,k,l;
        // 90 degree floyd triangle concept using 2 for loops
        // start...
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        } // ...end

        // now, reverse 90 degree floyd triangle pattern using 2 loops
        // start...
        for(k=4;k>=1;k--){
            for(l=1;l<=k;l++){
                System.out.print("*");
            }
            System.out.println();
        } // ...end

        // by combining both the reverse & straight 90 degree triangle of code we get the half diamond pattern.

    }
}
