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

    public void sprechstunde(Dozierender dozierender) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Namen des Dozenten ein:");
        String dozent = scanner.nextLine();
        if (dozent.equals(dozierender.getName())) {
            System.out.println("Der Dozent ist in der Sprechstunde");
        } else {
            System.out.println("Der Dozent ist nicht in der Sprechstunde");
        }
       
         scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Kurs in in welchem Sie den gewünschten Dozenten haben:");
        String kurs = scanner.nextLine();

        scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihr anliegen an den Dozenten ein:");
        String anliegen = scanner.nextLine();

        
    }
}

