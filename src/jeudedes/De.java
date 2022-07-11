package jeudedes;

public class De {
    public int valeur;

    public De(){ this.valeur = 0; }

    // Getters et Setters
    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    /**
     * Renvoie la valeur de l'attribut valeur
     * @return attribut valeur
     */
    public int get_valeur(){
        return getValeur();
    }

    /**
     * Modifie l'attribut valeur en un entier aléatoire entre 1 et 6
     */
    public void lancer(){
        int result;
        result = (int) ((Math.random() * (6 - 1)) + 1);
        setValeur(result);
    }
}
