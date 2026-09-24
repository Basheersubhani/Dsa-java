import java.util.Arrays;

public class Arrayshift {
    public static int[] shift(int arr[])
    {
        int n = arr.length;
        int temp = arr[0];
        for (int i =0; i < n-1; i++)
        {
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
        return arr;
    }
public static void main(String args[])
    {
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        System.out.println(Arrays.toString(shift(arr)));
    }
}