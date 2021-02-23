public class Adherent {
    private int cin, nbrLivre;

    public Adherent() {
    }

    public Adherent(int cin, int nbrLivre) {
        this.cin = cin;
        this.nbrLivre = nbrLivre;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public int getNbrLivre() {
        return nbrLivre;
    }

    public void setNbrLivre(int nbrLivre) {
        this.nbrLivre = nbrLivre;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Adherent) {
            Adherent ad = (Adherent) obj;
            if (this.getCin() == ad.getCin())
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {

        return cin;
    }

    @Override
    public String toString() {
        return "Adherent [cin=" + cin + ", nbrLivre=" + nbrLivre + "]";
    }

}
