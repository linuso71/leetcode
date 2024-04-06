package leetcode;

public class sorted_array {
    
    public static void main(String[] args){
        int c = 0;
        int[] arr = {3,4,5,1,2};
        for(int i=0;i<arr.length;i++){
            if (arr[i]>arr[(i+1)%arr.length]){
                System.out.println(i+"->"+3%6);
                c++;
            }
        }
        if (c>1){
            System.out.println(false);
        }
        else{
        System.out.println(true);
        }
        
    }
}
