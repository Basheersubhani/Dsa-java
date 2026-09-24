import java.util.Arrays;

class Prefixsum {
    public static int[] prefix(int arr[])
    {
        int n= arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i=1;i<n;i++)
        {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }
    public static void main(String args[])
    {
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(prefix(arr)));
    }
}