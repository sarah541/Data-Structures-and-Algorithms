import java.util.Scanner;
import java.util.Arrays;
public class RotateAndSearch {
    public static void main(String args[]) {
        int[] arr1;
        int N, d;
        boolean flag = true;

        int count;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number if test cases");
        count = scan.nextInt();
        while (count >= 0){
            System.out.println("Enter length of array");
            N = scan.nextInt();
            System.out.println("Enter Element to be searched");
            d = scan.nextInt();
            arr1 = new int[N];
            System.out.println("Enter elments one by one");
            for(int i = 0; i < N; i++){
                arr1[i] = scan.nextInt();
            }
            int pivot = FindPivot(arr1,0,N-1);
            if (pivot == -1){
                System.out.println("Pivot not found!");
                bsearch(arr1,0,N-1,d);
            }
            else if(d == arr1[pivot]){
                System.out.println("Element found at" + pivot);
            }
            else if(arr1[0] > d){
                bsearch(arr1,pivot+1,N-1,d);
            }
            else{
                bsearch(arr1,0,pivot-1,d);
            }
            count = count + 1;
        }
    }
    public static int FindPivot(int[] arr, int low, int high){
        int mid;
        mid = (low+high)/2;
        
        if(mid < high && arr[mid] > arr[mid+1]){
            return (mid+1);
        }
        else if(mid > low && arr[mid] < arr[mid-1]){
            return mid;

        }
        else if (low > high || low == high){
            return -1;
        }
        else if(arr[low] < arr[mid]){
            return FindPivot(arr,mid+1,high);
        }
        return FindPivot(arr,low,mid-1);

    }
    public static int bsearch(int[] arr, int low, int high, int key){
        int mid = (low+high)/2;
        if (low > high){
            System.out.println("OOPS!NOT FOUND");
            return -1;

        }
        else if (arr[mid] == key){
            System.out.println("Element found at " + mid);
            return (mid);
        }
        else if(arr[mid] > key){
            return bsearch(arr,low,mid-1,key);
        }
        return bsearch(arr,mid+1,high,key);
    }
}