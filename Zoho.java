import java.util.*;

public class Zoho {
    public static void main(String[] args) {
      
      String s = new Scanner(System.in).nextLine();
      
      StringBuffer sb = new StringBuffer("");
      int len = 0, i, j;
      char lastChar = 'a';
      char str[] = s.toCharArray();
      int flag = 1, inc;
      
      for (i=0; i<str.length; i++) {
        if (Character.isAlphabetic(str[i]))
          lastChar = str[i];
        else if (Character.isDigit(str[i])) {
          flag = 1;
          inc = 1;
          len = str[i] - 48;
          for(j=i+1; j != str.length && flag == 1; j++) {
            if (Character.isDigit(str[j])) {
              flag = 1;
              inc *= 10;
              len = inc + (str[j]-48);
              i++;
            } else {
              flag = 0;
            }
          }
          for(int k=0; k < len; k++)
            sb.append(lastChar);
        }
      }
      
      System.out.println(sb.toString());
  }
}