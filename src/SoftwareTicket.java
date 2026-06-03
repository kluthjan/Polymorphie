/**
 * ZUSATZAUFGABE 4 – Ticket-Unterklasse: SoftwareTicket
 * 
 * Beispiel: Absturz von Excel, Outlook öffnet sich nicht, Druckertreiber fehlt.
 * 
 * Zusätzliche Attribute:
 * - softwareName: z.B. "Microsoft Excel", "Chrome"
 * - version:      z.B. "2021", "108.0"
 * 
 * PRIORITÄT-LOGIK:
 * Software-Probleme sind meistens lösbar ohne Hardware-Tausch → "Niedrig"
 */
public class SoftwareTicket extends Ticket {

    // SoftwareTicket-spezifische Attribute
    private String softwareName;  // z.B. "Microsoft Excel"
    private String version;       // z.B. "2021"

    /**
     * Konstruktor: Ruft super(...) für gemeinsame Ticket-Daten auf.
     */
    public SoftwareTicket(String ticketnummer, String titel, String beschreibung, String status, String softwareName, String version) {
        super(ticketnummer, titel, beschreibung, status);
        this.softwareName = softwareName;
        this.version = version;
    }

    /**
     * Gibt alle Daten des Software-Tickets aus.
     */
    @Override
    public void datenAusgeben() {
        basisDatenAusgeben();  // Gemeinsame Felder aus Ticket
        System.out.println("Software:     " + softwareName);
        System.out.println("Version:      " + version);
        System.out.println("Priorität:    " + prioritaetBerechnen());
    }

    /**
     * Software-Tickets haben die Priorität "Niedrig".
     * (Kein totaler Ausfall, nur eingeschränkte Funktion)
     */
    @Override
    public String prioritaetBerechnen() {
        return "Niedrig";
    }
}
