/**
 * ========================================================
 *  JAVA OOP MODUL 4 – POLYMORPHIE
 *  Alle Haupt- und Zusatzaufgaben in einer Main.java
 * ========================================================
 * 
 * Diese Datei enthält:
 *   - Hauptaufgabe 1: Tiere (Polymorphie mit einfachen Klassen)
 *   - Hauptaufgabe 2: IT-Geräte (polymorphe Variablen)
 *   - Hauptaufgabe 3: Array und Schleife, Status auswerten
 *   - Zusatzaufgabe 1: Methode mit Oberklassen-Parameter
 *   - Zusatzaufgabe 2: instanceof und Casting
 *   - Zusatzaufgabe 4: Ticket-System
 */
public class Main {

    public static void main(String[] args) {

        // ============================================================
        // HAUPTAUFGABE 1: Polymorphie mit einfachen Klassen (Tiere)
        // ============================================================
        System.out.println("============================================================");
        System.out.println("  HAUPTAUFGABE 1: Tiere");
        System.out.println("============================================================");

        // STATISCHER TYP: Tier  (steht links bei der Variable)
        // DYNAMISCHER TYP: Hund / Katze / Kuh  (steht rechts bei new)
        Tier tier1 = new Hund();   // statisch: Tier, dynamisch: Hund
        Tier tier2 = new Katze();  // statisch: Tier, dynamisch: Katze
        Tier tier3 = new Kuh();    // statisch: Tier, dynamisch: Kuh

        tier1.geraeuschMachen();  // Java führt Hund.geraeuschMachen() aus!
        tier2.geraeuschMachen();  // Java führt Katze.geraeuschMachen() aus!
        tier3.geraeuschMachen();  // Java führt Kuh.geraeuschMachen() aus!

        // ERKLÄRUNG – SCHRITT 6:
        // Alle Variablen haben den Typ Tier (statischer Typ).
        // Tatsächlich sind es aber Hund, Katze und Kuh (dynamischer Typ).
        // Java entscheidet zur LAUFZEIT, welche Methode aufgerufen wird.
        // Das nennt man "dynamisches Binden" oder "Late Binding".
        // Deshalb wird jeweils die passende überschriebene Methode ausgeführt.
        // Das ist Polymorphie!

        System.out.println();

        // ============================================================
        // HAUPTAUFGABE 2: IT-Geräte mit polymorphen Variablen
        // ============================================================
        System.out.println("============================================================");
        System.out.println("  HAUPTAUFGABE 2: IT-Geräte (einzelne Variablen)");
        System.out.println("============================================================");

        // Statischer Typ: Geraet
        // Dynamischer Typ: Laptop / Drucker / Switch
        Geraet geraet1 = new Laptop(
                "IT-1001",
                "Lenovo",
                "ThinkPad T14",
                "Raum 101",
                "aktiv",
                16
        );

        Geraet geraet2 = new Drucker(
                "IT-2001",
                "HP",
                "LaserJet Pro",
                "Raum 204",
                "aktiv",
                "Laserdruck"
        );

        Geraet geraet3 = new Switch(
                "IT-3001",
                "Cisco",
                "CBS350",
                "Serverraum",
                "wartung",
                24,
                true
        );

        geraet1.datenAusgeben();
        System.out.println();

        geraet2.datenAusgeben();
        System.out.println();

        geraet3.datenAusgeben();
        System.out.println();

        // ERKLÄRUNG – SCHRITT 6:
        // Warum wird bei geraet1 die Laptop-Ausgabe verwendet?
        //   → geraet1 wurde mit "new Laptop(...)" erstellt.
        //     Der dynamische Typ ist Laptop.
        //     Java führt daher Laptop.datenAusgeben() aus.
        //
        // Warum wird bei geraet2 die Drucker-Ausgabe verwendet?
        //   → geraet2 wurde mit "new Drucker(...)" erstellt.
        //     Der dynamische Typ ist Drucker.
        //     Java führt daher Drucker.datenAusgeben() aus.
        //
        // Warum wird bei geraet3 die Switch-Ausgabe verwendet?
        //   → geraet3 wurde mit "new Switch(...)" erstellt.
        //     Der dynamische Typ ist Switch.
        //     Java führt daher Switch.datenAusgeben() aus.

        // ============================================================
        // HAUPTAUFGABE 3: Polymorphes Array mit Schleife
        // ============================================================
        System.out.println("============================================================");
        System.out.println("  HAUPTAUFGABE 3: Geraet-Array mit Schleife");
        System.out.println("============================================================");

        // Array der Oberklasse kann Objekte aller Unterklassen speichern!
        // Warum kann ein Laptop in einem Geraet[] gespeichert werden?
        //   → Laptop erbt von Geraet ("extends Geraet").
        //     Ein Laptop IST ein Geraet. Deshalb passt er in ein Geraet[].
        //     Das ist wie: Ein Hund IST ein Tier → passt in ein Tier[].
        //
        // Warum wird trotzdem die Laptop-Version von datenAusgeben() ausgeführt?
        //   → Java schaut zur Laufzeit auf das tatsächliche Objekt (dynamischer Typ).
        //     Das Objekt ist ein Laptop → Laptop.datenAusgeben() wird aufgerufen.
        //     Der statische Typ (Geraet) spielt dabei keine Rolle!

        Geraet[] geraete = new Geraet[6];

        geraete[0] = new Laptop("IT-1001", "Lenovo",  "ThinkPad T14",   "Raum 101",   "aktiv",   16);
        geraete[1] = new Laptop("IT-1002", "Dell",    "Latitude 5440",  "Raum 102",   "aktiv",   32);
        geraete[2] = new Drucker("IT-2001", "HP",     "LaserJet Pro",   "Raum 204",   "aktiv",   "Laserdruck");
        geraete[3] = new Drucker("IT-2002", "Canon",  "Pixma G3570",    "Raum 205",   "offline", "Tintenstrahl");
        geraete[4] = new Switch("IT-3001",  "Cisco",  "CBS350",         "Serverraum", "wartung", 24,  true);
        geraete[5] = new Switch("IT-3002",  "TP-Link","TL-SG108",       "Raum 110",   "aktiv",   8,   false);

        // SCHRITT 2: Alle Geräte mit Schleife ausgeben
        for (int i = 0; i < geraete.length; i++) {
            System.out.println("--- Gerät " + (i + 1) + " ---");
            geraete[i].datenAusgeben();  // Immer gleicher Aufruf, unterschiedliche Ausgabe!
            System.out.println();
        }

        // SCHRITT 3: Status auswerten
        int aktiveGeraete  = 0;
        int offlineGeraete = 0;
        int wartungGeraete = 0;

        for (int i = 0; i < geraete.length; i++) {
            String status = geraete[i].getStatus();  // Getter verwenden!
            if (status.equals("aktiv")) {
                aktiveGeraete++;
            } else if (status.equals("offline")) {
                offlineGeraete++;
            } else if (status.equals("wartung")) {
                wartungGeraete++;
            }
        }

        System.out.println("--- Statusauswertung ---");
        System.out.println("Aktive Geräte:  " + aktiveGeraete);
        System.out.println("Offline Geräte: " + offlineGeraete);
        System.out.println("Wartung:        " + wartungGeraete);
        System.out.println();

        // SCHRITT 4: Status eines Geräts ändern
        System.out.println("--- Status ändern ---");
        System.out.println("Drucker Canon (IT-2002) wird auf 'aktiv' gesetzt...");
        geraete[3].setStatus("aktiv");  // setStatus() aus der Oberklasse Geraet

        // Erneute Auswertung nach Status-Änderung
        aktiveGeraete  = 0;
        offlineGeraete = 0;
        wartungGeraete = 0;

        for (int i = 0; i < geraete.length; i++) {
            String status = geraete[i].getStatus();
            if (status.equals("aktiv")) {
                aktiveGeraete++;
            } else if (status.equals("offline")) {
                offlineGeraete++;
            } else if (status.equals("wartung")) {
                wartungGeraete++;
            }
        }

        System.out.println("--- Neue Statusauswertung ---");
        System.out.println("Aktive Geräte:  " + aktiveGeraete);
        System.out.println("Offline Geräte: " + offlineGeraete);
        System.out.println("Wartung:        " + wartungGeraete);
        System.out.println();

        // ============================================================
        // ZUSATZAUFGABE 1: Methode mit Oberklassen-Parameter
        // ============================================================
        System.out.println("============================================================");
        System.out.println("  ZUSATZAUFGABE 1: Methode mit Geraet-Parameter");
        System.out.println("============================================================");

        // Die Methode geraetAnzeigen() nimmt einen Geraet-Parameter.
        // Man kann ihr Laptop, Drucker UND Switch übergeben → Polymorphie!
        geraetAnzeigen(new Laptop("IT-9001", "Apple", "MacBook Air", "Büro", "aktiv", 8));
        System.out.println();
        geraetAnzeigen(new Drucker("IT-9002", "Brother", "HL-L3270CDW", "Büro", "aktiv", "Laserdruck"));
        System.out.println();
        geraetAnzeigen(new Switch("IT-9003", "Netgear", "GS308", "Keller", "aktiv", 8, false));
        System.out.println();

        // ============================================================
        // ZUSATZAUFGABE 2: instanceof und Casting
        // ============================================================
        System.out.println("============================================================");
        System.out.println("  ZUSATZAUFGABE 2: instanceof und Casting");
        System.out.println("============================================================");

        // Statischer Typ: Geraet → Man kann NUR Methoden von Geraet aufrufen!
        Geraet geraetFuerTest = new Laptop("IT-5001", "HP", "EliteBook", "Raum 3", "aktiv", 16);

        // FALSCH (Compilerfehler!): geraetFuerTest.akkuStatusAusgeben();
        // → akkuStatusAusgeben() ist NICHT in Geraet definiert!
        // → Java kennt die Methode nicht, weil der statische Typ Geraet ist.

        // RICHTIG: Erst prüfen ob es ein Laptop ist, dann casten:
        if (geraetFuerTest instanceof Laptop) {
            // CASTING: Wir "wandeln" den Geraet-Typ in einen Laptop-Typ um
            Laptop laptop = (Laptop) geraetFuerTest;
            laptop.akkuStatusAusgeben();  // Jetzt geht es!
        }

        // Warum brauchen wir hier instanceof und Casting?
        //   → geraetFuerTest hat den statischen Typ "Geraet".
        //     Java erlaubt nur Methoden aufzurufen, die in Geraet bekannt sind.
        //     akkuStatusAusgeben() ist aber nur in Laptop definiert!
        //     Mit "instanceof" prüfen wir SICHER, ob das Objekt wirklich ein Laptop ist.
        //     Mit "(Laptop) geraetFuerTest" sagen wir Java: "Behandle dieses Objekt als Laptop!"
        //     Das nennt man DOWNCASTING (von Oberklasse zu Unterklasse).
        System.out.println();

        // ============================================================
        // ZUSATZAUFGABE 4: Ticket-System
        // ============================================================
        System.out.println("============================================================");
        System.out.println("  ZUSATZAUFGABE 4: Ticket-System mit Polymorphie");
        System.out.println("============================================================");

        // Array der abstrakten Klasse Ticket
        // Alle Unterklassen passen rein (HardwareTicket, SoftwareTicket, NetzwerkTicket)
        Ticket[] tickets = new Ticket[6];

        tickets[0] = new NetzwerkTicket("T-1001", "WLAN ausgefallen",         "WLAN in Raum 101 nicht verfügbar",    "offen",          "WLAN",   25);
        tickets[1] = new NetzwerkTicket("T-1002", "VPN trennt sich",           "VPN-Verbindung bricht ab",            "in Bearbeitung", "VPN",     5);
        tickets[2] = new HardwareTicket("T-2001", "Laptop startet nicht",      "Gerät bootet nicht mehr",             "offen",          "Laptop",  "Raum 202");
        tickets[3] = new HardwareTicket("T-2002", "Drucker kein Papiereinzug", "Drucker zieht kein Papier ein",       "offen",          "Drucker", "Raum 103");
        tickets[4] = new SoftwareTicket("T-3001", "Excel stürzt ab",           "Excel schließt sich ohne Fehlermeldung", "offen",       "Microsoft Excel", "2021");
        tickets[5] = new SoftwareTicket("T-3002", "Chrome lädt nicht",         "Browser startet nicht",               "geschlossen",    "Google Chrome",   "120.0");

        // Alle Tickets ausgeben mit Schleife
        for (int i = 0; i < tickets.length; i++) {
            System.out.println("--- Ticket " + (i + 1) + " ---");
            tickets[i].datenAusgeben();  // Polymorphie: Jedes Ticket gibt seine eigenen Daten aus
            System.out.println();
        }

        // Prioritäten zählen
        int anzahlHoch    = 0;
        int anzahlMittel  = 0;
        int anzahlNiedrig = 0;

        for (int i = 0; i < tickets.length; i++) {
            String prioritaet = tickets[i].prioritaetBerechnen();  // Jede Klasse rechnet selbst!
            if (prioritaet.equals("Hoch")) {
                anzahlHoch++;
            } else if (prioritaet.equals("Mittel")) {
                anzahlMittel++;
            } else if (prioritaet.equals("Niedrig")) {
                anzahlNiedrig++;
            }
        }

        System.out.println("--- Prioritäts-Auswertung ---");
        System.out.println("Priorität Hoch:    " + anzahlHoch);
        System.out.println("Priorität Mittel:  " + anzahlMittel);
        System.out.println("Priorität Niedrig: " + anzahlNiedrig);
    }

    // ============================================================
    // ZUSATZAUFGABE 1: Statische Methode mit Oberklassen-Parameter
    // ============================================================
    /**
     * Diese Methode nimmt JEDEN Geraet-Typ entgegen.
     * Man kann ihr Laptop, Drucker oder Switch übergeben.
     * 
     * KONZEPT: Polymorphie bei Methoden-Parametern
     * Der Parameter-Typ ist Geraet (allgemein).
     * Beim Aufruf gibt man aber konkrete Objekte (Laptop, Drucker, Switch) mit.
     * Java führt dann die passende datenAusgeben()-Methode aus.
     * 
     * VORTEIL: Eine Methode für alle Gerätetypen statt drei einzelner Methoden!
     */
    public static void geraetAnzeigen(Geraet geraet) {
        System.out.println("=== Gerät wird angezeigt ===");
        geraet.datenAusgeben();  // Polymorphie: richtige Methode je nach Objekt
    }
}
