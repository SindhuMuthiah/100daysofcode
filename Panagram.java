import java.util.*;
class Panagram{
    public static void main(String [] args){
        //String str=" ";
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        char ch[] = str.toCharArray();
        int arr[]=new int[26];
        int index = 0;
        int i;
        for(i=0;i<ch.length;i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                index = ch[i]-65;

            }
            if(ch[i]>='a' && ch[i]<='z'){
                index = ch[i]-'a';

            }
            arr[index]=1;

        }
        int flag=0;
        for( i=0;i<26;i++){
            if(arr[i]==0){
                flag=1;
                break;
            }
        }
System.out.println((flag==0)?"PANAGRAM":"NO");
    }
}