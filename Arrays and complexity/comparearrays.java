import java.util.*;
public class comparearrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter first array elements:");
        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter second array elements:");
        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        boolean equal = true;
        if(n1 != n2){
            equal = false;
        }else{
            for(int i=0;i<n1;i++){
                if(arr1[i] != arr2[i]){
                    equal = false;
                    break;
                }
            }
        }
        if(equal){
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
        
    }
    
}
