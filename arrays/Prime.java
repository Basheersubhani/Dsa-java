import java.util.*;
class Prime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean Prime = true;
        if(n<=1)
        {
            Prime = false;
        }
        for(int i=2;i<n;i++)
        {
            if (n % i == 0) {
                Prime = false;
                break;
            }
        }
        if(Prime)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Not a prime number");
        }
    }
}