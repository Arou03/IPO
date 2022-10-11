import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class TextFilterByLanguage {

    public static Locale readLang(String text) {
        String tmp = "";
        int i = 0;
        while(text.charAt(i) != ' ' && i < 3) {
            i++;
            tmp+= text.charAt(i);
        }
        return new Locale(tmp);
    }

    public static Locale readLocale(String text) {
        String tmp = "";
        int i = 0;
        while(text.charAt(i) != '\n') {
            i++;
            tmp+= text.charAt(i);
        }
        String separateur = " ";
        String[] sTab = tmp.split(separateur);
        if(sTab.length == 3) return new Locale(sTab[0], sTab[1], sTab[2]);
        if(sTab.length == 2) return new Locale(sTab[0], sTab[1];
        return new Locale(sTab[0]);
    }

    public static void displayLanguage(String text){
        Locale l = readLang(text);
        System.out.println(l.getDisplayLanguage());
    }

    /**
     * Filter the collection of text according to the given language
     * 
     * @param textCollection: a collection of well-formed texts, 
     *                       where their language is given in the first line 
     * @param lang: the chosen language, as in would displayed for the user
     * @return a list of the texts in the chosen language
     */
    public static ArrayList<String> filterByLang(
                ArrayList<String> textCollection, String lang){
        //TODO
    }

    /**
     * 
     * @param textCollection
     * @return a map between languages in their display form 
                    and the texts in this langage
     */
    public static HashMap<String, ArrayList<String>> groupByLang(
                ArrayList<String> textCollection){
        //TODO
    }

    public static void main(String[] args) {
        
        String texEn1 = "en /n hello world";
        String texEn2 = "en ca canada /n Oh Canada!";
        String texFr1 = "fr /n Bonjour ! /n Comment tu vas ?";
        String texEn3 = "en us /n Do you want to initialize this?";
        ArrayList<String> texts = new ArrayList<>();
        texts.add(texEn1);
        texts.add(texEn2);
        texts.add(texFr1);
        texts.add(texEn3);

        displayLanguage(texEn1);
        displayLanguage(texEn2);
        System.out.println(readLocale(texEn2));
        System.out.println(readLang(texEn2));
        System.out.println(readLocale(texEn3));
        
        System.out.println("filtrer par : anglais");
        for (String t : filterByLang(texts, "anglais")){
            System.out.println(t);
        }
        System.out.println("textes en francais");
        for (String t : groupByLang(texts).get("francais")){
            System.out.println(t);
        }
        System.out.println("textes en anglais");
        for (String t : groupByLang(texts).get("anglais")){
            System.out.println(t);
        }
    }
}
