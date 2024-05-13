package generator;

import java.util.LinkedList;
import java.util.Random;

public class Generator {
    /**
     * créeation d'une linkendlist pour plus de preformance au niveux du parcoure
     */
    LinkedList<String> dictionary = new LinkedList<>();
    LinkedList<String> carctere = new LinkedList<>();

    /**
     * création d'un number random
     */
    Random random = new Random();

    /**
     * constructeur de ma class random
     */
    public Generator() {
        createList();
    }

    /**
     *  créeation des mots qu'on ajoute dans la liste crée au début de la calss
     */
    private void createList() {

        dictionary.add("éphémère");
        dictionary.add("ubuesque");
        dictionary.add("sycophante");
        dictionary.add("luminosité");
        dictionary.add("perspicacité");
        dictionary.add("équivoque");
        dictionary.add("récalcitrant");
        dictionary.add("exacerbation");
        dictionary.add("sophistique");
        dictionary.add("paradoxal");
        dictionary.add("éminence");
        dictionary.add("vélocité");
        dictionary.add("réticent");
        dictionary.add("ingénuité");
        dictionary.add("altruiste");
        dictionary.add("excentrique");
        dictionary.add("profusion");
        dictionary.add("perplexité");
        dictionary.add("effervescence");
        dictionary.add("volatilité");
        dictionary.add("mégalomanie");
        dictionary.add("labyrinthique");
        dictionary.add("soporifique");
        dictionary.add("iconoclaste");
        dictionary.add("sibyllin");
        dictionary.add("électrisant");
        dictionary.add("mystérieux");
        dictionary.add("impénétrable");
        dictionary.add("efficace");
        dictionary.add("ubiquité");
        dictionary.add("sinistre");
        dictionary.add("exacerbé");
        dictionary.add("intransigeant");
        dictionary.add("soliloque");
        dictionary.add("anachronique");
        dictionary.add("réminiscence");
        dictionary.add("sibyllin");
        dictionary.add("rétrospectif");
        dictionary.add("magnanime");
        dictionary.add("prolifique");
        dictionary.add("irrévérencieux");
        dictionary.add("hallucination");
        dictionary.add("lugubre");
        dictionary.add("élucubration");
        dictionary.add("paradoxal");
        dictionary.add("soporifique");
        dictionary.add("efflorescence");
        carctere.add("@");
        carctere.add("$");
        carctere.add("£");
        carctere.add("/");
        carctere.add("+");

    }

    /**
     * créeation de ma methode qui vas servire a renvoiyer le mots de pass crée
     */
    public void generate() {
        int randomIndex = random.nextInt(dictionary.size());
        int randomIndexForCarctere = random.nextInt(carctere.size());

        String randomWord = dictionary.get(randomIndex);
        String randomCarater = carctere.get(randomIndexForCarctere);

        System.out.println("Le PWD crée est : " + randomCarater+randomWord+randomIndex+randomCarater+randomIndexForCarctere);
    }


}
