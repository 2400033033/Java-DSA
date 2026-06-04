import java.util.*;
public class Maxelements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }else if(arr[i]<min){
                min = arr[i];
            }
        }
        int sum = max + min;
        System.out.println("max elements = " + max);
        System.out.println("min elements = "+ min);
        System.out.println("sum of elements =" + sum);

    }
    
}
