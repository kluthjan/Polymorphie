/**
 * HAUPTAUFGABE 2 – Schritt 1
 * 
 * Geraet ist die Oberklasse für alle IT-Geräte.
 * 
 * KONZEPT "private":
 * Die Attribute sind "private" – das bedeutet, sie können nur
 * innerhalb dieser Klasse direkt gelesen oder geändert werden.
 * Von außen braucht man Getter/Setter (z.B. getStatus, setStatus).
 * 
 * WARUM private?
 * Das nennt man "Kapselung" (Encapsulation). Die Daten eines Objekts
 * werden geschützt und nur über definierte Methoden zugänglich gemacht.
 */
public class Geraet {

    // ===== ATTRIBUTE (Eigenschaften des Geräts) =====
    private String inventarnummer;  // z.B. "IT-1001"
    private String hersteller;       // z.B. "Lenovo"
    private String modell;           // z.B. "ThinkPad T14"
    private String standort;         // z.B. "Raum 101"
    private String status;           // z.B. "aktiv", "offline", "wartung"

    // ===== KONSTRUKTOR =====
    /**
     * Konstruktor: Wird aufgerufen wenn man "new Geraet(...)" schreibt.
     * Er befüllt alle Attribute mit den übergebenen Werten.
     * 
     * KONZEPT "this":
     * "this.inventarnummer" = das Attribut DIESER Klasse
     * "inventarnummer" (ohne this) = der Parameter
     */
    public Geraet(String inventarnummer, String hersteller, String modell, String standort, String status) {
        this.inventarnummer = inventarnummer;
        this.hersteller = hersteller;
        this.modell = modell;
        this.standort = standort;
        this.status = status;
    }

    // ===== GETTER UND SETTER =====
    /**
     * Getter: Gibt den aktuellen Status zurück.
     * Wird in Hauptaufgabe 3 verwendet, um den Status auszuwerten.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Setter: Ändert den Status des Geräts.
     * Wird in Hauptaufgabe 3 verwendet, um einen Status zu aktualisieren.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    // ===== METHODEN =====
    /**
     * Gibt alle gemeinsamen Gerätedaten auf der Konsole aus.
     * Diese Methode wird in den Unterklassen mit @Override erweitert.
     * 
     * KONZEPT super.datenAusgeben():
     * Wenn Laptop diese Methode überschreibt, kann es trotzdem mit
     * "super.datenAusgeben()" diese Version hier aufrufen!
     */
    public void datenAusgeben() {
        System.out.println("Inventarnummer: " + inventarnummer);
        System.out.println("Hersteller:     " + hersteller);
        System.out.println("Modell:         " + modell);
        System.out.println("Standort:       " + standort);
        System.out.println("Status:         " + status);
    }
}
