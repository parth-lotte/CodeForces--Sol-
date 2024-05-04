import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Arrays.sort(arr);

        int count = 0;
        
        int val = arr[k];

        for(int i: arr)
        {
            if(i>=val && i>0)
            {
                count++;
            }
        }
        System.out.println(count);

    }

}