import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FractionalKnapsack {

    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;

        double[][] compares = new double[values.length][2];
        for (int i = 0; i < compares.length; i++) {
            compares[i][0] = (double)values[i] / weights[i];
            compares[i][1] = i;
        }

        Arrays.sort(compares, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                return Double.compare(o2[0], o1[0]);
            }
        });


        for (int i = 0; i < compares.length; i++){

            if (capacity == 0) {
                break;
            }

            if (capacity <= weights[(int)compares[i][1]]) {
                value += compares[i][0] * capacity;
                break;
            }

            value += values[(int)compares[i][1]];
            capacity -= weights[(int)compares[i][1]];

        }

        return value;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int capacity = in.nextInt();


        int[] values = new int[n];
        int[] weights = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = in.nextInt();
            weights[i] = in.nextInt();
        }

        System.out.printf("%.4f\n",getOptimalValue(capacity, values, weights));

    }
} 