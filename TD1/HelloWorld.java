import java.util.Scanner;

// Le programme doit porter le même nom que le fichier
// Ici, le fichier s'appelle HelloWorld.java
public class HelloWorld {
    
    // Fonction principale, appelée par le programme
    public static void main(String[] args) {
	// Déclarations de variables
		Scanner s = new Scanner(System.in);
		System.out.println("Comment tu t'appelles ?");
		String name = s.next();
		int num = 12;
		String month = "septembre";
	
		// System.out.println affiche sur la sortie standard
		System.out.println("Hello world!");

		// + peut servir a concaténer des chaines de caractères
		System.out.println("Hello " + name + "!");

		// Une conversion d'un nombre en chaîne de caractères se fait
        // "automatiquement" (à venir dans le cours : via toString() )
		System.out.println("Nous sommes le " + num + " " + month);
	
    }
}
