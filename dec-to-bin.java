public class pattern{
    public static void conversion1(int dec){
           int bi=0;
           int pow=0;
           int temp=dec;
           while(dec>0){
            bi+=dec%2*(int)Math.pow(10,pow);
            dec/=2;
            pow++;
           }
        System.out.print("binary form of "+ temp +" is "+bi);
    }


    public static void main(String args[]){
        conversion1(11);
    }
}