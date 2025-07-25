 public class makearrayequal{
 public static boolean canMakeEqual(int[] nums, int k) {
        int bool1=1;
        int bool2=1;
        int k1=k;
        int k2=k;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==-1){
                System.out.print("\n -1 found at index "+i);
                int j=i+1;
                while(j<nums.length && nums[j]!=-1){
                    j++;
                }
                 System.out.print("\n -1  matching found at index "+j);
                if(j==nums.length){
                    System.out.print("\n All 1 failed due to length");
                    bool1=0;
                    break;
                }
                k1-=j-i;
                i=j;
                if(k1<0){
                    bool1=0;

                    System.out.print("\n All 1 failed");
                    break;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                System.out.print("\n 1 found at index "+i);
                int j=i+1;
                while(j<nums.length && nums[j]!=1){
                    j++;
                }
                System.out.print("\n 1 found again at index "+i);
                if(j==nums.length){
                    bool2=0;
                     System.out.print("\n All -1 failed due to length");
                     break;
                }
                k2-=j-i;
                i=j;
                if(k2<0){
                    bool2=0;
                     System.out.print("\n All -1 failed");
                     break;
                }
            }
        }
        if(bool1==1 || bool2==1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        int[] arr={-1,1,1,-1,-1,-1,1,1,-1,-1,1,1,1,1,-1,-1};
        int k=3;
        if(canMakeEqual(arr,3)){
            System.out.print("Done..");
        }
    }
 }