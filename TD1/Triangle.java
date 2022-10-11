import java.util.Scanner;

public class Triangle {

    public static void triangleFor(int t) {
        for(int i = 0; i < t; i++) {
            for(int j = 0; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }

    public static void triangleWhile(int t) {
        int i = 0;
        int j = 0;
        while (t  > i) {
            j = 0;
            while(i >= j) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Donnez la taille du motif : ");
        int t = input.nextInt();
        triangleFor(t);
    }
}
