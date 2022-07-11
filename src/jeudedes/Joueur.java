package jeudedes;

public class Joueur {
    private String nom;
    private int score;

    public Joueur(String nom){
        this.nom = nom;
        this.score = 0;
    }

    public String get_nom(){
        return this.nom;
    }

    public int get_score(){
        return this.score;
    }

    public void jouer(Gobelet gobelet){
        this.score = gobelet.lancer();
    }

    public void afficher_score(){
        System.out.println("Le score de " + this.get_nom() + " est " + this.get_score());
    }
}
