import java.util.*;
public class Elephant {

    // public static int steps (int idx,int arr[], int target, int dp[]) {

    //     if(idx<0)
    //     {
    //         return 0;
    //     }

    //     if(target == 0)
    //     {
    //         return 0;
    //     }

    //     if(dp[idx]!=-1)
    //     {
    //         return dp[idx];
    //     }

    //     int take = Integer.MAX_VALUE;

    //     if(arr[idx]<=target)
    //     {
    //         take = 1 + steps(idx-1, arr, target-arr[idx], dp);
    //     }

    //     int notTake = steps(idx-1, arr, target, dp);


    //     dp[idx] = Math.min(take, notTake);

    //     return dp[idx];



    // }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int steps = n /5;

        if(n%5 != 0)
        {
            steps++;
        }
        System.out.println(steps);
    }
    
}
