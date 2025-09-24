// AUFGABE 1: Vererbung & Abstrakte Klassen --------------------

// Implementiere die Klasse Kreditkarte, die von Zahlungsmethode erbt
class Kreditkarte extends Zahlungsmethode {
    private String kartennummer;

    public Kreditkarte(String inhaber, String kartennummer) {
        super(inhaber);
        this.kartennummer = kartennummer;
    }

// Implementiere die nötige Methode aus der Oberklasse.
// Sie soll ausgeben:
// "Zahlung von [betrag]€ mit Kreditkarte [kartennummer]
//durchgeführt."
// HIER CODE EINFÜGEN (1a):
// Spezifische Methode nur für Kreditkarten
public void pruefeKartenlimit() {
    System.out.println("Kartenlimit für " + this.kartennummer + " ist ausreichend.");
}

    @Override
    public void fuehreZahlungDurch(double betrag) {
        System.out.println("Zahlung von " + betrag + "€ mit Kreditkarte" + this.kartennummer);
    }
}
