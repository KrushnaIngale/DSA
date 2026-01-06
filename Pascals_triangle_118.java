import java.util.* ;

class Pascals_triangle_118 {
    public static void main(String[] args) {
        Pascals_triangle_118 obj = new Pascals_triangle_118();
        List<List<Integer>> result = obj.generate(5);
        System.out.println(result);
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(genRow(i));
        }
        return ans;
    }
    List<Integer> genRow(int i){
        List<Integer> temp=new ArrayList<>();
        temp.add(1);
        long ans=1;
        for(int j=1;j<i;j++){
            ans=ans*(i-j);
            ans=ans/j;
            temp.add((int)ans);
        }
        return temp;
    }
    public List<List<Integer>> generate1(int numRows) {
        List<List<Integer>>ans=new ArrayList<>();
        if(numRows==0) return ans;

        List<Integer> firstRow=new ArrayList<>();
        firstRow.add(1);
        ans.add(firstRow);
        if(numRows==1) return ans;

        for(int i=1;i<numRows;i++){
            List<Integer>prev=ans.get(i-1);
            List<Integer>temp=new ArrayList<>();
            temp.add(1);
            for(int j=0;j<i-1;j++){
                temp.add(prev.get(j)+prev.get(j+1));
            }
            temp.add(1);
            ans.add(temp);
        }
        return ans;
    }
}