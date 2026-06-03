/**
 * HAUPTAUFGABE 2 – Schritt 4
 * 
 * Switch erbt von Geraet (extends Geraet).
 * Ein Switch IST ein Gerät (Netzwerkgerät), hat aber zusätzlich:
 * - Anzahl der Netzwerkports (z.B. 8, 24, 48)
 * - Ob er "managed" ist (= ob er konfigurierbar ist)
 * 
 * HINWEIS: "Switch" ist eigentlich ein Java-Schlüsselwort (switch-Anweisung),
 * aber als Klassenname (großgeschrieben) ist es erlaubt.
 * 
 * KONZEPT boolean:
 * "managed" ist ein boolean = nur true oder false.
 * true = managed (konfigurierbar, teurer)
 * false = unmanaged (einfach, günstiger)
 */
public class Switch extends Geraet {

    // Switch-spezifische Attribute
    private int anzahlPorts;  // Anzahl der Netzwerkanschlüsse
    private boolean managed;   // true = managed, false = unmanaged

    /**
     * Konstruktor des Switches.
     * Nimmt alle Geraet-Parameter PLUS anzahlPorts und managed entgegen.
     */
    public Switch(String inventarnummer, String hersteller, String modell, String standort, String status, int anzahlPorts, boolean managed) {
        // Ruft den Konstruktor von Geraet auf
        super(inventarnummer, hersteller, modell, standort, status);
        // Speichert die Switch-eigenen Werte
        this.anzahlPorts = anzahlPorts;
        this.managed = managed;
    }

    /**
     * Überschreibt datenAusgeben() aus Geraet.
     * 
     * Ablauf:
     * 1. super.datenAusgeben() → allgemeine Gerätedaten
     * 2. Anzahl der Ports
     * 3. Managed-Status (true/false → "Ja"/"Nein" für bessere Lesbarkeit)
     */
    @Override
    public void datenAusgeben() {
        super.datenAusgeben();  // Allgemeine Gerätedaten ausgeben
        System.out.println("Anzahl Ports:   " + anzahlPorts);
        // Ternärer Operator: managed ? "Ja" : "Nein"
        // Wenn managed true ist → "Ja", sonst → "Nein"
        System.out.println("Managed:        " + (managed ? "Ja" : "Nein"));
    }
}
