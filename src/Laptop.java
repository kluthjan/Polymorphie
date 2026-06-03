/**
 * HAUPTAUFGABE 2 – Schritt 2
 * 
 * Laptop erbt von Geraet (extends Geraet).
 * Ein Laptop IST ein Gerät, hat aber zusätzlich einen RAM-Wert.
 * 
 * KONZEPT super(...):
 * Im Konstruktor muss "super(...)" als erstes aufgerufen werden.
 * Das ruft den Konstruktor der Oberklasse (Geraet) auf und
 * befüllt die Attribute inventarnummer, hersteller, modell, standort, status.
 * 
 * KONZEPT super.datenAusgeben():
 * In der überschriebenen Methode rufen wir zuerst die Methode
 * der Oberklasse auf (gibt Basisinfos aus), dann ergänzen wir
 * die Laptop-spezifischen Infos (RAM).
 */
public class Laptop extends Geraet {

    // Laptop-spezifisches Attribut: RAM in Gigabyte
    private int ramGb;

    /**
     * Konstruktor des Laptops.
     * Nimmt alle Geraet-Parameter PLUS den RAM-Wert entgegen.
     */
    public Laptop(String inventarnummer, String hersteller, String modell, String standort, String status, int ramGb) {
        // Ruft den Konstruktor von Geraet auf mit den ersten 5 Parametern
        super(inventarnummer, hersteller, modell, standort, status);
        // Speichert den Laptop-eigenen Wert
        this.ramGb = ramGb;
    }

    /**
     * Überschreibt datenAusgeben() aus Geraet.
     * 
     * Ablauf:
     * 1. super.datenAusgeben() → gibt Inventarnummer, Hersteller usw. aus
     * 2. Danach wird der RAM zusätzlich ausgegeben
     */
    @Override
    public void datenAusgeben() {
        super.datenAusgeben();  // Allgemeine Gerätedaten von Geraet ausgeben
        System.out.println("RAM:            " + ramGb + " GB");  // Laptop-spezifisch
    }

    /**
     * ZUSATZAUFGABE 2: Spezielle Methode, die NUR im Laptop existiert.
     * Diese Methode ist NICHT in Geraet definiert!
     * Sie ist nur über eine Laptop-Variable oder mit instanceof+Casting erreichbar.
     */
    public void akkuStatusAusgeben() {
        System.out.println("Akku wird geprüft.");
    }
}
