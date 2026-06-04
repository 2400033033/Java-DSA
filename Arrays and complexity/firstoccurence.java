import java.util.*;
public class firstoccurence {
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
        int firstindex = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                firstindex = i;
                break;
            }
        }
        System.out.println("first occurence = " + firstindex);
    }
    
}
