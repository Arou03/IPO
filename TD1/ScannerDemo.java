// Exemples d'utilisation des fonctions de saisie, pour récupérer des valeurs
// données au clavier par l'utilisateur.

// Étape 1.
// Directive à placer au début du fichier pour permettre l'utilisation de
// ces fonctions.
import java.util.Scanner;

public class ScannerDemo {
  
    public static void main(String[] args){

        // Étape 2.
        // Initialisation.
        Scanner sc = new Scanner(System.in);

        // Maintenant, c'est prêt à utiliser !
        //   sc.next()         lit une chaîne de caractères
        //   sc.nextInt()      lit un entier
        //   sc.nextDouble()   lit un nombre décimal
        // (il en existe encore d'autres)
        System.out.print("Entrez votre nom : ");
        String s = sc.next();

        System.out.print("Entrez votre âge : ");
        int i = sc.nextInt();

        System.out.print("Entrez votre taille : ");
        double d = sc.nextDouble();

        System.out.println("Résumé pour " + s + " : ");
        System.out.println("  - âge " + i);
        System.out.println("  - taille " + d);
   }
}
