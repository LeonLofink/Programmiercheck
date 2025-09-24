public class Zahlungsabwicklung {

    public static void main(String[] args) {
        Kreditkarte kreditkarte;
        Kassensystem kasse = new Kassensystem();
        kasse.druckeBeleg("WK-123");
        kasse.druckeBeleg("WK-123", 99.95);

        System.out.println("\n--- Zahlungsarten werden vorbereitet ");

        Zahlungsmethode[] zahlungsmethoden;
            zahlungsmethoden = new Zahlungsmethode[2];
            zahlungsmethoden[0] = new Paypal("Mark","Mark@gmail.com");
            zahlungsmethoden[1] = new Kreditkarte("Elias","DE-3110");

        System.out.println("\n--- Polymorphie-Test: Zahlungen durchführen ---");


                        // Schreibe eine Schleife, die durch das 'methoden'-Array iteriert und für jede Zahlungsmethode die Methode fuehreZahlungDurch(99.95) aufruft.
                        // HIER CODE EINFÜGEN (3b - Polymorphie):
        for (int i = 0; i < zahlungsmethoden.length; i++){
            zahlungsmethoden[i].fuehreZahlungDurch(99.95);
        }
                        System.out.println("\n--- Typecast-Test: Spezifische Aktionen ---");

                                // Schreibe eine weitere Schleife durch das 'methoden'-Array.
                                // Prüfe mit 'instanceof', ob das aktuelle Objekt eine
                                //'Kreditkarte' ist.
                                // Wenn ja, führe einen Typecast durch und rufe die Methode
                                //pruefeKartenlimit() auf.
        for ( int i = 0; i < zahlungsmethoden.length; i++){

            if (zahlungsmethoden[i] instanceof Kreditkarte){
                ((Kreditkarte)zahlungsmethoden[i]).pruefeKartenlimit();
            }
        }
    }
}
