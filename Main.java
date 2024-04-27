import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int mat[][] = new int [n][n];
        for(int i = 0; i < n; i++)
        {
            String[] rowVal = sc.nextLine().split(" ");
            for(int j = 0; j < n; j++)
            {
                mat[i][j] = Integer.parseInt(rowVal[j]);
            }
        }
        

        int count = 0;
        int ans = 0;
       for(int i = 0; i < n; i++)
       {
        for(int j = 0; j < n; j++)
        {
            if(mat[i][j] == 1)
            {
                count++;
            }
        }
        if(count >=2)
        {
            ans++;
        }
       }

       return ans;
    }


    
}
