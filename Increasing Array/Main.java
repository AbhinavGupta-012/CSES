import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() - 1;
        int prev = sc.nextInt();
        long total = 0;
        while (n > 0){
            int val = sc.nextInt();
            if (val < prev){
                total += (prev - val);
            }
            else{
                prev = val;
            }
            n--;
        }
        System.out.println(total);
    }
}