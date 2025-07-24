public class butterfly{
    public static void main(String args[]){
        int n=13;
        for(int i=1;i<=n/2;i++){
            for(int j=1;j<=n;j++){
                if(j<=i || n-j<=i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        for(int i=n/2;i>=1;i--){
            for(int j=1;j<=n;j++){
               if(j<=i || n-j<=i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}