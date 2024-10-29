package ex2;

public class LivretA extends CompteBancaire {

    /** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
    private double tauxRemuneration;


    /**
     * Constructeur pour LivretA
     * @param solde le solde initial
     * @param tauxRemuneration  représente le taux de rémunération du livret A
     */
    public LivretA(double solde, double tauxRemuneration) {
        super(solde, 0);
        this.tauxRemuneration = tauxRemuneration;
    }


    /**
     * Appliquer l'augmentation de revenu lié à taux de rémunération
     */
    public void appliquerRemuAnnuelle() {
        setSolde(getSolde() + getSolde() * tauxRemuneration / 100);
    }


    /** Getter
     * @return the tauxRemuneration
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    /** Setter
     * @param tauxRemuneration the tauxRemuneration to set
     */
    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }
}
