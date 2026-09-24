public class Maximumofelements {
    public static int maximum(int arr[],int max)
    {
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5,82, 4 };
        int max = arr[0];
        System.out.println(maximum(arr, max));
    }
}
