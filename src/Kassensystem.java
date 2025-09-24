
// AUFGABE 2: Überladen von Methoden --------------------

class Kassensystem {
    // Diese Methode existiert bereits.
    public void druckeBeleg(String warenkorbID) {
        System.out.println("Einfacher Beleg für Warenkorb " + warenkorbID + " gedruckt.");
    }
    public void druckeBeleg(String warenkorbID,double gesamtsumme) {
        System.out.println("Detaillierter Beleg für Warenkorb " + warenkorbID + "über " + gesamtsumme + "€ gedruckt.");
    }

    // Überlade die Methode druckeBeleg, sodass sie zusätzlich einen
    // double-Wert
    // für die Gesamtsumme entgegennimmt.
    // Die Methode soll ausgeben: "Detaillierter Beleg für Warenkorb
    //[warenkorbID]
    // über [gesamtsumme]€ gedruckt."
    // HIER CODE EINFÜGEN (2):

}

