import java.util.Scanner;

public class Test {
    private static Scanner sc = new Scanner(System.in);
    private static Bibliotheque b1 = new Bibliotheque();
    private static boolean quest;

    public static void main(String args[]) {

        Livre l1 = new Livre(1, "Karoui", 0);
        Livre l2 = new Livre(2, "Mahoura", 0);
        Livre l3 = new Livre(3, "Tauxf", 4);
        Livre l4 = new Livre(4, "Salamouza", 2);
        Livre l5 = new Livre(5, "Yassine", 1);
        Livre l6 = new Livre(6, "Hbib", 5);
        Livre l7 = new Livre(7, "Korim", 15);
        Livre l8 = new Livre(8, "Skiris", 11);
        Livre l9 = new Livre(1);
        Livre l10 = new Livre(1);
        Livre l11 = new Livre(1);
        b1.ajouterLivre(l1);
        b1.ajouterLivre(l2);
        b1.ajouterLivre(l3);
        b1.ajouterLivre(l4);
        b1.ajouterLivre(l5);
        b1.ajouterLivre(l6);
        b1.ajouterLivre(l7);
        b1.ajouterLivre(l8);
        b1.ajouterLivre(l9);
        b1.ajouterLivre(l10);
        b1.ajouterLivre(l11);
        steps();
    }

    /*************************************************************************************************************************/
    public static void steps() {

        new AffichageMenuPrincipale();
        firstStep(choix());

    }

    public static void firstStep(int choix1) {

        if (choix1 == 0) {
            new AffichageMenuPrincipale();
            firstStep(choix());
        }
        if (choix1 == 1) {
            new AffichageMenuAdherent();
            gestionAdherent(choix());

        } else if (choix1 == 2) {
            new AffichageMenuBibliotheque();
            gestionBibliotheque(choix());
        } else if (choix1 == 3)
            return;

    }

    public static void gestionAdherent(int choix2) {
        if (choix2 == 1) {
            b1.afficherLivresBibliotheque();
            firstStep(1);
        } else if (choix2 == 2) {
            b1.ajouterEmpruntBibliotheque();
            firstStep(1);
        } else if (choix2 == 3) {
            b1.supprimerEmpruntBibliotheque();
            firstStep(1);
        } else if (choix2 == 4) {
        } else if (choix2 == 5)
            firstStep(0);
    }

    public static void gestionBibliotheque(int choix3) {
        if (choix3 == 1) {
            b1.ajouterLivre();
            firstStep(2);
        } else if (choix3 == 2) {
            b1.supprimerLivre();
            firstStep(2);
        } else if (choix3 == 3) {
            b1.afficherNbrExemplaire();
            firstStep(2);
        } else if (choix3 == 4) {
        } else if (choix3 == 5) {
        } else if (choix3 == 6) {
        } else if (choix3 == 7) {
        } else if (choix3 == 8) {
            firstStep(0);
        }
    }

    public static int choix() {
        return sc.nextInt();
    }
}
