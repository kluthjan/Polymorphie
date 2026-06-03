/**
 * HAUPTAUFGABE 1 – Schritt 3
 * 
 * Katze erbt von Tier (extends Tier).
 * Sie überschreibt geraeuschMachen() mit ihrer eigenen Ausgabe.
 */
public class Katze extends Tier {

    /**
     * Überschreibt die Methode aus Tier.
     * Die Katze miaut – nicht das allgemeine Tiergeräusch.
     */
    @Override
    public void geraeuschMachen() {
        System.out.println("Die Katze miaut.");
    }
}
