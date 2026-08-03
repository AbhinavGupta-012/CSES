import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int max = 1;
        char prev = 'Q';
        int length = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == prev){
                length++;
                if (length > max){
                    max = length;
                }
            }
            else{
                prev = s.charAt(i);
                length = 1;
            }
        }
        System.out.println(max);
    }
}