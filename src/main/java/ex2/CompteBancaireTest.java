package ex2;

/**
 * Classe de bidouillage test pour voir si les autres classes fonctionnent
 */
public class CompteBancaireTest {
    public static void main(String[] args) {
        /**
         * Définition du compte courant et du livret A
         */
        CompteBancaire compteCourant = new CompteBancaire(1000, -500);
        LivretA livretA = new LivretA(2000, 1.5);

        /**
         * Test ajout
         */
        compteCourant.ajouterMontant(500);
        System.out.println(compteCourant.getSolde());
        livretA.ajouterMontant(500);
        System.out.println(livretA.getSolde());

        /**
         * Test débit
         */
        compteCourant.debiterMontant(300);
        System.out.println(compteCourant.getSolde());
        livretA.debiterMontant(300);
        System.out.println(livretA.getSolde());

        /**
         * Test découvert
         */
        compteCourant.debiterMontant(1800);
        System.out.println(compteCourant.getSolde());
        livretA.debiterMontant(2100);
        System.out.println(livretA.getSolde());

        /**
         * Test remueration
         */
        livretA.appliquerRemuAnnuelle();
        System.out.println(livretA.getSolde());

    }
}
