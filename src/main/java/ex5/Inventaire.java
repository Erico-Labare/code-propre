package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

    private List<Caisse> caisses;

    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new Caisse("Petits objets", 0, 5));
        caisses.add(new Caisse("Moyens objets", 5, 20));
        caisses.add(new Caisse("Grands objets", 20, 40));
    }

    /**
     * Boucle de selection des items en utilisant la methode accepte() de la classe Caisse
     * @param item
     */
    public void addItem(Item item) {
        for (Caisse caisse : caisses) {
            if (caisse.accepte(item)) {
                caisse.ajoutItem(item);
                break;
            } else {
                System.out.println("Erreur, objet trop lourd être dans une caisse!");
                break;
            }
        }
    }

    /**
     * Boucle pour garder à jours le nombre d'objet ans une caisse
     * @return
     */
    public int taille() {
        int total = 0;
        for (Caisse caisse : caisses) {
            total += caisse.getItems().size();
        }
        return total;
    }
}
