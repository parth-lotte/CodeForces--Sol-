import java.util.*;
public class EqualCandies {

    public static int split(int arr[], int n) {

        int arrDiff []= new int [n-1];

        Arrays.sort(arr);
        for(int i=1; i<arr.length; i++)
        {
            arrDiff[i] = arr[i] - arr[i-1];
        }
        Arrays.sort(arrDiff);
        
        return arrDiff[0];
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        sc.nextLine();
        for(int q = 0; q < t; q++) {
        int n = sc.nextInt();

        sc.nextLine();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans =split(arr, n);
        System.out.println(ans);
    }
}
    
}
