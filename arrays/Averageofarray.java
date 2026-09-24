public class Averageofarray {
    public static double getaverage(int arr[])
    {
        int sum =0 ;
        for(int i:arr){
            sum=sum+i;
        }
    int size=arr.length;
    double  avg = sum/size;
    return avg;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 3, 3, 4,5};
        System.out.println(getaverage(arr));
    }
}