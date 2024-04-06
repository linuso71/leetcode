package leetcode;

public class gcd {
    public static void main(String[] args) {
        int n = 9;
        int m = 6;
        int min = n;
        if (m<n){
            min = m; 
        }
        System.out.println(min);
        int gd = 0;
        for (int i=1;i<=min;i++){
            if (m%i==0 && n%i==0){
                gd = i;
                System.out.println(gd);
            }
        }
        System.out.println(gd);
    }
}
