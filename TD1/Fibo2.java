import java.util.Scanner;

public class Fibo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Donnez l, la limite supérieur à atteindre : ");
        int l = input.nextInt();
        int res = 1;
        int res1 = 0;
        int i = 1;
        int tmp;
        while(res <= l) {
            i++;
            tmp = res;
            res = res + res1;
            res1 = tmp;
        }
        System.out.println("On a u" + i + " = " + res);
    }
}
