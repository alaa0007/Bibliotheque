import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Bibliotheque {
    List<Livre> tabLivre;
    ListEmprunt tabEmprunt;
    Map<Adherent, ListEmprunt> tabAdherent;
    private Scanner scNumeroLivre;
    private Scanner scTitre;
    private Scanner scNbrExemplaire;

    public Bibliotheque() {
        tabLivre = new ArrayList<>();
        tabEmprunt = new ListEmprunt();
        tabAdherent = new HashMap<>();
    }

    /*
     * oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo
     */
    /*
     * oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo
     */
    public boolean rechercherLivre(Livre l) {
        for (Livre liv : tabLivre) {
            if (liv.equals(l)) {
                return true;
            }
        }
        return false;
    }

    public void ajouterLivre(Livre l) {
        if (rechercherLivre(l)) {
            for (Livre liv : tabLivre) {
                if (liv.equals(l)) {
                    liv.setNmbrExemplaire(liv.getNmbrExemplaire() + 1);
                    return;
                }
            }
        } else {
            tabLivre.add(l);
        }
    }

    public void ajouterLivre() {
        System.out.println(
                "--------------------------------------------Creation du livre--------------------------------------------");

        Livre l = new Livre();
        System.out.println("Numero du livre : ");
        scNumeroLivre = new Scanner(System.in);
        l.setNumero(scNumeroLivre.nextInt());

        if (rechercherLivre(l)) {
            System.out.println("Livre deja existant, le nombre d'exemplaire va augmenter de 1\n");
            for (Livre liv : tabLivre) {
                if (liv.equals(l)) {
                    liv.setNmbrExemplaire(liv.getNmbrExemplaire() + 1);
                    return;
                }
            }
        }

        else {
            System.out.println("Nom du livre : ");
            scTitre = new Scanner(System.in);
            l.setTitre(scTitre.next());
            System.out.println("Nombre d'exemplaire du livre : ");
            scNbrExemplaire = new Scanner(System.in);
            l.setNmbrExemplaire(scNbrExemplaire.nextInt());
            tabLivre.add(l);
        }
    }

    public void supprimerLivre() {
        Livre l = new Livre();
        System.out.println("Numero du livre a supprimer : ");
        scNumeroLivre = new Scanner(System.in);
        l.setNumero(scNumeroLivre.nextInt());

        if (tabLivre.remove(l))
            System.out.println("le livre a ete supprimer avec succes");
        else
            System.out.println("le livre n existe pas");
    }

    public void afficherLivresBibliotheque() {
        for (Livre liv : tabLivre)
            System.out.println("Livre numero= " + liv.getNumero() + ", titre=" + liv.getTitre()
                    + ", Nombre exemplaires existants= " + liv.getNmbrExemplaire() + "\n");
        if (tabLivre.size() == 0)
            System.out.println("La bibliotheque ne contient aucun livre");
    }

    public void afficherNbrExemplaire() {
        Livre l = new Livre();
        System.out.println("Numero du livre : ");
        scNumeroLivre = new Scanner(System.in);
        l.setNumero(scNumeroLivre.nextInt());
        for (Livre liv : tabLivre) {
            if (liv.equals(l)) {
                System.out.println("Nombre d exemplaire pour ce livre = " + liv.getNmbrExemplaire());
                return;
            }

        }
        System.out.println("Le livre n existe pas");

    }

    /*
     * oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo
     */
    /*
     * oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo
     */

    public void ajouterEmpruntBibliotheque() {
        tabEmprunt.ajouterEmprunt();
    }

    public void supprimerEmpruntBibliotheque() {
        tabEmprunt.supprimerEmprunt();
    }

}
