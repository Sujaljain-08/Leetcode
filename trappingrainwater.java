public class trappingrainwater{
    public static int trappingwater(int[] arr){
        int leftbound=0;
        int rightbound=leftbound+1;
        int trapped=0;
        while(leftbound<arr.length-1 && rightbound<arr.length-1){
            if(rightbound==arr.length-1){
                int max=leftbound+1;
                for(int i=leftbound+2;i<arr.length;i++){
                    if(arr[i]>arr[max]){
                        max=i;
                    }
                }
                rightbound=max;
                int obsSize=0;
                for(int i=leftbound+1;i<rightbound;i++){
                    obsSize+=arr[i];    
                }
                if(arr[rightbound]>arr[leftbound]){
                  trapped+=arr[leftbound]*(rightbound-leftbound-1)-obsSize;
                }
                else{
                    trapped+=arr[rightbound]*(rightbound-leftbound-1)-obsSize;
                }
                leftbound=rightbound;
                if(leftbound==arr.length-1){
                    return trapped;
                }
                rightbound++;
                System.out.print("\nin equals rightbound is "+rightbound);
              }
            if(arr[rightbound]>=arr[leftbound]){
                int obsSize=0;
                for(int i=leftbound+1;i<rightbound;i++){
                    obsSize+=arr[i];    
                }
                trapped+=arr[leftbound]*(rightbound-leftbound-1)-obsSize;
                leftbound=rightbound;
                rightbound++;
              }
              else{
                rightbound++;
              }
        }
        return trapped;
    }

    public static void main(String args[]){
         int[] arr={4,4,4,7,1,0};
         int x=trappingwater(arr);
         System.out.print(x);
    }
}