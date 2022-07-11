package jeudedes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Création de trois objets dés
        De de1 = new De();
        De de2 = new De();
        De de3 = new De();

        // Ajout des trois objets dés dans une liste
        List<De> nbDes = new ArrayList<>(Arrays.asList(de1, de2, de3));

        // Création de d'un objet gobelet et ajout de la liste de dés en argument
        Gobelet gob = new Gobelet(nbDes);

        // Création et lancement de la partie
        Partie partie = new Partie(3, gob);
        partie.lancer();
        partie.afficher_gagnant();
    }
}
