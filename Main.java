import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner (System.in);
        System.out.println("STARTED");
        int n = sc.nextInt(), a = 0, s = 0, f = 0 , o = 0;
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i]= sc.nextInt();
        
        System.out.println("INPUT DONE");

        for (int i = 0; i < n; i++ ){
            if (arr[i] > s){
                s = arr[i];
                a = i;
            }
        }
        // System.out.println(a);
        System.out.println("MAX: " + s);
        System.out.println("MAX INDEX: " + a);

        for (int i = a; i < n; i = a){
            if (i == n-1) {
                break;
            }
            else{
                System.out.println("CHECKING FROM " + (i + 1));
                f = 0;
                for (int j = i + 1; j < n; j++){
                    if (arr[j] > f){
                        f = arr[j];
                        a = j;
                    }
                }
                System.out.println("MAX: " + f);
                System.out.println("MAX INDEX: " + a);
                s += f;
            }
            if(a == i) {
                break;
            }
        }

        System.out.println(s);
    }
}