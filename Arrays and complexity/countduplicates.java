import java.util.*;
public class countduplicates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int countduplicates = 0;
        for(int i=0;i<n;i++){
          boolean visited = false;
            for(int k =0;k<i;k++){
                if(arr[i] == arr[k]){
                    visited = true;
                    break;
                }
            }
            if(visited){
                continue;
            }
            int count =0;
            for(int j=0;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
             if(count>1){
                countduplicates++;
             }
            }
             System.out.println("duplicates =" + countduplicates);
        
    }
    
}
