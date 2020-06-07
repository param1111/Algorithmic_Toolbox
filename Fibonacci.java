import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n+1];
    System.out.println(calFibonacci(a, n));
    }
    public static int calFibonacci(int arr[],int n){
        if(n>1){
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i <= n ; i++){
            arr[i] = arr[i-1] + arr[i-2]; 
        }
        return arr[n];
    }else if(n == 1){
        return 1;
    }
    else{
        return 0;
    }
    }
}