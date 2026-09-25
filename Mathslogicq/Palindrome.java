import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int x = n;
        while(n>0)
        {
            int ld = n % 10;
            rev = rev * 10 + ld;
            n = n / 10;
        }
        if(x==rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
