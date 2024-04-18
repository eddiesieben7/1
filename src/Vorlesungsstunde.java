import java.util.Date;

public class Vorlesungsstunde {
    private String thema;
    private Date datum;
    private String uhrzeit;
    private String raum;

    public Vorlesungsstunde(String thema, Date datum, String uhrzeit, String raum) {
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
    }

    public void anzeigenDetails() {
        System.out.println("Thema: " + thema);
        System.out.println("Datum: " + datum);
        System.out.println("Uhrzeit: " + uhrzeit);
        System.out.println("Raum: " + raum);
    }
}
