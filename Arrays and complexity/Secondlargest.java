import java.util.*;
public class Secondlargest {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter number of elements = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

} 
  int largest = Integer.MIN_VALUE;
  int secondlargest = Integer.MIN_VALUE;

  for(int i=0;i<arr.length;i++){
    if(arr[i] > largest){
        secondlargest = largest;
        largest = arr[i];
    }else if(arr[i]>secondlargest && arr[i]!=largest){
        secondlargest = arr[i];
    }
  }
  System.out.println("Largest element = " +  largest);
  System.out.println("secondlargest element = " +  secondlargest);
   }
    
}
