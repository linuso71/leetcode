package strings;

// Note :- Other approch using string builder if "." append "[.]" else append normally

public class defangIPaddr {
    public static void main(String[] args) {
        String s = "1.1.1.1";
        
        String replaced_string = s.replace(".", "[.]");
        System.out.println(replaced_string);
    }

}
