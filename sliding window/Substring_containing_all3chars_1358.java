public class Substring_containing_all3chars_1358 {
    public static void main(String[] args) {
        String s="abcabc";
        Substring_containing_all3chars_1358 s1=new Substring_containing_all3chars_1358();
        System.out.println(s1.numberOfSubstrings(s));
    }
    public int numberOfSubstrings(String s) {
        int subStringCount=0;
        int[] hash={-1,-1,-1};
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']=i;
            if(hash[0]!=-1 && hash[1]!=-1 && hash[2]!=-1){
                int minWindow=Math.min(hash[0],hash[1]);
                minWindow=Math.min(minWindow,hash[2]);
                subStringCount+=minWindow+1;
            }
        }
        return subStringCount;
    }    
}
