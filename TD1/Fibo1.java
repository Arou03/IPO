import java.util.Scanner;

public class Fibo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Donnez n, le rang à calculer : ");
        int n = input.nextInt();
        int res = 1;
        int res1 = 0;
        int tmp;
        if(n == 0) {
            res = res1;
        } else {
            for(int i = 2; i <= n; i++) {
                tmp = res;
                res = res + res1;
                System.out.println("u" + i + " = " + tmp + " + " + res1 + " = " + res);
                System.out.print("    où u" + (i - 1) + " = " + tmp + " et ");
                System.out.println("u" + (i - 2) + " = " + res1);
                res1 = tmp;
            }
        }
    }
}
