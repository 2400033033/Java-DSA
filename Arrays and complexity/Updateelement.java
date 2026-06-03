import java.util.*;
public class Updateelement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr number of elements :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();

        }
        System.out.println("Enter index number = ");
       
         int index = sc.nextInt();
         System.out.println("Enter value = ");
        int value = sc.nextInt();
        if(index >= 0 && index < n){
             arr[index] = value;
        } else{
            System.out.println("Invalid index : ");
        }

        

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }


        
    }
}
