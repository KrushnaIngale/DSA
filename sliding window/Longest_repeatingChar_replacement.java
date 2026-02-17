public class Longest_repeatingChar_replacement{
    public static void main(String[] args){
        String s="AABABBA";
        int k=1;
        Longest_repeatingChar_replacement l=new Longest_repeatingChar_replacement();
        System.out.println(l.characterReplacement(s,k));
    }
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int r=0;
        int l=0;
        int maxLength=0;
        int maxFreq=0;
        int[] hash=new int[26];
        for(r=0;r<n;r++){
            hash[s.charAt(r)-'A']++;
            maxFreq=Math.max(maxFreq,hash[s.charAt(r)-'A']);
            int changes=(r-l+1)-maxFreq;
            if(changes>k){
                hash[s.charAt(l)-'A']--;
                l++;
            }
            maxLength=Math.max(maxLength,r-l+1);
        }
        return maxLength;
    }
}