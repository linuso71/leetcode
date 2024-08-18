package strings;
// You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
public class restoreString {
    public static void main(String[] args) {
        int[] indices = {4,5,6,7,0,2,1,3};
        String s = "codeleet";
        StringBuilder restore = new StringBuilder();
        for (int i=0;i<indices.length;i++){
            // s.charAt(i);
            // indices[i];
            restore.insert(s.charAt(i), indices[i]);
        }
        System.out.println(restore);



    }
}
