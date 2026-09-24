public class Maxelement {
    static void max(int arr[],int maxi,int i)
    {
        if(i>=arr.length)
        {
            System.out.println(maxi);
            return;
        }
        if (arr[i] > maxi) {
            maxi = arr[i];
        }
        max(arr, maxi, i + 1);
    }
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int maxi = Integer.MIN_VALUE;
        max(arr,maxi,0);
    }
}
