public class Persoana implements Comparable<Persoana>{
    String nume;
    String prenume;
    int varsta;

    Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    @Override
    public int compareTo(Persoana o) {
        return prenume.compareTo(o.prenume);
    }

    @Override
    public String toString() {
        return nume + " " + prenume + " " + varsta;
    }

    public String getPrenume() {
        return prenume;
    }

}
