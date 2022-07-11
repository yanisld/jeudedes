package jeudedes;

public class De {
    private int valeur;

    public De(){ this.valeur = 0; }

    /**
     * Renvoie la valeur de l'attribut valeur
     * @return attribut valeur
     */
    public int get_valeur(){
        return this.valeur;
    }

    /**
     * Modifie l'attribut valeur en un entier aléatoire entre 1 et 6
     */
    public void lancer(){
        this.valeur = (int) ((Math.random() * (6 - 1)) + 1);
    }
}
