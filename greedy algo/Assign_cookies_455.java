import java.util.Arrays;
public class Assign_cookies_455 {
    public static void main(String[] args){
        int[] g={1,2};
        int[] s={1,2,3};
        Assign_cookies_455 a=new Assign_cookies_455();
        System.out.println(a.findContentChildren(g,s));
    }
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0;
        int r=0;
        while(l<g.length && r<s.length){
            if(g[l]<=s[r]){
                l++;
            }
            r++;
        }
        return l;
    }
}
