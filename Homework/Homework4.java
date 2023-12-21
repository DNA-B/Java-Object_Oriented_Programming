package Homework

import java.util.Scanner;

class GCD {
    int gcdWhile(int m, int n) {
        int tmp;
        while (n != 0) {
            tmp = m % n;
            m = n;
            n = tmp;
        }

        return m;
    }

    int gcdRec(int m, int n) {
        return (n == 0) ? m : gcdRec(n, m % n);
    }
}

public class Homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GCD gcd = new GCD();
        int x, y;

        System.out.printf("두 수를 입력하세요: ");

        x = sc.nextInt();
        y = sc.nextInt();

        System.out.printf("(반복문) 두 수의 최대공약수는 %d입니다.\n", gcd.gcdWhile(x, y));
        System.out.printf("(재귀) 두 수의 최대공약수는 %d입니다.", gcd.gcdRec(x, y));
    }


}
