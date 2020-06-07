import java.util.Scanner;

public class LstFibonacci {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long a[] = new long[n + 1];
        System.out.println(calFibonacci(a, n));
    }

    public static long calFibonacci(long arr[], int n) {
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 10;
        }
        return arr[n];

    }
}