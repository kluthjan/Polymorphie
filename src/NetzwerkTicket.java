/**
 * ZUSATZAUFGABE 4 – Ticket-Unterklasse: NetzwerkTicket
 * 
 * Beispiel: WLAN ausgefallen, VPN funktioniert nicht, Drucker nicht erreichbar.
 * 
 * Zusätzliche Attribute:
 * - betroffenesSystem:          z.B. "WLAN", "VPN", "LAN"
 * - anzahlBetroffeneBenutzer:   Wie viele Personen betroffen sind
 * 
 * PRIORITÄT-LOGIK (mit if-else):
 * Wenn mehr als 10 Benutzer betroffen sind → "Hoch"   (viele Leute können nicht arbeiten!)
 * Wenn mehr als 3 Benutzer betroffen sind  → "Mittel" (mehrere Leute betroffen)
 * Sonst                                    → "Niedrig" (einzelne Person)
 */
public class NetzwerkTicket extends Ticket {

    // NetzwerkTicket-spezifische Attribute
    private String betroffenesSystem;          // z.B. "WLAN", "VPN"
    private int anzahlBetroffeneBenutzer;      // Anzahl betroffener Personen

    /**
     * Konstruktor: Ruft super(...) für gemeinsame Ticket-Daten auf.
     */
    public NetzwerkTicket(String ticketnummer, String titel, String beschreibung, String status, String betroffenesSystem, int anzahlBetroffeneBenutzer) {
        super(ticketnummer, titel, beschreibung, status);
        this.betroffenesSystem = betroffenesSystem;
        this.anzahlBetroffeneBenutzer = anzahlBetroffeneBenutzer;
    }

    /**
     * Gibt alle Daten des Netzwerk-Tickets aus.
     */
    @Override
    public void datenAusgeben() {
        basisDatenAusgeben();  // Gemeinsame Felder aus Ticket
        System.out.println("Betr. System: " + betroffenesSystem);
        System.out.println("Betr. Nutzer: " + anzahlBetroffeneBenutzer);
        System.out.println("Priorität:    " + prioritaetBerechnen());
    }

    /**
     * Berechnet die Priorität dynamisch anhand der betroffenen Nutzer.
     * 
     * KONZEPT if-else:
     * Je nach Anzahl betroffener Nutzer wird eine andere Priorität zurückgegeben.
     * Das macht Polymorphie besonders mächtig: Die Logik steckt im Objekt selbst!
     */
    @Override
    public String prioritaetBerechnen() {
        if (anzahlBetroffeneBenutzer > 10) {
            return "Hoch";    // Viele Nutzer betroffen → kritisch!
        } else if (anzahlBetroffeneBenutzer > 3) {
            return "Mittel";  // Einige Nutzer betroffen → bald beheben
        } else {
            return "Niedrig"; // Wenige Nutzer betroffen → kann warten
        }
    }
}
