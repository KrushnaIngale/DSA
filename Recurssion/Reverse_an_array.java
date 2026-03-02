public class Reverse_an_array{
    public static void main(String[] args){
        int[] arr={1,2,3,4,2};

        reverse(arr,arr.length-1);
    }
    static void reverse(int[] arr,int i){
        if(i<0){
            return;
        }
        System.out.print(arr[i]);
        reverse(arr,i-1);
    }
}