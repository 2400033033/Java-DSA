import java.util.*;
public class indexofelement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter search elemet = ");
        int x = sc.nextInt();

        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                index = i;
                break;
            }
        }
        if(index != -1){
            System.out.println("element at index =" + index);
        }else{
            System.out.println("element not found ");
        }
    }
    
}
