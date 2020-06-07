import java.util.Scanner;

public class GCD {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(getGcd(a,b));
    }

    public static int getGcd(int a, int b){
        if( b == 0){
            return a;
        }else{
            return getGcd(b, a%b);
        }
    }
}