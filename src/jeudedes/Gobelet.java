package jeudedes;

import java.util.ArrayList;
import java.util.List;

public class Gobelet {
    private int valeur;
    private List<De> des = new ArrayList<>();

    public Gobelet(List<De> nb_des){
        this.valeur = 0;
        this.des = nb_des;
    }

    /**
     * Renvoie la valeur de l'attribut valeur de la classe Gobelet
     * @return attribut valeur
     */
    public int get_valeur(){
        return this.valeur;
    }

    /**
     * Parcours la liste des dés, effectue un lancé sur chaqun d'eux puis ajoute cette valeur au score du goblet
     * @return Score total, somme de chaqun des lancés de dé
     */
    public int lancer(){
        int scoreGobelet = 0;
        for(int i = 0; i < this.des.size(); i++){
            this.des.get(i).lancer();
            scoreGobelet += this.des.get(i).get_valeur();
        }
        return scoreGobelet;
    }

    /**
     * Affiche le score final du lancé effectué
     */
    public void afficher_score(){
        System.out.println("Score: " + this.lancer());
    }
}
