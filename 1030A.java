import java.util.*;
public class 1030A {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int arr[] = new int[n];

    for(int i = 0; i < n; i++) {
        
        arr[i] = sc.nextInt();
     }

     int countOne = 0;

     for(int i : arr)
     {
        if(i == 1)
        {
            countOne++;
        }
     }

     if(countOne == 0)
     {
        System.out.print("EASY");
     }else 
     {
        System.out.print("HARD");
     }

    }
    
}
