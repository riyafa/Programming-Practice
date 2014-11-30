package hackerrank;

import java.util.Scanner;

/**
 *
 * @author A.H.F. Riyafa
 */
public class FindDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,number,div;
        int n=sc.nextInt();
        int count;
        for (int i = 0; i < n; i++) {
            count=0;
            num=sc.nextInt();
            number=num;
            while (number > 0) {
                div=number % 10;
                if(div>0)
               if(num%(div)==0)
                    count++;
                number = number / 10;
            }
            System.out.println(count);
        }
    }
}
