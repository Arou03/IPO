import java.util.Scanner;

public class Hjms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez une durée en secondes : ");
        int S = input.nextInt();
        int M = 0, H = 0, D = 0;
        while (S > 60) {
            S -= 60;
            M++;
            if (M == 60) {
                M = 0;
                H++;
            }
            if (H == 24) {
                H = 0;
                D++;
            }
        }
        System.out.println(
                "Cette durée équivaut à " + D + " jours " + H + " heures " + M + " minutes " + S + " seconde"
        );
    }
}
