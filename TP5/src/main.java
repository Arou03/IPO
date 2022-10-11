import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        QCM quiz = new QCM();
        Question premiers = new Question("A propos des nombres premiers");
        premiers.add("Le nombre 1 est premier", false);
        premiers.add("Il en existe une infinité", true);
        premiers.add("Un nombre pair peut-être premier", true);
        premiers.add("Le produit de deux nombres premiers est premier", false);
        quiz.add(premiers);
        Question meteo = new Question("Quel temps fait-il aujourd'hui");
        meteo.add("Nuageux", true);
        meteo.add("Pluvieux", false);
        meteo.add("Orageux", false);
        quiz.add(meteo);

        System.out.print(quiz);
    }
}
