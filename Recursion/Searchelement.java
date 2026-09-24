public class Searchelement {
    static int find(int arr[],int target,int i)
    {
        if(i>=arr.length)
        {
            return -1;
        }
        if(arr[i]==target)
        {
            return arr[i];
        }
        int ans = find(arr, target, i + 1);
        return ans;
        
    }
    public static void main(String args[])
    {
        int arr[] = { 10, 20, 30, 40, 50 };
        int target = 30;
        int ans = find(arr, target, 0);
        System.out.println(ans);
    }
}
