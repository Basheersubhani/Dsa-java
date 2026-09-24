import java.util.Arrays;

public class Shiftarraykpositions {
    public static int[] shift(int arr[])
    {
        int n=arr.length;
        int temp= arr[n- 1];
        for(int i=n-1;i>0;i--)
        {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        
        return arr;
    }
    public static void main(String args[])
    {
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        System.out.println(Arrays.toString(shift(arr)));
    }
}
