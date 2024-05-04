import java.util.*;
public class bit {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        for(int i =0 ; i < t ; i++) {        
        String line = sc.nextLine();
        
        int X = 0;

        if(line.contains("++"))
        {
            X++;
        }else 
        {
            X--;
        }

        System.out.println(X);

        }


    }
    
}
