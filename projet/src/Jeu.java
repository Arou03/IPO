import java.util.Random;

public class Jeu {

    Terrain terrain;
    int sortis;

    /* Initialisation d'un jeu avec le terrain initial décrit dans
       le fichier [f] donné en paramètre */
    public Jeu(String f) {
        this.terrain = new Terrain(f);
        this.sortis = 0;
    }

    public void tour() {
        CaseTraversable c = (CaseTraversable) terrain.randomOccupied();
        if (((EntiteMobile) c.contenu).action(c, terrain.nextOfEntity(c)) == -1) {
            c.vide();
            sortis++;
        }
    }
    public static void main(String[] args) {
        Jeu j = new Jeu("D:\\uni\\S3\\IPO\\TP9\\src\\laby1.txt");
        j.terrain.print();
        for (int i = 0; i < 100; i++) {
            j.tour();
            j.terrain.print();
        }
    }
}
