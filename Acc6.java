import java.util.*;
class Acc6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt();
        int rem =0,sum=0;
        while(n>0){
            rem=n%k;
            sum +=rem;
            n/=k;
        }
        System.out.println(sum);
    }
}