public class Missingnumber {
    public static int Missing(int arr[])
    {
        int n = arr.length;
        int xor = 0;
        // Finding xor of array
        for(int i=0;i<n;i++)
        {
            xor = xor ^ arr[i];
        }
        // Range of xor
        for(int i=1;i<=n;i++)
        {
            xor = xor ^ i;
        }
        return xor;
        
    }
    public static void main(String[] args) {
        int arr[] = { 0, 1, 3, 4, 5 };
        System.out.println(Missing(arr));
    }
}
