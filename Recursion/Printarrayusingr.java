public class Printarrayusingr {
    static void main(int arr[],int i)
    {
        if(i>arr.length)
        {
            return;
        }
        System.out.println(arr[i]);
        main(arr, i + 1);
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5};
        main(arr, 0);
    }
}
