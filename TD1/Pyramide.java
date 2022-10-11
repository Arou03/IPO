import java.util.Scanner;

public class Pyramide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Donnez la taille du motif : ");
        int t = input.nextInt();
        int b = t * 2 - 1;
        for(int i = 1; i <= t; i++) {
            for(int j = 1; j <= b; j++) {
                if(j <= t - i || j >= t + i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}