pacakge Homework
    
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        System.out.printf("몇 개의 수를 입력할 예정인가요? ");
        N = sc.nextInt();
        
        int arr[] = new int[N];

        System.out.printf("수를 입력하세요: ");
        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();

        int v_max = arr[0];
        int v_min = arr[0];

        for (int i = 0; i < N; i++) {
            if(arr[i] > v_max)
                v_max = arr[i];

            if(arr[i] < v_min)
                v_min = arr[i];
        }

        System.out.printf("최대값: %d\n", v_max);
        System.out.printf("최소값: %d\n", v_min);
    }
}

/*
몇 개의 수를 입력할 예정인가요? 3
수를 입력하세요: 7 4 2
최대값: 7
최소값: 2
 */
