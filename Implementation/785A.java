

import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int total = 0;

    for(int i = 0; i < n; i++) {
    
    String str = sc.nextLine();

    if(str.equals("Tetrahedron"))
    {
        total += 4;
    }else if(str.equals("Cube"))
    {
        total += 6;
    }else if(str.equals("Octahedron"))
    {
        total += 8;
    }else if(str.equals("Dodecahedron"))
    {
        total += 12;
    }else 
    {
        total += 20;
    }
    
    }

    System.out.println(total);
    }
}
