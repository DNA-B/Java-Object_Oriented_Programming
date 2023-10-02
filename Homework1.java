import  java.util.Scanner;

public class Homework1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int x;

        for (int i = 0; i < 5; i++) {
            System.out.printf("정수를 입력하세요 : ");
            x = sc.nextInt();
            total += x;
            System.out.println("현재까지 입력된 정수의 합은 " + total + "입니다.");
        }
    }
}