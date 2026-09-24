import java.util.Scanner;
public class Searchelement {
    public static boolean findelement(int[] arr,int Target) {
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i] == Target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Target = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        boolean ans = findelement(arr, Target);
        System.out.println(ans);
        
    }
}
