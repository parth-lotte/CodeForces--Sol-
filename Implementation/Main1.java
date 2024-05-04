import java.util.*;
public class Main1 {

    public static int gcd(int x, int y) {
        
        if(y == 0)
        {
            return x;
        }

        return gcd(y, x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < t; i++) {
            
            int x = sc.nextInt();
            
            
            for(int y = 1; y < x; y++) {
            
                int val = gcd(x,y) + y;

                max = Math.max(max, val);
            
            }
        }
        System.out.println(max);
    }
    
}
