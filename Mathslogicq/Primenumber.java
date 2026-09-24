import java.util.*;
public class Primenumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime = true;
        if(n<=1)
        {
            prime = false;
        }
        for(int i=2;i*i<=n;i++)
        {
            if (n % 2 == 0) {
                prime = false;
                break;
            }
        }
        if(prime)
        {
            System.err.println("Prime number");
        }
        else {
            System.err.println("Not a prime");
        }
    }
}
