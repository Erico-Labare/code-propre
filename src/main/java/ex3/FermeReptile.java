package ex3;

import java.util.ArrayList;
import java.util.List;

public class FermeReptile {

    private List<Animal> animaux = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animaux.add(animal);
    }

    public void afficherListeAnimaux() {
        for (Animal animal : animaux) {
            System.out.println(animal.getNom());
        }
    }

    public int compterAnimaux() {
        return animaux.size();
    }

    public double calculerKgsNourritureParJour() {
        return animaux.size() * 0.1;
    }
}