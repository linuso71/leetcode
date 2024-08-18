import java.util.HashMap;

public class valid_anagram_242 {
    public static void main(String[] args) {
        String s = "aacc";
        String t = "ccac";
        if (s.length() == t.length()){
            HashMap<Character,Integer> s_map = new HashMap<>();
            HashMap<Character,Integer> t_map = new HashMap<>();
            for(int i=0;i<s.length();i++){
                    s_map.put(s.charAt(i),1+s_map.getOrDefault(s.charAt(i),0));
                    t_map.put(t.charAt(i),1+t_map.getOrDefault(t.charAt(i),0));
            }
            System.out.println(s_map);
            System.out.println(t_map);
            System.out.println(s_map.equals(t_map));
        }
    }
}
