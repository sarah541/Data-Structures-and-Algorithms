import java.util.Scanner;
import java.util.Arrays;
public class Rotate {
    public static void main(String args[]) {
        int[] arr;
        int N, d, temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of array:");
        N = scan.nextInt();
        arr = new int[N];
        System.out.println("Enter by how much array should rotate");
        d = scan.nextInt();
        System.out.println("enter array elements one by one");
        for (int i=0;i<N;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("entered array");
        System.out.println(Arrays.toString(arr));
        d = d%N;
        for (int i=0;i<d;i++){
            temp = arr[0];
            for(int j=0;j<(N-1);j++){
                arr[j] = arr[j+1];
            }
            arr[N-1] = temp;
            
        }
        System.out.println("Rotated Array");
        System.out.println(Arrays.toString(arr));
    }
}
