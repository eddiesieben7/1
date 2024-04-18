import java.util.Date;

public class Praktikumsstunde {
    private String thema;
    private Date datum;
    private String uhrzeit;
    private String raum;
    private String aufgaben;

    public Praktikumsstunde(String thema, Date datum, String uhrzeit, String raum, String aufgaben) {
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
        this.aufgaben = aufgaben;
    }

    public void anzeigenDetails() {
        System.out.println("Thema: " + thema);
        System.out.println("Datum: " + datum);
        System.out.println("Uhrzeit: " + uhrzeit);
        System.out.println("Raum: " + raum);
        System.out.println("Aufgaben: " + aufgaben);
    }
}
