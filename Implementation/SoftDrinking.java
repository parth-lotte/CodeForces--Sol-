import java.util.*;
public class SoftDrinking {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int ans = Integer.MAX_VALUE;

        int totalMl = (k * l) / nl;

        int totalSlice = c *d ;

        int saltReq = p / np;


        ans = Math.min( ans, Math.min(saltReq, Math.min(totalMl, totalSlice))) / 3;
    

        System.out.println(ans);

    }
}
