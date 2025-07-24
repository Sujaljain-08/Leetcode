import java.util.*;

public class basics{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            System.out.print("* ");
        }
        System.out.print("\n");
        for(int i=1;i<=3;i++){
            for(int j=1;j<=5;j++){
                if(j==1 || j==5){
                     System.out.print("* ");
                }
                else{
                     System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
        for(int i=1;i<=5;i++){
            System.out.print("* ");
        }
        System.out.print("\n");
    }
}