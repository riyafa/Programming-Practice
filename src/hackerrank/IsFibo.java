package hackerrank;

import java.math.BigDecimal;
import java.util.Scanner;


public class IsFibo {

    private static BigDecimal zero = BigDecimal.valueOf(0);

    private static BigDecimal one = BigDecimal.valueOf(1);

    private static BigDecimal two = BigDecimal.valueOf(2);


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long T=sc.nextLong();
        for (int i = 0; i < T; i++) {
            BigDecimal n = new BigDecimal(sc.next());

            if (isFibonacci(n)) {

                System.out.println("IsFibo");

            } else {

                System.out.println("IsNotFibo");

            }


        }
    }


    public static boolean isFibonacci(BigDecimal n) {

        BigDecimal[] outputs1 = unFib(one, one, n);

        BigDecimal a = outputs1[1];


        return n.compareTo(a) == 0;

    }


    private static BigDecimal[] unFib(BigDecimal a, BigDecimal b, BigDecimal n) {

        if (n.compareTo(a) < 0) {

            return new BigDecimal[] { zero, zero, one };

        }


        BigDecimal[] inputs1 = fibPlus(a, b, a, b);

        BigDecimal[] outputs1 = unFib(inputs1[0], inputs1[1], n);

        BigDecimal k = outputs1[0];

        BigDecimal c = outputs1[1];

        BigDecimal d = outputs1[2];


        BigDecimal[] outputs2 = fibPlus(a, b, c, d);

        BigDecimal e = outputs2[0];

        BigDecimal f = outputs2[1];


        if (n.compareTo(e) < 0) {

            return new BigDecimal[] { two.multiply(k), c, d };

        }


        return new BigDecimal[] { two.multiply(k).add(one), e, f };

    }


    private static BigDecimal[] fibPlus(BigDecimal a, BigDecimal b, BigDecimal c, BigDecimal d) {

        BigDecimal bd = b.multiply(d);


        return new BigDecimal[] {

            bd.subtract(b.subtract(a).multiply(d.subtract(c))),

            a.multiply(c).add(bd)

        };

    }

}