import java.util.*;
public class Lastoccurence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements = ");
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter search element = ");
        int x = sc.nextInt();
        int lastindex = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lastindex = i;
               
            }
        }
        System.out.println("first occurence = " + lastindex);
    }
    
}
