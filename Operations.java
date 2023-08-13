import java.util.Scanner;

class Operations {
    public static void main(String[] a) {

        char[] s = new Scanner(System.in).nextLine().toCharArray();
        int answer = s[0] - 48;

        for (int i = 1; i < s.length - 1; i++) {
            if (s[i] == 'A')
                answer &= s[++i] - 48;
            else if (s[i] == 'B') 
                answer |= s[++i] - 48;
            else if (s[i] == 'C')
                answer ^= s[++i] - 48;
        }

        System.out.println(answer);
    }
}