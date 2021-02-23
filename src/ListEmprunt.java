import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEmprunt {
    List<Emprunt> tabEmp;
    private Scanner scNumCin;
    private Scanner scNumLivre;
    private Scanner scjj1;
    private Scanner scmm1;
    private Scanner scaa1;
    private Scanner scjj2;
    private Scanner scmm2;
    private Scanner scaa2;

    public ListEmprunt() {
        tabEmp = new ArrayList<>();
    }

    public void ajouterEmprunt() {
        Emprunt e = new Emprunt();
        System.out.println("Numero de Cin : ");
        scNumCin = new Scanner(System.in);
        e.setNumCin(scNumCin.nextInt());
        System.out.println("Numero du livre : ");
        scNumLivre = new Scanner(System.in);
        e.setNumCin(scNumLivre.nextInt());
        if (rechercherEmprunt(e))
            System.out.println("cet adherent a deja emprunter ce livre");
        else {
            System.out.println("jour d'emprunt : ");
            scjj1 = new Scanner(System.in);
            e.setJ1(scjj1.nextInt());

            System.out.println("Mois d'emprunt : ");
            scmm1 = new Scanner(System.in);
            e.setM1(scmm1.nextInt());

            System.out.println("Année d'emprunt : ");
            scaa1 = new Scanner(System.in);
            e.setA1(scaa1.nextInt());

            System.out.println("jour de retour : ");
            scjj2 = new Scanner(System.in);
            e.setJ2(scjj2.nextInt());

            System.out.println("Mois de retour : ");
            scmm2 = new Scanner(System.in);
            e.setM2(scmm2.nextInt());

            System.out.println("Année de retour : ");
            scaa2 = new Scanner(System.in);
            e.setA2(scaa2.nextInt());

            tabEmp.add(e);
        }

    }

    public void supprimerEmprunt() {
        Emprunt e = new Emprunt();
        System.out.println("Numero de Cin de l'emprunt a supprimer : ");
        scNumCin = new Scanner(System.in);
        e.setNumCin(scNumCin.nextInt());
        System.out.println("Numero du livre de l'emprunt a supprimer : ");
        scNumLivre = new Scanner(System.in);
        e.setNumCin(scNumLivre.nextInt());

        if (tabEmp.remove(e))
            System.out.println("l Emprunt a ete supprimer avec succes");
        else
            System.out.println("l Emprunt n existe pas");

    }

    public boolean rechercherEmprunt(Emprunt e) {
        return tabEmp.contains(e);
    }

    @Override
    public String toString() {
        return "ListEmprunt [emp=" + tabEmp + "]";
    }

}
