public class Sumofarray{
    public static int[] sum(int arr[]) {
        int possum = 0;
        int negsum = 0;
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i] > 0) {
                possum += arr[i];
            } else {
                negsum += arr[i];
            }
        }
        int ans[] = { possum, negsum };
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = { 1, -2, 3, -4, 3, -2 };
        int ans[] = sum(arr);
        System.out.println("positive sum " +ans[0]);
        System.out.println("Negative sum " +ans[1]);
    }
}