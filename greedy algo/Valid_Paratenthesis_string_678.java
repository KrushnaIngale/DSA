public class Valid_Paratenthesis_string_678 {
    public static void main(String[] args) {
        String s="(*))";
        Valid_Paratenthesis_string_678 v=new Valid_Paratenthesis_string_678();
        System.out.println(v.checkValidString(s));
    }
    public boolean checkValidString(String s) {
        int min=0;
        int max=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                min++;
                max++;
            }else if(c==')'){
                min--;
                max--;
            }else{
                min--;
                max++;
            }
            if(min<0) min=0;
            if(max<0) return false;
        }
        return max==0;
    }
}
