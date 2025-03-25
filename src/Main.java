import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Persoana> persoane = citire("persoane.txt");

        persoane.sort(Comparator.comparing(p -> p.getPrenume()));

        afisareEcran(persoane);
    }

    private static List<Persoana> citire(String fisier) {
        File file = new File(fisier);

        Scanner scanner = null;

        List<Persoana> persoane = new ArrayList<Persoana>();

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (scanner.hasNextLine()) {
            String linie = scanner.nextLine();
            String[] split = linie.split(" ");
            String nume = split[0];
            String prenume = split[1];
            int varsta = Integer.parseInt(split[2]);

            persoane.add(new Persoana(nume, prenume, varsta));

        }
        return persoane;
    }

        private static void afisareEcran(List<Persoana> persoane) {
            for (Persoana persoana : persoane) {
                System.out.println(persoana);
            }
        }
}