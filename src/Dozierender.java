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

   
    public void frageBeantworten(Studierender studierender, String frage) {
        System.out.println("Frage von " + studierender.getName() + ": " + frage);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie Ihre Antwort ein:");
        String antwort = scanner.nextLine();
        studierender.erhalteAntwort(antwort);


    }

    
}