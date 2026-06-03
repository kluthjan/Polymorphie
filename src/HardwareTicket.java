/**
 * ZUSATZAUFGABE 4 – Ticket-Unterklasse: HardwareTicket
 * 
 * Beispiel: Defekter Laptop, kaputte Maus, Bildschirm ohne Signal usw.
 * 
 * Zusätzliche Attribute:
 * - geraetetyp: z.B. "Laptop", "Drucker", "Monitor"
 * - standort:   z.B. "Raum 101", "Serverraum"
 * 
 * PRIORITÄT-LOGIK:
 * Ein Hardware-Ausfall am Arbeitsplatz ist immer "Mittel".
 * (Kann aber je nach Gerät angepasst werden)
 */
public class HardwareTicket extends Ticket {

    // HardwareTicket-spezifische Attribute
    private String geraetetyp;  // z.B. "Laptop", "Drucker"
    private String standort;     // z.B. "Raum 101"

    /**
     * Konstruktor: Ruft super(...) auf für die gemeinsamen Ticket-Daten,
     * speichert dann die eigenen Attribute.
     */
    public HardwareTicket(String ticketnummer, String titel, String beschreibung, String status, String geraetetyp, String standort) {
        super(ticketnummer, titel, beschreibung, status);
        this.geraetetyp = geraetetyp;
        this.standort = standort;
    }

    /**
     * Gibt alle Daten des Hardware-Tickets aus.
     * Ruft zuerst basisDatenAusgeben() aus der Oberklasse auf,
     * dann die eigenen spezifischen Felder.
     */
    @Override
    public void datenAusgeben() {
        basisDatenAusgeben();  // Gemeinsame Felder aus Ticket ausgeben
        System.out.println("Gerätetyp:    " + geraetetyp);
        System.out.println("Standort:     " + standort);
        System.out.println("Priorität:    " + prioritaetBerechnen());
    }

    /**
     * Berechnet die Priorität für Hardware-Tickets.
     * Hardware-Tickets haben immer die Priorität "Mittel".
     */
    @Override
    public String prioritaetBerechnen() {
        return "Mittel";
    }
}
