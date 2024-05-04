import java.util.*;
public class Beautiful {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int arr [][] = new int [5][5];
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        int dist = 0;

        for(int i =0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                if(arr[i][j] == 1)
                {
                    dist = Math.abs(i-2)+Math.abs(j-2);
                }
            }
        }
        System.out.print(dist);
    }
    
}
