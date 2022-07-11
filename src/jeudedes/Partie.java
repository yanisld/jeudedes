package jeudedes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Partie {
    private List<Joueur> joueurs = new ArrayList<>();
    private int nb_tours;
    private Gobelet gobelet;

    /**
     * Constructeur de la classe Partie
     * @param nb_tours nombre de tours dans une partie
     * @param nb_des nombre de dés dans un gobelet
     */
    public Partie(int nb_tours, Gobelet nb_des){
        this.nb_tours = nb_tours;
        this.gobelet = nb_des;
    }

    /**
     * Choisi le nombre de joueurs puis fait saisir leur noms
     */
    public void initialiser(){
        Scanner scanner = new Scanner(System.in);
        String nomJoueur;
        System.out.println("-------------Inscription des joueurs---------------");
        System.out.println("Choisir un nombre de joueur:");
        int nbJoueurs = scanner.nextInt();
        for(int i = 0; i < nbJoueurs; i++){
            System.out.println("Saisir le nom d'un joueur: ");
            nomJoueur = scanner.next();
            this.joueurs.add(new Joueur(nomJoueur));
        }
        System.out.println("Inscription terminee");
    }

    /**
     * Initialise puis lance la partie
     */
    public void lancer(){
        this.initialiser();
        System.out.println("-------------Debut de la partie---------------");
        for(int i = 1; i <= this.nb_tours; i++){
            System.out.println("-------------Tour " + i + " :");
            for(Joueur joueur : this.joueurs){
                System.out.println(joueur.get_nom() + " lance le gobelet");
                joueur.jouer(this.gobelet);
                System.out.println("Score actuel: " + joueur.get_score());
            }
        }
        System.out.println("-------------Fin de la partie---------------");
    }

    /**
     * Affiche le nom du joueur ave le score le plus élevé
     * La méthode ne fonctionne pas
     */
    public void afficher_gagnant(){
        String gagnant = "Aucun gagant";
        for(int i = 0; i < this.joueurs.size(); i++){
            for(int j = i + 1; j < this.joueurs.size() - 1; j++){
                if(this.joueurs.get(i).get_score() > this.joueurs.get(j).get_score()){
                    gagnant = this.joueurs.get(i).get_nom();
                } else {
                    gagnant = this.joueurs.get(j).get_nom();
                }
            }
        }
        System.out.println("Gagnant: " + gagnant);
    }
}
