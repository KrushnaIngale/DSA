public class IsomorphicStrings_205 {
    public static void main(String [] args){
        String s="foo";
        String t="baa";
        System.out.println(new IsomorphicStrings_205().isIsomorphic(s,t));
        
    }
    public boolean isIsomorphic(String s, String t) {        
        if(s.length()!=t.length()) return false;
        int[] mpps=new int[256];
        int[] mppt=new int[256];
        for(int i=0;i<s.length();i++){
            char cs=s.charAt(i);
            char ct=t.charAt(i);
            if(mpps[cs]!=mppt[ct]) return false;
            mpps[cs]=i+1;
            mppt[ct]=i+1;           
        }
        return true;
    }
}
