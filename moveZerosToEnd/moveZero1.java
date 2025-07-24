public class removezeros{
    public static void moveZeroes(int[] arr) {
        int zeros=0; 
        int i=0;
        while(i<arr.length-1){
            if(arr[i]==0 && i!=arr.length-1){
                int k=i;
                while(k+1<arr.length){
                    arr[k]=arr[k+1];
                    k++;
                } 
                zeros++;
                int bool=1;
                int j=i;
                for(;j<arr.length;j++){
                    if(arr[j]!=0){
                        bool=0;
                    }
                }
                if(bool==1){
                    return;
                }
            }else{
                i++;
            }
        }
        if(arr[arr.length-1]==0){
            zeros++;
        }
        if(zeros!=0){
          for(int j=1;j<=zeros;j++){
            arr[arr.length-j]=0;
          }
        }
    }
    public static void main(String args[]){
        int arr[]={0};
        moveZeroes(arr);
        System.out.println("\n\n");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
