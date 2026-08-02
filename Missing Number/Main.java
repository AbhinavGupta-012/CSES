import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long totalSum = (n * (n + 1) / 2);
        while (n - 1 > 0){
            totalSum -= sc.nextInt();
            n--;
        }
        System.out.println(totalSum);
    }
}