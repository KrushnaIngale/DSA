public class HeapSort {
    public static void main(String[] args) {
        int[] arr={12,11,13,5,6,7};
        int n=arr.length;
        HeapSort h=new HeapSort();
        h.heapSort(arr,n);

        for (int nums : arr) {
            System.out.print(nums+" ");
            
        }
    }

    void heapSort(int[] arr,int n){
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
        for(int i=n-1;i>0;i--){
            int swap=arr[0];
            arr[0]=arr[i];
            arr[i]=swap;
            heapify(arr,i,0);
        }
    }
    void heapify(int[] arr,int n,int i){
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n && arr[l]>arr[largest]){
            largest=l;
        }
        if(r<n && arr[r]>arr[largest]){
            largest=r;
        }
        if(largest!=i){
            int swap=arr[i];
            arr[i]=arr[largest];
            arr[largest]=swap;
            heapify(arr,n,largest);
        }
    }
}
