public class Emprunt {
    private int numCin, numLivre;
    private int j1, m1, a1;
    private int j2, m2, a2;

    public Emprunt() {
    }

    public Emprunt(int numCin, int numLivre, int j1, int m1, int a1, int j2, int m2, int a2) {
        this.numCin = numCin;
        this.numLivre = numLivre;
        this.j1 = j1;
        this.m1 = m1;
        this.a1 = a1;
        this.j2 = j2;
        this.m2 = m2;
        this.a2 = a2;
    }

    public int getNumCin() {
        return numCin;
    }

    public void setNumCin(int numCin) {
        this.numCin = numCin;
    }

    public int getNumLivre() {
        return numLivre;
    }

    public void setNumLivre(int numLivre) {
        this.numLivre = numLivre;
    }

    public int getJ1() {
        return j1;
    }

    public void setJ1(int j1) {
        this.j1 = j1;
    }

    public int getM1() {
        return m1;
    }

    public void setM1(int m1) {
        this.m1 = m1;
    }

    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public int getJ2() {
        return j2;
    }

    public void setJ2(int j2) {
        this.j2 = j2;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public int getA2() {
        return a2;
    }

    public void setA2(int a2) {
        this.a2 = a2;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Emprunt) {
            Emprunt e = (Emprunt) obj;
            if (this.getNumCin() == (e.getNumCin()) && this.getNumLivre() == e.getNumLivre())
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Emprunt [numCin= " + numCin + ", numLivre= " + numLivre + "] Date d'emprunte : " + j1 + "/" + m1 + "/"
                + a1 + " Date de retour : " + j2 + "/" + m2 + "/" + a2;
    }

}
