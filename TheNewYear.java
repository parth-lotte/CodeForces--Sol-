import java.util.*;
public class TheNewYear {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int arr[] = new int[3];
    
    for(int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int dist = Integer.MIN_VALUE;
        int d1 = arr[1] - arr[0];
        int d2 = arr[2] - arr[1];
        dist = Math.max(d1, d2);    

        System.out.println(dist);
    }
}

10 20 30 
