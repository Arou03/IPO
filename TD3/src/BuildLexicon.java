import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.*;
import java.util.Map.Entry;

public class BuildLexicon {

	/**
	 * Affiche les paires triees par likelihood ratio
	 * 
	 * @param res 
	 */
	private static void printSortedLikelikhoodTable(HashMap<String, Double> res) {

		for (Entry<String, Double> r : MapUtil.sortByValue(res)) {
			System.out.println(r.getKey() + "->" + r.getValue());
		}

	}

	/**
	 * Afficher la table de coocurences par ordre de frequences croissantes
	 * 
	 * @param coocTable
	 */
	private static void printSortedCoocTable(
			HashMap<String, HashMap<String, Integer>> coocTable) {

		HashMap<String, Double> res = new HashMap<String, Double>();
		for (String frWord : coocTable.keySet()) {
			HashMap<String, Integer> map = coocTable.get(frWord);

			for (String enWord : map.keySet()) {
				res.put(frWord + "-" + enWord, (double) map.get(enWord));
			}
		}
		
		for (Entry<String, Double> r : MapUtil.sortByValue(res)) {
		    System.out.println(r.getKey() + "->" + r.getValue());
		}

	}

	/**
	 * Retourne le contenu d'un fichier sous forme d'une chaine de caractÃ¨res
	 * 
	 * @param filename
	 * @return
	 */
	public static String readFile(String filename) {
		try {
			FileInputStream stream = new FileInputStream(new File(filename));
			FileChannel fc = stream.getChannel();
			MappedByteBuffer bb = fc.map(FileChannel.MapMode.READ_ONLY, 0,
					fc.size());
			stream.close();
			return Charset.defaultCharset().decode(bb).toString();
		} catch (IOException e) {
			System.out.println("Erreur lors de l'accÃ¨s au fichier " + filename);
			System.exit(1);
		}
		return null;
	}


	/**
	 *  compte le nombre de phrases dans lequel apparait un mot donnee
	 *  attention : les mots repetes plusieurs fois dans une phrase ne compte que une fois
	 *  
	 * @param txt
	 * @return
	 */
    // Méthode à réaliser
    public static HashMap<String, Integer> countSentencesWithWord(String txt) {
		HashMap<String, Integer> res = new HashMap<String, Integer>();
		String[] phrases = txt.split("\n");
		for(String ligne : phrases) {
			String[] mots = ligne.split("_");
			HashSet<String> motsCollection = new HashSet<String>(Arrays.asList(mots));
			for(String mot : motsCollection) {
				Integer nb = res.get(mot);
				if (nb == null) {
					res.put(mot, 1);
				} else {
					res.put(mot, nb + 1);
				}
			}
		}
		return res;
    }

    // Construit la table de coocurence : à une paire (mot français, mot
    // anglais), on associe le nombre de bi-phrases dans lesquelles cette paire
    // apparait
    // Attention : paires répétées plusieurs fois dans une bi-phrase ne doivent
    // être comptées qu'une fois.
    //
    // Méthode à réaliser
    private static HashMap<String, HashMap<String, Integer>> buildCoocTable(String fr, String en) {
		HashMap<String, HashMap<String, Integer>> res = new HashMap<String, HashMap<String, Integer>>();
		String[] phrasesFR = fr.split("\n");
		ArrayList<HashSet<String>> txtFR = new ArrayList<HashSet<String>>();
		String[] phrasesEN = en.split("\n");
		for(String ligneFR : phrasesFR) {
			String[] motsFR = ligneFR.split("_");
			HashSet<String> motsCollectionFR = new HashSet<String>(Arrays.asList(motsFR));
			txtFR.add(motsCollectionFR);
		}
		for(int i = 0; i < txtFR.size(); i++) {
			for(String mot : txtFR.get(i)) {
				res.put(mot, countSentencesWithWord(phrasesEN[i]));
			}
		}

		return null;
    }

    /**
     * Construit la liste des paires et de leur likelihoodRatio
     * 
     * @param table
     * @param frWordCounts
     * @param enWordCounts
     * @param nSentences
     * @return
     */
    // Methode a  realiser
    public static HashMap<String, Double> constructLikelihoodTable(
								   HashMap<String, HashMap<String, Integer>> table,
								   HashMap<String, Integer> frWordCounts,
								   HashMap<String, Integer> enWordCounts, int nSentences) {
    //TODO

	return null;
	
    }

    public static double likelihoodRatio(int nA, int nB, int nAB, int n) {
	return 0;
    }
    
    public static void main(String[] args) {
	String fr = readFile("french.corpus");
	String en = readFile("english.corpus");
	
	int nSentences = fr.split("\n").length;
	
	HashMap<String, Integer> frWordCounts = countSentencesWithWord(fr);
	HashMap<String, Integer> enWordCounts = countSentencesWithWord(en);
	HashMap<String, HashMap<String, Integer>> coocTable = buildCoocTable(fr, en);
	
	// attention, la méthode détruit la table de coocurrence !!!
	printSortedCoocTable(coocTable);
		System.out.println("Hallo");

		HashMap<String, Double> res = constructLikelihoodTable(coocTable,
								       frWordCounts, enWordCounts, nSentences);
		// printSortedLikelikhoodTable(res);
		System.out.println("Hallo");
    }
    
}
