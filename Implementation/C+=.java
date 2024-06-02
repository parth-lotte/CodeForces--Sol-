import java.util.*;

public class C+= {

    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while(t-->0)
    {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int sum = 0;
        int count = 0;

        while(sum<=n)
        {
            if(a>b)
            {
                b+=a;
                sum = b;
                count++;
            }else 
            {
                a+=b;
                sum = a;
                count++;
            }
        }
        
        System.out.print(count);
        System.out.println();

    }

    

}
