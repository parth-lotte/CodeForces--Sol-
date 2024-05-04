import java.util.Scanner;

public class WayTooLongWords {

    public static String wayTooLong(String word) {

        if(word.length() <=10)
        {
            return word;
        }else 
        {
            return "" + word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < n; i++) {
            String word = scanner.nextLine();

            System.out.println(wayTooLong(word));
        }

        scanner.close();
    }
}
