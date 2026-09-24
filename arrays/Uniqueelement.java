public class Uniqueelement {
    public static void main(String[] args) {
        int arr[]= { 1, 2, 3, 3, 4, 4, 5, 5 };
        int n = arr.length;
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }
        System.out.println(xor);
            
        }
    }
