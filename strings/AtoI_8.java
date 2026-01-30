public class AtoI_8 {
    public static void main(String[] args){
        String s="-3246461nckjs";
        System.out.println(myAtoi(s));
    }
    static int myAtoi(String s) {
        s=s.trim();
        if (s.length() == 0) return 0;
        int n=s.length();
        int sign=1;
        int index=0;
        if(s.charAt(0)=='+'){
            index++;
        }else if(s.charAt(0)=='-'){
            sign=-1;
            index++;
        } 

        long ans=0;
        while(index<n && Character.isDigit(s.charAt(index))){
            int num=s.charAt(index)-'0';
            ans=ans*10+num;
            if(ans>Integer.MAX_VALUE && sign==1) return Integer.MAX_VALUE;
            if(-ans<Integer.MIN_VALUE && sign==-1) return Integer.MIN_VALUE;
            index++;
        }
        return (int)ans*sign;
    }
}