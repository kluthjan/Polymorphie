/**
 * ZUSATZAUFGABE 3 – Abstrakte Oberklasse
 * 
 * KONZEPT "abstract":
 * Eine abstrakte Klasse ist eine Klasse, von der man KEIN Objekt direkt
 * erzeugen kann. Sie dient nur als Vorlage (Bauplan) für Unterklassen.
 * 
 * Versuch: new Ticket() → FEHLER! Geht nicht!
 * Erlaubt: new HardwareTicket() → Geht, weil HardwareTicket konkret ist.
 * 
 * KONZEPT abstrakte Methode:
 * public abstract void datenAusgeben();
 * → Diese Methode hat KEINEN Methodenrumpf (keine geschweifte Klammer)!
 * → Alle Unterklassen MÜSSEN diese Methode implementieren (überschreiben).
 * → Falls eine Unterklasse das nicht tut, gibt es einen Compilerfehler.
 * 
 * ZUSATZAUFGABE 4: Ticket-System
 * Ticket ist die abstrakte Oberklasse für alle Ticketarten.
 * Gemeinsame Attribute: ticketnummer, titel, beschreibung, status
 */
public abstract class Ticket {

    // ===== GEMEINSAME ATTRIBUTE ALLER TICKETS =====
    protected String ticketnummer;   // z.B. "T-1001"
    protected String titel;          // z.B. "Netzwerk ausgefallen"
    protected String beschreibung;   // z.B. "WLAN in Raum 101 nicht verfügbar"
    protected String status;         // z.B. "offen", "in Bearbeitung", "geschlossen"

    /**
     * Konstruktor der abstrakten Klasse.
     * Wird von den Unterklassen über super(...) aufgerufen.
     * 
     * HINWEIS: Auch abstrakte Klassen können Konstruktoren haben!
     * Sie können nur nicht mit "new Ticket(...)" direkt aufgerufen werden.
     */
    public Ticket(String ticketnummer, String titel, String beschreibung, String status) {
        this.ticketnummer = ticketnummer;
        this.titel = titel;
        this.beschreibung = beschreibung;
        this.status = status;
    }

    // ===== GETTER =====
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * ABSTRAKTE METHODE: datenAusgeben()
     * 
     * Diese Methode hat keinen Rumpf (keine {}), weil jede Unterklasse
     * selbst entscheiden muss, was ausgegeben wird.
     * 
     * Jede Unterklasse MUSS diese Methode mit @Override implementieren!
     */
    public abstract void datenAusgeben();

    /**
     * ABSTRAKTE METHODE: prioritaetBerechnen()
     * 
     * Jede Ticketart berechnet die Priorität anders:
     * - NetzwerkTicket mit vielen Benutzern → "Hoch"
     * - HardwareTicket → "Mittel"
     * - SoftwareTicket → "Niedrig"
     * 
     * Rückgabewert: String ("Hoch", "Mittel" oder "Niedrig")
     */
    public abstract String prioritaetBerechnen();

    /**
     * KONZEPT basisDatenAusgeben():
     * 
     * Wenn datenAusgeben() abstrakt ist (kein Rumpf), können wir die
     * gemeinsamen Daten nicht mehr dort ausgeben.
     * Deshalb gibt es diese Hilfsmethode, die von den Unterklassen
     * im @Override aufgerufen werden kann: super.basisDatenAusgeben()
     * 
     * ACHTUNG: Diese Methode ist NICHT abstrakt – sie hat einen Rumpf!
     */
    public void basisDatenAusgeben() {
        System.out.println("Ticketnummer: " + ticketnummer);
        System.out.println("Titel:        " + titel);
        System.out.println("Beschreibung: " + beschreibung);
        System.out.println("Status:       " + status);
    }
}
