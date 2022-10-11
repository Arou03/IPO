import java.util.Scanner;

public class TroisNombre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1er nombre : ");
        int a = input.nextInt();
        System.out.print("2eme nombre : ");
        int b = input.nextInt();
        System.out.print("3eme nombre : ");
        int c = input.nextInt();
        int tmp;
        if(a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        if(b > c) {
            tmp = c;
            c = b;
            b = tmp;
        }
        if(a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        System.out.print("Les nombres dans l ' ordre croissant : " + a + " " + b + " " + c);
    }
}
