import java.util.Scanner;

public class LCM {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        System.out.println(getLcm(a,b));
    }

    public static long getGcd(long a, long b){
        if( b == 0){
            return a;
        }else{
            return getGcd(b, a%b);
        }
    }

    public static long getLcm(long a, long b){ //LCM (a,b) = (a X b)/GCD(a,b)
        long product = a * b;
        long HCF = getGcd(a, b);
        return product/HCF;
    }
}