import java.util.Stack;

public class Remove_K_Digits_402 {
    public static void main(String[] args) {
        String num="1432219";
        int k=3;
        Remove_K_Digits_402 r=new Remove_K_Digits_402();
        System.out.println(r.removeKdigits(num,k));
    }
    public String removeKdigits(String num, int k) {
        int n=num.length();
        Stack<Character>st=new Stack<>();
        for(char ch:num.toCharArray()){
            while(!st.isEmpty() && st.peek()>ch && k>0){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }
        if(st.isEmpty()) return "0";

        StringBuilder sb=new StringBuilder();
        for(char ch:st){
            sb.append(ch);
        }
        while(sb.length()!=0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }

        return sb.length()==0?"0":sb.toString();
    }
    public String removeKdigits1(String num, int k) {
        int n=num.length();
        Stack<Character>st=new Stack<>();
        for(char ch:num.toCharArray()){
            while(!st.isEmpty() && st.peek()>ch && k>0){
                st.pop();
                k--;
            }
            if(!st.isEmpty() || ch!='0'){
                st.push(ch);
            }
        }
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }
        if(st.isEmpty()) return "0";

        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}
