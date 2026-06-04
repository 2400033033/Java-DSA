import java.util.*;
public class frequencyofallelements{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            boolean visited = false;

        
        for(int k=0;k<i;k++){
            if(arr[i] == arr[k]){
                visited = true;
                break;
            }
        }
        if(visited){
            continue;
        }
        int count = 0;
        for(int j=0;j<arr.length;j++){
             if(arr[i] == arr[j]){
                count++;
             }
        }
        System.out.println(arr[i] + "->" + count);
        }
    }
}