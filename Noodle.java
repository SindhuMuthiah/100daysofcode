import java.util.*;
class Noodle{
    public static void main(String []args){
        int a;
        Scanner s= new Scanner(System.in);
        a=s.nextInt();
        int count=0;
        while(a!=1){
            a=a/2;
            count++;
        }
        System.out.println(count);
    }
}