import java.util.*;
public class evenandoddcountelements {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("enter number of elements = ");
     int n = sc.nextInt();
     int[] arr = new int[n];
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
     int counteven =0;
     int countodd = 0;
     for(int i=0;i<arr.length;i++){
        if(arr[i]%2 == 0){
            counteven++;
        }else{
            countodd++;
        }

     }
     System.out.println("count of even elements = " + counteven);
     System.out.println("count of odd elemets = " + countodd);
    }
}
