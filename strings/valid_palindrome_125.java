public class valid_palindrome_125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // StringBuilder temp = new StringBuilder(str.length());
        String temp= "";
        for(int i =str.length()-1;i>-1;i--){
            // System.out.println(str.charAt(i));
            temp = temp + str.charAt(i);
            // temp.append(str.charAt(i));
        }
        System.out.println(temp+"->>>>>>>>>>>>>>>>>>>");
        System.out.println((temp.contentEquals(str)));
    }
}
