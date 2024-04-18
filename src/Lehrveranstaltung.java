import java.util.ArrayList;
import java.util.List;

public class Lehrveranstaltung {
    private String titel;
    private List<Dozierender> dozierende;
    private List<Studierender> studierende;
    private List<Vorlesungsstunde> vorlesungsstunden;
    private List<Praktikumsstunde> praktikumsstunden;

    public Lehrveranstaltung(String titel) {
        this.titel = titel;
        this.dozierende = new ArrayList<>();
        this.studierende = new ArrayList<>();
        this.vorlesungsstunden = new ArrayList<>();
        this.praktikumsstunden = new ArrayList<>();
    }

    public void addStudierender(Studierender studierender) {
        studierende.add(studierender);
    }

    public void removeStudierender(Studierender studierender) {
        studierende.remove(studierender);
    }

    public void addDozierender(Dozierender dozierender) {
        dozierende.add(dozierender);
    }

    public void removeDozierender(Dozierender dozierender) {
        dozierende.remove(dozierender);
    }

    public void addVorlesungsstunde(Vorlesungsstunde vorlesungsstunde) {
        vorlesungsstunden.add(vorlesungsstunde);
    }

    public void addPraktikumsstunde(Praktikumsstunde praktikumsstunde) {
        praktikumsstunden.add(praktikumsstunde);
    }

    public void anzeigenVeranstaltungsdetails() {
        System.out.println("Titel: " + titel);
        System.out.println("Dozierende: ");
        for (Dozierender dozierender : dozierende) {
            System.out.println("- " + dozierender.getName());
        }
        System.out.println("Studierende: ");
        for (Studierender studierender : studierende) {
            System.out.println("- " + studierender.getName());
        }
        System.out.println("Vorlesungsstunden: ");
        for (Vorlesungsstunde vorlesungsstunde : vorlesungsstunden) {
            vorlesungsstunde.anzeigenDetails();
        }
        System.out.println("Praktikumsstunden: ");
        for (Praktikumsstunde praktikumsstunde : praktikumsstunden) {
            praktikumsstunde.anzeigenDetails();
        }
    }
}
