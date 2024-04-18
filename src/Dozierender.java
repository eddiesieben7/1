import java.util.Scanner;


public class Dozierender {
    
    private String nameDozent;
    private String fakultaet;
    private int bueronummer;
    
   
    public Dozierender(String name, String fakultaet, int bueronummer) {
        this.nameDozent = nameDozent;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
        
    }

    public String getName() {
        return nameDozent;
    }

    public String getFakultaet() {
        return fakultaet;
    }

    public int getBueronummer() {
        return bueronummer;
    }


   



   
    public void frageBeantworten(Studierender studierender, String frage) {
        System.out.println("Frage von " + studierender.getName() + ": " + frage);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie Ihre Antwort ein:");
        String antwort = scanner.nextLine();
        studierender.erhalteAntwort(antwort);
    }

    public void anfrageSprechstunde(Studierender studierender, String dozent, String kurs, String anliegen, String studiengang, int matrikelnummer) {
        System.out.println("Anfrage von " + studierender.getName() + "\nStudiengang: " + studiengang + "\n Matrikelnummer: " + matrikelnummer + "\nKurs: " + kurs + " \n Anliegen: " + anliegen);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Schreiben Sie dem Studierenden eine Antwort:");
        String antwortSprechstunde = scanner.nextLine();
        studierender.erhalteSprechstunde(antwortSprechstunde);

    

    }

    public void feedbackErhalten(Studierender studierender, int interessant, int verstaendlich, int hilfreich, int kompetenz, int gesamtbewertung) {
        System.out.println("Feedback erhalten von 1-5 (1 sehr gut; 5 Sehr schlecht): " + "\nInteressanter Unterricht: " + interessant + "\nVerstaendliches Reden: " + verstaendlich + "\nHilfreicher Unterricht: " + hilfreich + "\nKompetenz: " + kompetenz + "\nGesamtbewertung: " + gesamtbewertung);
    }

    
       

    
}