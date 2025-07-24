public class stockbuysell{
    public static int profit(int[] arr){
        int buy=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]-buy>profit){
            profit=arr[i]-buy;
           }
           if(arr[i]<buy){
            buy=arr[i];
           }
        }
        return profit;
    }

    public static void main(String args[]){
        int[] arr={2,4,1,7,19,2,4,6,15,12};
        System.out.print(profit(arr));
    }
}