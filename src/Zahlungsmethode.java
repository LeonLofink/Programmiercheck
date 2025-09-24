// Abstrakte Basisklasse für alle Zahlungsmethoden
abstract class Zahlungsmethode {
    protected String inhaber;

    public Zahlungsmethode(String inhaber) {
        this.inhaber = inhaber;
    }

    // Abstrakte Methode, die von Unterklassen implementiert werden muss
    public abstract void fuehreZahlungDurch(double betrag);
}
