import java.util.Date;

public class App {
    public static void main(String[] args) {
        
        
        Studierender studierender1 = new Studierender("Alice", 123456, "Informatik");
        Studierender studierender2 = new Studierender("Bob", 789012, "Elektrotechnik");
        
        
        Dozierender dozierender1 = new Dozierender("Prof. Dr. Müller", "Informatik", 101);
        Dozierender dozierender2 = new Dozierender("Prof. Dr. Schmidt", "Elektrotechnik", 102);
        
        
        Vorlesungsstunde vorlesung1 = new Vorlesungsstunde("Einführung in die Programmierung", new Date(), "10:00", "Raum A");
        Vorlesungsstunde vorlesung2 = new Vorlesungsstunde("Elektronik Grundlagen", new Date(), "14:00", "Raum B");
        
        
        Praktikumsstunde praktikum1 = new Praktikumsstunde("Java Programmierung", new Date(), "08:00", "Labor 1", "Übungsaufgaben");
        Praktikumsstunde praktikum2 = new Praktikumsstunde("Schaltkreise simulieren", new Date(), "13:00", "Labor 2", "Praktische Experimente");
        
        
        Lehrveranstaltung lehrveranstaltung = new Lehrveranstaltung("Informatik-Kurs");
        lehrveranstaltung.addStudierender(studierender1);
        lehrveranstaltung.addStudierender(studierender2);
        lehrveranstaltung.addDozierender(dozierender1);
        lehrveranstaltung.addDozierender(dozierender2);
        lehrveranstaltung.addVorlesungsstunde(vorlesung1);
        lehrveranstaltung.addVorlesungsstunde(vorlesung2);
        lehrveranstaltung.addPraktikumsstunde(praktikum1);
        lehrveranstaltung.addPraktikumsstunde(praktikum2);
        
        
        lehrveranstaltung.anzeigenVeranstaltungsdetails();
    }
}


