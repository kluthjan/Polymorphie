/**
 * HAUPTAUFGABE 1 – Schritt 2
 * 
 * Hund ist eine Unterklasse (Subklasse) von Tier.
 * Mit "extends Tier" sagt man: Hund ist ein Tier.
 * 
 * KONZEPT @Override:
 * @Override bedeutet: Diese Methode existiert schon in der Oberklasse (Tier),
 * aber wir geben ihr hier ein neues Verhalten.
 * Der Hund bellt – nicht das allgemeine "Tier macht Geräusch".
 */
public class Hund extends Tier {

    /**
     * Überschreibt die Methode aus Tier.
     * Jetzt gibt der Hund "Der Hund bellt." aus – nicht "Das Tier macht ein Geräusch."
     */
    @Override
    public void geraeuschMachen() {
        System.out.println("Der Hund bellt.");
    }
}
