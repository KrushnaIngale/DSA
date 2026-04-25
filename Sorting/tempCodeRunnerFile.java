for(int i=n-1;i>0;i--){
            int swap=arr[0];
            arr[0]=arr[i];
            arr[i]=swap;
            heapify(arr,i,0);
        }