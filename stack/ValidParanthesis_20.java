import java.util.Stack;
public class ValidParanthesis_20 {
    public static void main(String[] args){
        String s="([])";
        System.out.println(isValid(s));
    }
    static boolean isValid(String s) {
        int n=s.length();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }else{
                if(st.isEmpty()) return false;
                char pop=st.pop();
                if(pop!='(' && ch==')'){
                    return false;
                }
                if(pop!='[' && ch==']'){
                    return false;
                }
                if(pop!='{' && ch=='}'){
                    return false;
                }
            }
             
        }
        return st.isEmpty();
    }
}
