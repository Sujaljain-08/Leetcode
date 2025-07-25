public class rotateArrayBy90Degree{
    public static void rotate(int[][] arr) {
        int n = arr.length;

        // transpose of matrix

        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0+count;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
            count++;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][n-j-1];
                arr[i][n-j-1]=temp;
            }
        }
    }
}