import java.util.*;
public class Productofelements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int pro = 1;
        for(int i=0;i<arr.length;i++){
            pro = pro*arr[i];
        }
        System.out.println(pro);
    }
    
}
