import java.util.*;

public class rhombus{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of rhombus ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
           for(int j=1;j<=2*n-i;j++){
               if(j<=n-i){
                 System.out.print(" ");
               }
               else{
                System.out.print("*");
               }
           }
           System.out.print("\n");
        }
    }
}