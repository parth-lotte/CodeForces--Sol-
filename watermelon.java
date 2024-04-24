import java.util.Scanner;

public class watermelon {


public static boolean watermelonCheck(int n )
{
    if(n == 2)
    {
        return false;
    }

    if(n % 2 == 1)
    {
        return false;
    }
    return true;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();
        // Iterate through each test case
        for (int i = 0; i < t; i++) {
            // Read input for each test case
            int n = scanner.nextInt();
            scanner.nextLine(); 

            boolean res = watermelonCheck(n);
            System.out.println(res? "YES" : "NO");
        }

        scanner.close();
    }
}
