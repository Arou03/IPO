import java.util.Scanner;

public class Couronne {
    public static double distanceToCenter(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Rayon extérieur : ");
        double rExt = input.nextDouble();
        System.out.print("Rayon intérieur : ");
        double rInt = input.nextDouble();
        System.out.print("Donnez un point x : ");
        double x = input.nextInt();
        System.out.print(" y : ");
        double y = input.nextInt();
        if(distanceToCenter(x, y) <= rExt && distanceToCenter(x, y) >= rInt) {
            System.out.println("Ce point est dans la couronne.");
        } else {
            System.out.println("Ce point n'est pas dans la couronne.");
        }
    }
}
