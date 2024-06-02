import java.util.*;

public class Main {
    
    public static int bookShop(int n, int ans[])
    {
        int pos = 0;
        int num = n;
        int i = 0;
        while(num > 0)
        {
            num -= ans[i];
            pos = i+1;
            i = (i+1)%7;
            
        }
        return pos;
    }
    
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();

    int arr[] = new int[8];
    
    for(int i = 0 ; i<7; i++)
    {
        arr[i] = sc.nextInt();
    }
            
    int ans = bookShop(n, arr);
    
    System.out.print(ans);
    }
}

//  n pages 
