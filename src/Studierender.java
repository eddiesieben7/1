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

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void frageStellen(Dozierender dozierender) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Möchten Sie einem Dozenten eine Frage stellen? (ja/nein)");
        String antwort = scanner.nextLine();

        if (antwort.equalsIgnoreCase("ja")) {
            System.out.println("Geben Sie Ihre Frage ein:");
            String frage = scanner.nextLine();
            dozierender.frageBeantworten(this, frage);
        } else if (antwort.equalsIgnoreCase("nein")) {
            sprechstunde(dozierender);
        } else {
            System.out.println("Ungültige Eingabe. Bitte geben Sie 'ja' oder 'nein' ein.");
            frageStellen(dozierender);
        }
    }

    public void erhalteAntwort(String antwort) {
        System.out.println("Antwort erhalten: " + antwort);
    }

   
   
   
    public void sprechstunde(Dozierender dozierender) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Möchten Sie eine Sprechstunde vereinaberen? (ja/nein)");
        String antwort = scanner.nextLine();
       
        if (antwort.equalsIgnoreCase("ja")) { 
        scanner = new Scanner(System.in);
        System.out.println("Sprechestunde vereinabren. Bitte geben Sie den Namen des Dozenten ein:");
        String dozent = scanner.nextLine();
        
       
         scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Kurs in in welchem Sie den gewünschten Dozenten haben:");
        String kurs = scanner.nextLine();
       
        scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihr anliegen an den Dozenten ein:");
        String anliegen = scanner.nextLine();
        dozierender.anfrageSprechstunde(this, anliegen, kurs, dozent, this.studiengang, this.matrikelnummer);
        } else if (antwort.equalsIgnoreCase("nein")) {
            feedback(dozierender);
        } else {
            System.out.println("Ungültige Eingabe. Bitte geben Sie 'ja' oder 'nein' ein.");
            sprechstunde(dozierender);
        }

        
    }

    public void erhalteSprechstunde(String antwortSprechstunde) {
        System.out.println("Antwort erhalten: " + antwortSprechstunde);
    }

    
    
    
    public void feedback(Dozierender dozierender) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Möchten Sie dem Dozenten Feedback geben? (ja/nein)");
        String antwort = scanner.nextLine();


        if (antwort.equalsIgnoreCase("ja")) {
        scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihre Bewertung für den Dozenten ein:");
        System.out.println("Interessant (1-5):");
        int interessant = readValidNumber(scanner);
        System.out.println("Verständlich (1-5):");
        int verstaendlich = readValidNumber(scanner);
        System.out.println("Hilfreich (1-5):");
        int hilfreich = readValidNumber(scanner);
        System.out.println("Kompetenz (1-5):");
        int kompetenz = readValidNumber(scanner);
        System.out.println("Gesamtbewertung (1-5):");
        int gesamtbewertung = readValidNumber(scanner);
        dozierender.feedbackErhalten(this, interessant, verstaendlich, hilfreich, kompetenz, gesamtbewertung);
    } else if (antwort.equalsIgnoreCase("nein")) {
        System.out.println("Vielen Dank für Ihre Teilnahme.");
} else {
    System.out.println("Ungültige Eingabe. Bitte geben Sie 'ja' oder 'nein' ein.");
    feedback(dozierender);
}
}

    private int readValidNumber(Scanner scanner) {
        int number;
        do {
            number = scanner.nextInt();
            if (number < 1 || number > 5) {
                System.out.println("Zahl zu klein/groß, bitte erneut eingeben:");
            }
        } while (number < 1 || number > 5);
        return number;
    }

    

    

    
}

