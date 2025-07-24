public class subarray{
    public static void Allsubarray(int[] arr){
       for(int size=0;size<=arr.length;size++){
        for(int i=0;i<arr.length-size;i++){
          for(int j=i;j<=i+size;j++){
            System.out.print(arr[j]+" ");
          }
           System.out.print("   ");
        }
        System.out.print("\n");
       }
    }

    public static void main(String args[]){
        int[] arr={1,2,3,4,5};
        Allsubarray(arr);
    }
}