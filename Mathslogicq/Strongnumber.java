import java.util.Scanner;

public class Strongnumber {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int original =n;
        while(n>0)
        {
            int ld = n % 10;
            int fact = ld;
            for (int i = 1; i < ld; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            n = n / 10;
        }
        if(sum==original)
        {
            System.out.println("Strong number");
        }
        else
        {
            System.out.println("Not a Strong number");
        }
    }
}
