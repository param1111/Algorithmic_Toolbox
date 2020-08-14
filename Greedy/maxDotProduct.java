import java.util.*;

public class maxDotProduct {

    private static long minDotProduct(int[] a, int[] b) {

        Arrays.sort(a);
        Arrays.sort(b);

        long result = 0;

        for (int i = 0; i < a.length; i++) {
            result += (long)a[i] * b[b.length - i -1];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        // Get array a
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        // Get array b
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }

        System.out.println(minDotProduct(a, b));
    }
}