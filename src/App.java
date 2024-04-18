import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Studierender studierender = new Studierender("Max Mustermann", 123456, "Informatik");

        
        Dozierender dozierender = new Dozierender("Prof. Dr. Müller", "Informatik", 101);

        
        studierender.frageStellen(dozierender);
    }
}