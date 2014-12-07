package hackerrank;

import java.util.Scanner;

/**
 *
 * @author riyafa
 */
public class MaximizingXOR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int max=0,n;
        for (int i = l; i < r; i++) {
            for (int j = l+1; j <=r; j++) {
                n=i ^ j;
                if (n>max) {
                    max=n;
                }
            }
        }
        System.out.println(max);
    }
}
