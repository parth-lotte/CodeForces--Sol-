import java.util.*;
public class Chewbacca {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        // String str = Integer.toString(num);

        for(int i = 0; i<str.length(); i++) {
            char digit = str.charAt(i);
            if(digit > '4' )
            {
                digit = (char) ('9' - digit + '0');
            }
            str = str.substring(0, i)+digit+str.substring(i+1);    
        }

        if(str.charAt(0)=='0')
            {
                str = '9'+ str.substring(1);
            }  

        System.out.println(str);
    }
}
