/*Rotate array by one in clockwise direction and then reverse it*/
import java.util.Scanner;
import java.util.Arrays;
public class RotateAndReverse {
    public static void main(String args[]) {
        int[] arr;
        int N, d, temp;
        boolean flag = true;
        int count = 1;
        char ch = 'y';
        Scanner scan = new Scanner(System.in);

        while(count<201){
            if (ch == 'y'){
                System.out.println("Enter length of array:");
                N = scan.nextInt();
                d = (N-1);
                arr = new int[N];
                System.out.println("enter array elements one by one");
                for (int i=0;i<N;i++){
                    arr[i] = scan.nextInt();
                }
                System.out.println("entered array");
                System.out.println(Arrays.toString(arr));
                for (int i=0;i<1;i++){
                    temp = arr[N-1];
                    for(int j=N-2;j>=0;j--){
                        arr[j+1] = arr[j];
                    }
                    arr[0] = temp;
                }
                    
            
        
                    
                System.out.println("Rotated Array");
                System.out.println(Arrays.toString(arr));
                for (int i=0;i<(N/2);i++){
                    temp = arr[i];
                    arr[i] = arr[d];
                    arr[d] = temp;
                    d = d - 1;
                }
                System.out.println("Reversed Array");
                System.out.println(Arrays.toString(arr));
                    
                    
                
            }
            else{
                flag = false;
                break;
            }
            System.out.println("No. of test cases done: ");
            System.out.println(count);
            if (count == 199){
                System.out.println("Last test case remaining");
            }                
                        
            count = count + 1;
            System.out.println("Do you wish to continue?");
            ch = scan.next().charAt(0);
            
            
                
            
            
        }
        
    }
}
