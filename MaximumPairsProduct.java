import java.util.Arrays;
import java.util.Scanner;

public class MaximumPairsProduct {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i< n ; i++){
             a[i] = in.nextInt();
        }
        System.out.println(pairProduct(a));
    }

    public static long pairProduct(int arr[]) {
        int l = arr.length;
        Arrays.sort(arr);

        long f = arr[l-1];
        long q = arr[l-2];

        long result = f * q;

        if(arr[1] >= 0){
            return result;
        }else{
            return Math.max(result, arr[0] * arr[1]);
        }
    }    
}