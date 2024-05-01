import java.util.*;
public class Twoarrays {

    public static void swap(int i, int j, int a[], int b[]) {

        int temp = a[i];
        a[i] = b[j];
        b[j] = temp;
    
    
    }

    public static int maxSum(int[] arr, int[] arr2, int k) {

        Arrays.sort(arr);
        Arrays.sort(arr2);


        int i = 0;
        int j = arr2.length - 1;

        while(i<arr.length && j>=0 && k-->0)
        {
            if(arr[i] < arr[j])
            {
            swap(i, j, arr, arr2);
            i++;
            j--;
        }else 
        {
            i++;
            j--;
        }
            
        }

        int sum = 0;

        for(int o : arr)
        {
            sum+=o;
        }
        return sum;
    
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i <t; i++) {

        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];

        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }

        sc.nextLine();
        int arr2[] = new int[n];
        
        for (int j = 0; j < n; j++) {
            arr2[j] = sc.nextInt();
        }

        sc.nextLine();

        int ans =  maxSum(arr, arr2, k);

        System.out.print(ans);
 
        }
    
    }
}