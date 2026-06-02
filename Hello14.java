import java.util.*;
public class Hello14 {
    public static void main(String[] args) {
        String s1=" ";
        String s = "Hello";
        for(int i=0;i<=s.length-1;i++){
            for(int j=0;j<=i;j++){
                String s1 = s.substring(j,i);
                System.out.println(s1);
            }
        }
    }
}