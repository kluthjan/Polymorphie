/**
 * HAUPTAUFGABE 1 – Schritt 1
 * 
 * Das ist die Oberklasse "Tier".
 * Sie dient als allgemeiner Bauplan für alle Tierarten.
 * 
 * KONZEPT VERERBUNG:
 * Hund, Katze und Kuh "erben" diese Klasse mit "extends Tier".
 * Das bedeutet: Sie bekommen automatisch alle Methoden von Tier.
 * Aber sie können diese Methoden auch überschreiben (@Override).
 */
public class Tier {

    /**
     * Diese Methode gibt ein allgemeines Geräusch aus.
     * Sie wird von den Unterklassen (Hund, Katze, Kuh) überschrieben.
     */
    public void geraeuschMachen() {
        System.out.println("Das Tier macht ein Geräusch.");
    }
}
