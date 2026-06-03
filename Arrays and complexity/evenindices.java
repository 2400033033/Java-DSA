import java.util.*;
public class evenindices {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of elements:");
int n = sc.nextInt();
 int[] arr = new int[n] ;
 for(int i=0;i<n;i++){
    arr[i] = sc.nextInt();
 }

    for(int i=0;i<arr.length;i=i+2){
        System.out.print("even indices = " + arr[i] + " ");
    }

 

    }
}
