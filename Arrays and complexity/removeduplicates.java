import java.util.Scanner;

public class removeduplicates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            boolean visited = false;

            for(int k=0;k<i;k++){
                if(arr[i] == arr[k]){
                    visited = true;
                    break;
                }
            }

            if(!visited){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
