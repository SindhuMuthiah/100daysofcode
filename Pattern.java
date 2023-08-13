import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    int i=1,len=str.length(),count=0,c=0,j=0;
    while(i<len){
      count=0;
      j=i;
      while(j<len && str.charAt(j)>='0' && str.charAt(j)<='9'){
        c = c*10 +str.charAt(j)-48;
        count++;
        j++;
      }
      while(c>0){
        System.out.print(str.charAt(i-1));
        c--;
      }
      i = j+1;
    }
  }
}

/*

input: a11b3

output: aaaaaaaaaaabbb

*/