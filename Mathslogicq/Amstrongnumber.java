import java.util.*;
public class Amstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int original = n;
        while(n>0)
        {
            int digit = n % 10;
            sum = sum + digit * digit * digit;
            n = n / 10;
        }
        if(sum==original)
        {
            System.out.println("Amstrong number");
        }
        else
        {
            System.out.println("Not an amstrong number");
        }
    } 
}