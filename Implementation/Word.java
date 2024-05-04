import java.util.*;

public class Word {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        HashMap<Character, Integer> Umap = new HashMap<>();
        HashMap<Character, Integer> Lmap = new HashMap<>();

        for(char ch : str.toCharArray())
        {
            if(Character.isLowerCase(ch))
            {
                Lmap.put(ch, Lmap.getOrDefault(ch,0)+1);
            }else if(Character.isUpperCase(ch))
            {
                Umap.put(ch, Umap.getOrDefault(ch,0)+1);
            }
        }

        if(Lmap.size() >Umap.size())
        {
            System.out.print(str.toLowerCase());
        }else if(Lmap.size() <Umap.size())
        {
            System.out.print(str.toUpperCase());
        }else 
        {
            System.out.print(str.toLowerCase());
        }

    }
}
