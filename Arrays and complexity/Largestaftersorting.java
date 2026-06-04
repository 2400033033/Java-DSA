import java.util.Scanner;

public class Largestaftersorting {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
          if(arr[i] >  largest){
            secondlargest = largest;
            largest  = arr[i];
          } else if(arr[i] > secondlargest && arr[i] !=largest ){
             secondlargest = arr[i];
          }
          }
          System.out.println("sorted array =");
          for(int i=0;i<n;i++){
            System.out.print(arr[i] + " " );
            
          }
          System.out.println("secondlargest = " + secondlargest);
            System.out.println("largest = " + largest);
    }
}
