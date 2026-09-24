public class Countzeroesones {
    public static int[] count(int arr[])
    {
        int zeroes = 0;
        int ones = 0;
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i] == 0) {
                zeroes++;
            } else {
                ones++;
            }
        }
        int ans[] = { zeroes, ones };
        return ans;

    }
    public static void main(String args[])
    {
        int arr[] = { 0, 1, 1, 1, 0, 1, 0, 1, 0 };
        int ans[] = count(arr);
        System.out.println("No of zeroes : " +ans[0]);
        System.out.println("No of ones : " +ans[1]);
    }
}
