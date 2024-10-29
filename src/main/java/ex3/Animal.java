package ex3;

public class Animal {
    /**
     * Nom de l'animal
     */
    private String nom;
    /**
     * Type (ex : mamaifère, poisson, serpent) de l'animal
     */
    private String TypeAnimal;
    /**
     * Comportement (ex : herbivore ou carnivore) de l'animal
     */
    private String Comportement;

    /**
     * Constructeur
     * @param nom
     * @param typeAnimal
     * @param comportement
     */
    public Animal(String nom, String typeAnimal, String comportement) {
        this.nom = nom;
        this.TypeAnimal = typeAnimal;
        this.Comportement = comportement;
    }

    /** Getter
     *@return nom
     */
    public String getNom() {
        return nom;
    }

    /** Getter
     *@return TypeAnimal
     */
    public String getTypeAnimal() {
        return TypeAnimal;
    }

    /** Getter
     *@return Comportement
     */
    public String getComportement() {
        return Comportement;
    }
}
