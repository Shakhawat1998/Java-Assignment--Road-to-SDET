import java.util.HashMap;
import java.util.LinkedHashMap;
public class findCharacterOccurrencesInString {
    public static void main(String[] args) {
        String s= "I live in Dhaka";
        String s2= s.toLowerCase();
        char[] ch= s2.toCharArray();
        LinkedHashMap<Character,Integer> count = new LinkedHashMap<> ();
        for(char s1:ch){
               if(s1!=' '){
                   if(count.containsKey(s1)){
                       count.put(s1,count.get(s1)+1);
                   }
                   else{
                       count.put(s1,1);
                   }
               }
        }
        for(char s1:count.keySet()){
            System.out.println(s1+" "+count.get(s1));
        }
    }
}
