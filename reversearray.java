public class reversearray{
    public static void reverse(int[] arr){
        int size=arr.length-1;
        for(int i=0;i<size/2;i++){
            int temp=arr[i];
            arr[i]=arr[size-i];
            arr[size-i]=temp;
        }
    }

    public static void main(String args[]){
          int[] arr={1,2,4,5,6,10};
          reverse(arr);
          for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
          }
    }
}