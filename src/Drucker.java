/**
 * HAUPTAUFGABE 2 – Schritt 3
 * 
 * Drucker erbt von Geraet (extends Geraet).
 * Ein Drucker IST ein Gerät, hat aber zusätzlich ein Druckverfahren.
 * 
 * Beispiele für Druckverfahren: "Laserdruck", "Tintenstrahl", "Thermodruck"
 */
public class Drucker extends Geraet {

    // Drucker-spezifisches Attribut: Art des Druckverfahrens
    private String druckverfahren;

    /**
     * Konstruktor des Druckers.
     * Nimmt alle Geraet-Parameter PLUS das Druckverfahren entgegen.
     */
    public Drucker(String inventarnummer, String hersteller, String modell, String standort, String status, String druckverfahren) {
        // Ruft den Konstruktor von Geraet auf
        super(inventarnummer, hersteller, modell, standort, status);
        // Speichert das Drucker-eigene Druckverfahren
        this.druckverfahren = druckverfahren;
    }

    /**
     * Überschreibt datenAusgeben() aus Geraet.
     * 
     * Ablauf:
     * 1. super.datenAusgeben() → gibt allgemeine Gerätedaten aus
     * 2. Danach wird das Druckverfahren zusätzlich ausgegeben
     */
    @Override
    public void datenAusgeben() {
        super.datenAusgeben();  // Allgemeine Gerätedaten ausgeben
        System.out.println("Druckverfahren: " + druckverfahren);  // Drucker-spezifisch
    }
}
