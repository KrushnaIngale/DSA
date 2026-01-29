import java.util.Stack;

public class Paranthesis_nestingDepth_1614 {
    public static void main(String[] args) {
        Paranthesis_nestingDepth_1614 obj=new Paranthesis_nestingDepth_1614();
        System.out.println(obj.maxDepth("(1+(2*3)+((8)/4))+1"));
    }
    public int maxDepth(String s) {
        int openPara=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                openPara++;
            }else if(s.charAt(i)==')'){
                openPara--;
            }
            max=Math.max(max,openPara);
        }
        return max;
    }
    public int maxDepth1(String s) {
        Stack<Character> st=new Stack<>();
        int max=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(ch);
            }else if(ch==')'){
                st.pop();
            }
            max=Math.max(max,st.size());
        }
        return max;
    }
}
