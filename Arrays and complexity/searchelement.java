import java.util.*;
public class searchelement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements = ");
        int n = sc.nextInt();

        int[] arr = new int[n];

    for(int i=0;i<n;i++){
        arr[i]= sc.nextInt();
        
    }
    System.out.println("enter search element = ");
    int x = sc.nextInt();
    boolean found = false;
       for(int i=0;i<arr.length;i++){

        if(arr[i] == x){
            found = true;
            break;
        }
       }

       if(found ){
        System.out.println("element found");
       }else{
        System.out.println("not found");
       }
    }
    
}
