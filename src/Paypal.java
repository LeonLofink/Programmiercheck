// Implementiere die Klasse Paypal, die von Zahlungsmethode erbt
class Paypal extends Zahlungsmethode {
    private String email;

    public Paypal(String inhaber, String email) {
        super(inhaber);
        this.email = email;
    }

    @Override
    public void fuehreZahlungDurch(double betrag) {
        System.out.println("Zahlung von [betrag]€ über PayPal-Konto [email] durchgeführt.");
    }

    // Implementiere die nötige Methode der Oberklasse.
    // Sie soll ausgeben: "Zahlung von [betrag]€ über PayPal-Konto
    //[email] durchgeführt."
    // HIER CODE EINFÜGEN (1b):

}

