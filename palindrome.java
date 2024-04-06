package leetcode;

public class palindrome {
    public static void main(String[] args) {
        int num = -121;
        int temp = num;
        int num_rev = 0;
        // reverse the number
        while (num>0){
            int rem = num % 10;
            num_rev = num_rev *10 + rem;
            num = num / 10;

        }
        if (temp == num_rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
