package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

    /** Nom de la caisse*/
    private String nom;
    /** Liste des items dans la caisse*/
    private List<Item> items;
    /** Poids minimum d'un item dans cette caisse*/
    private int poidsItemMin;
    /** Poids maxiumum d'un item dans cette caisse*/
    private int poidsItemMax;

    /**
     * Constructeur
     * @param nom
     * @param poidsMin
     * @param poidsMax
     */
    public Caisse(String nom, int poidsMin, int poidsMax) {
        super();
        this.nom = nom;
        this.items = new ArrayList<>();
        this.poidsItemMin = poidsMin;
        this.poidsItemMax = poidsMax;
    }

    /**
     * Selection les items entre un poids min et max
     * @param item
     * @return
     */
    public boolean accepte(Item item) {
        return item.getPoids() >= poidsItemMin && item.getPoids() <= poidsItemMax;
    }

    /**
     * Ajoute un item
     * @param item
     */
    public void ajoutItem(Item item) {
        items.add(item);
    }

    /** Getter pour l'attribut nom
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /** Setter pour l'attribut nom
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /** Getter pour l'attribut items
     * @return the items
     */
    public List<Item> getItems() {
        return items;
    }

    /** Setter pour l'attribut items
     * @param items the items to set
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

}
