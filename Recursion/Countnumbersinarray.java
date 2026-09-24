public class Countnumbersinarray {
    public static int Countnumbers(int arr[],int i,int target)
    {
        if(i>=arr.length)
        {
            return 0;
        }
        int count = 0;
        if(arr[i]==target)
        {
            count=count+1;
        }
        int ans = Countnumbers(arr, i+1, target);
        return ans+count;
    }
    public static void main(String[] args) {
        int arr[]= { 10, 10, 20, 30, 10, 30, 50 };
        int target = 10;
        int ans = Countnumbers(arr, 0, target);
        System.err.println(ans);
    }
}
