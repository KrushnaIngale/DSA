public class Palindrome {
    public static void main(String[] args) {
        String s="annaa";
        System.out.println(isPalindrome(s,0,s.length()-1));
    }

    static boolean isPalindrome(String s,int i,int j) {
        if(i==s.length()/2) return true;
        if(s.charAt(i)!=s.charAt(j)) return false;
        return isPalindrome(s,i+1,j-1);
    }
}
