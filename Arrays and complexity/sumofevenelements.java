import java.util.*;
public class sumofevenelements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter umber of elements = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum =0;
        for(int i=0;i<arr.length;i=i+2){
            sum+= arr[i];

        }
        System.out.println(sum);
    }
}
