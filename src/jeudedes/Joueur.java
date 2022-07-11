package jeudedes;

public class Joueur {
    private String nom;
    private int score;

    /**
     * Constructeur de la classe Joueur
     * @param nom nom du joueur
     */
    public Joueur(String nom){
        this.nom = nom;
        this.score = 0;
    }

    /**
     * Getter de l'attribut nom de la classe Joueur
     * @return nom
     */
    public String get_nom(){
        return this.nom;
    }

    /**
     * Getter de l'attribut score de la classe Joueur
     * @return score
     */
    public int get_score(){
        return this.score;
    }

    /**
     * Change le score du joueur en fonction du score total du gobelet joué
     * @param gobelet gobelet actuellement joué
     */
    public void jouer(Gobelet gobelet){
        this.score += gobelet.lancer();
    }

    /**
     * Affiche le nom du joueur et son score
     */
    public void afficher_score(){
        System.out.println("Le score de " + this.get_nom() + " est " + this.get_score());
    }
}
