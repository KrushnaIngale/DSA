public class Rotate_Strings_796 {
    public static void main(String[] args){
        String s="abcde";
        System.out.println(new Rotate_Strings_796().rotateString(s,"cdeba" ));
        
    }

    public boolean rotateString(String s, String goal) {
        int n=s.length();
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<n;i++){
            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);
            if(sb.toString().equals(goal)){
                return true;
            }
        }
        return false;
    }
    public boolean rotateString1(String s, String goal) {
        int n=s.length();
        for(int i=0;i<n;i++){
            s=s.substring(1,n)+s.charAt(0);
            if(s.equals(goal)){
                return true;
            }
        }
        return false;
    }
}
