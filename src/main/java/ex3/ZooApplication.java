package ex3;

public class ZooApplication {

    public static void main(String[] args) {
        Zoo zoo = new Zoo("Thoiry");

        Animal gazelle = new Animal("Gazelle", "MAMMIFERE", "HERBIVORE");
        Animal zebre = new Animal("Zèbre", "MAMIFERE", "HERBIVORE");
        Animal lion = new Animal("Lion", "MAMMIFERE", "HERBIVORE");
        Animal panthère = new Animal("Panthère", "MAMMIFERE", "CARNIVORE");
        Animal requinBlanc = new Animal("Requin blanc", "POISSON", "HERBIVORE");
        Animal truiteDoree = new Animal("Truite dorée", "POISSON", "HERBIVORE");
        Animal boaConstrictor = new Animal("Boa constrictor", "SERPENT", "CARNIVORE");
        Animal python = new Animal("Python", "SERPENT", "CARNIVORE");


        zoo.addAnimal(gazelle);
        zoo.addAnimal(zebre);
        zoo.addAnimal(lion);
        zoo.addAnimal(panthère);
        zoo.addAnimal(requinBlanc);
        zoo.addAnimal(truiteDoree);
        zoo.addAnimal(boaConstrictor);
        zoo.addAnimal(python);

    }
}