package leetcode.top100;

public class isPalindrome {

    public boolean isPalindrome(int x) {
        String str = x+ "";
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                    return false;
            }
        }
        return true;
    }




    public static void main(String[] args) {
        isPalindrome is = new isPalindrome();

        System.out.println(is.isPalindrome(-121));

    }
}
