import java.util.*;
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
        
        arr[i] = sc.nextInt();
        }

        int maxVal= Integer.MIN_VALUE;
        int minVal= Integer.MAX_VALUE;
        int minIdx = 0;
        int maxIdx = 0;
        
        for(int i = 0; i<n; i++)
        {
            if(i > maxVal)
            {
                maxIdx = i;
                maxVal = arr[i];
            }
            if(i < minVal)
            {
                minIdx = i;
                minVal = arr[i];
            }
        }

        if(maxIdx < minIdx)
        {
            System.out.print((maxIdx - 1)+ (n-minIdx));
        }else 
        {
            System.out.print((maxIdx - 1)+ (n-minIdx)-1);
        }
    }


    
}
