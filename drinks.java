import java.util.*;
public class drinks {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        float arr[] = new float[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextFloat()
        }

        float sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum / n);

    }
    
}
