import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FrequencySort_451 {
    public static void main(String[] args) {
        String s="tree";
        System.out.println(frequencySort(s));
    }

    static String frequencySort(String s) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
        }
        List<Character> keys=new ArrayList<>(mpp.keySet());
        keys.sort((obj1,obj2)-> mpp.get(obj2)-mpp.get(obj1));

        StringBuilder sb=new StringBuilder();
        for(char ch:keys){
            for(int i=0;i<mpp.get(ch);i++){
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
    static String frequencySort1(String s) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
        }
        List<Character>keys=new ArrayList<>(mpp.keySet());
        List<Integer>values=new ArrayList<>(mpp.values());

        StringBuilder sb=new StringBuilder();
        while(!values.isEmpty()){
            int max=Collections.max(values);
            int index=values.indexOf(max);
            char ch=keys.get(index);
            for(int i=0;i<max;i++){
                sb.append(ch);
            }
            keys.remove(index);
            values.remove(index);
        }
        return sb.toString();
    }
}
