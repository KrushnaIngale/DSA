public class SumofBeautyofSubstrings_1781 {
    public static void main(String[] args) {
        String s="aabcb";
        System.out.println(beautySum(s));
    }
    static int beautySum(String s) {
        int n=s.length();
        int beauty=0;
        for(int i=0;i<n;i++){
            int[] freq=new int[26];
            for(int j=i;j<n;j++){
                int ch=s.charAt(j)-'a';
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                freq[ch]++;
                for(int k=0;k<26;k++){
                    if(freq[k]>0){
                        max=Math.max(max,freq[k]);
                        min=Math.min(min,freq[k]);
                    }
                }
                beauty+=max-min;
            }
        }
        return beauty;
    }
    
}
