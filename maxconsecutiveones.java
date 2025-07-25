public class maxconsecutiveones{
    public static int max(int[] nums){
        int max=0,current=0;  
      for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            current++;
        }
        else{
            if(max<current){
                max=current;
            }
            current=0;
        }
      }
      if(max<current){
        max=current;
      }
      return max;
    }
    public static void main(String args[]){
         int[] arr={1,1,1,1,0,1,1,0,0,1,1,1,1,1,1,1,1};
         int x=max(arr);
         System.out.print(x);
    }
}