public class Firstoccurence {
    public static void main(String[] args) 
    {
        int arr[] = { 1, 2, 3, 3, 3, 4, 5, 6, 6, 7 };
        int target = 3;
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start<=end)
        {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("First occurence is "+ans);
    }
}
