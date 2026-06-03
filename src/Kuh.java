/**
 * HAUPTAUFGABE 1 – Schritt 4
 * 
 * Kuh erbt von Tier (extends Tier).
 * Sie überschreibt geraeuschMachen() mit ihrer eigenen Ausgabe.
 */
public class Kuh extends Tier {

    /**
     * Überschreibt die Methode aus Tier.
     * Die Kuh muht – jedes Tier hat sein eigenes Geräusch!
     */
    @Override
    public void geraeuschMachen() {
        System.out.println("Die Kuh muht.");
    }
}
