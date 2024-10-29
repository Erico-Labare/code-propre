package ex1;

import java.util.Date;

/**
 * Classe qui représente une entreprise qualifiée par différentes informations
 */
public class Entreprise {

    /**
     * Numéro de Siret de l'entreprise
     */
    private int siret;
    /**
     * Nom de l'entreprise
     */
    private String nom;
    /**
     * Adresse du siège de l'entreprise
     */
    private String adresse;
    /**
     * Date de création de l'entreprise
     */
    private Date dateCreation;

    /**
     * Capital maximal de l'entreprise
     */
    public static final int CAPITAL_MAX = 3000000;

    /**
     * Methode pour afficher le status de l'entreprise
     */
    public void afficherStatut() {
        //Code affichage status
    }

    /** Getter
     *@return siret
     */
    public int getSiret() {
        return siret;
    }

    /** Setter
     *@param siret siret
     */
    public void setSiret(int siret) {
        this.siret = siret;
    }

    /** Getter
     *@return nom
     */
    public String getNom() {
        return nom;
    }

    /** Setter
     *@param nom nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /** Getter
     *@return adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /** Setter
     *@param adresse adresse
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /** Getter
     *@return dateCreation
     */
    public Date getDateCreation() {
        return dateCreation;
    }

    /** Setter
     *@param dateCreation dateCreation
     */
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
