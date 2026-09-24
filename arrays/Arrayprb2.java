public class Arrayprb2 {
    public static int multiply10(int arr[])
    {
        int multiply=0;
        for (int i = 0; i < arr.length;i++)
        {
            multiply = arr[i] * 10;
            System.out.print(multiply +" ");
        }
        return multiply;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 3, 6 };
        System.out.println(multiply10(arr));
    }
}
