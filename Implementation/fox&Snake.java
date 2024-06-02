import java.util.*;
public class fox&Snake {
    
    public static void dfs(char arr[][], int n, int m)
    {
        if(n<0 || m<0 || m>=arr[0].length || n>=arr.length || arr[n][m] == '#')
        return;
        arr[n][m] = '#';

        dfs(arr,n, m);
        dfs(arr, n+2, m);
        dfs(arr, n, m-2)

    }
    public static void main(String[] args) {
    
       Scannner sc = new Scanner(System.in); 

       int n = sc.nextInt();
       int m  = sc.nextInt();

       char arr[][] = new char[n][m];

       for(char row[] : arr)
       {
        Arrays.fill(arr,'.');
       }

       dfs(arr, 1, 1);
       
    }
}
