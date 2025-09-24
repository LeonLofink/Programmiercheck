public class Zahlungsabwicklung {
    public static void main(String[] args) {
        Kassensystem kasse = new Kassensystem();
        kasse.druckeBeleg("WK-123");
        kasse.druckeBeleg("WK-123", 99.95);

        System.out.println("\n--- Zahlungsarten werden vorbereitet
                        ---");

                // Erstelle ein Array vom Typ Zahlungsmethode der Größe 2.
                // Speichere darin ein neues Kreditkarte-Objekt und ein neues
                // Paypal-Objekt.
                // HIER CODE EINFÜGEN (3a - Subtyping):






                System.out.println("\n--- Polymorphie-Test: Zahlungen
                        durchführen ---");


                        // Schreibe eine Schleife, die durch das 'methoden'-Array
                        // iteriert und für
                        // jede Zahlungsmethode die Methode fuehreZahlungDurch(99.95)
                        //aufruft.
                        // HIER CODE EINFÜGEN (3b - Polymorphie):


                        System.out.println("\n--- Typecast-Test: Spezifische Aktionen
                                        ---");

                                // Schreibe eine weitere Schleife durch das 'methoden'-Array.
                                // Prüfe mit 'instanceof', ob das aktuelle Objekt eine
                                //'Kreditkarte' ist.
                                // Wenn ja, führe einen Typecast durch und rufe die Methode
                                //pruefeKartenlimit() auf.

    }
}
