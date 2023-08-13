import java.util.*;
class Binary{
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        int a,b;
        a=s.nextInt();
        
         int i=1,f=0;
         while(a>0){
            b=a%2;
            f=f + b * i;
            i*=10;
            a=a/2;
         }
         System.out.println(f);

    }
}