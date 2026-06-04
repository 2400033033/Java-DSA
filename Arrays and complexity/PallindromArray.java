import java.util.*;
public class PallindromArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();

        }
        int start = 0;
        int end = n - 1;
        boolean found = true;
        while(start < end){
            if(arr[start] != arr[end]){
                found = false;
                break;
            }
            start++;
            end--;
        }
        if(found){
            System.out.println("palindrom");
        }else{
            System.out.println("not a palindrome");
        }
    }
    
}
