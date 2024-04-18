import java.util.Scanner;


public class Studierender {
   
    private String name;
    private int matrikelnummer;
    private String studiengang;

    
    public Studierender(String name, int matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    public String getName() {
        return name;
    }

    
    public void frageStellen(Dozierender dozierender) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie Ihre Frage ein:");
        String frage = scanner.nextLine();
        dozierender.frageBeantworten(this, frage);
    }

    public void erhalteAntwort(String antwort) {
        System.out.println("Antwort erhalten: " + antwort);
    }
}

