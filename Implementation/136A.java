import java.util.*;
public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i <n; i++) {
            map.put(arr[i], i);
        }

        int ans[] = new int[n+1];
        
        int idx = 0;
        for(Map.Entry<Integer, Integer> e : map.entrySet())
        {
            ans[e.getKey()] = e.getValue() + 1;
        }

        for(int i = 1; i <ans.length; i++)
        {
            System.out.print(ans[i] + " ");
        }
    }
    
}
