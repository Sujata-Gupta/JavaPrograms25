package ZPractice_JavaCoding;

import java.util.HashMap;
import java.util.Map;

public class StringOccurance {
    public static void main(String[] args) {
        String input="google";
        Map<Character,Integer> charcount=new HashMap<>();
        for (char ch:input.toCharArray()){
            if (charcount.containsKey(ch)) {
                charcount.put(ch, charcount.get(ch) + 1);
            }
            else {
                charcount.put(ch,1);
            }
            for (Map.Entry<Character,Integer> entry: charcount.entrySet())
            {
                System.out.println("Char "+entry.getKey()+" occur "+entry.getValue()+" times");
            }
        }
    }
}
