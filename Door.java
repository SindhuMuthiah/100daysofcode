import java.util.*;
class Door{
    public static void main(String[]args){
        int a,b;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        int i=1,f=0,c;
        while(a>0){
           b=a%2;
           f=f + b * i;
           i*=10;
           a=a/2;
        }
        c=f*9;
        System.out.println(c);
       
    }
}