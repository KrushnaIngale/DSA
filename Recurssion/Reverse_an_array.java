public class Reverse_an_array{
    public static void main(String[] args){
        int[] arr={1,2,3,4,2};

        reverse(arr,arr.length-1);
        System.out.println();
        
        reverseInplace(0,arr.length-1,arr);
        for(int i:arr){
            System.out.print(i);
        }
    }
    static void reverse(int[] arr,int i){
        if(i<0){
            return;
        }
        System.out.print(arr[i]);
        reverse(arr,i-1);
    }

    static void reverseInplace(int i,int j,int[] arr){
            if(i>=j)    return;

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
            reverseInplace(i+1,j-1,arr);
    }
}