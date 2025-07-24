public class maxsubarray{
    public static int bruteforce(int[] arr){
      int max=0,sum=0;
      for(int size=0;size<=arr.length;size++){
        for(int i=0;i<arr.length-size;i++){
          for(int j=i;j<=i+size;j++){     //sum of each subset
              sum+=arr[j];
          }
          if(max<sum){
            max=sum;
          }
          sum=0;
        }
       }
       return max;
    }
    
    public static int kadane(int[] nums){
        int max=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        System.out.print(min);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }

        }
        if(max<0){
            return max;
        }
        else{
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<0){
                sum=0;
            }
            else{
                sum+=nums[i];
                if(max<sum){
                    max=sum;
                }
            }
        }
        return max;}
    }

     public static void main(String args[]){
    //   int arr[]={-1};
    //   int x=kadane(arr);
    //   System.out.print(x);
    if(Integer.MIN_VALUE<-1){
        System.out.print("True");
    }
    else{
        System.out.print("nah");
    }
    }
}
