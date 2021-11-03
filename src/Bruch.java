public class Bruch {
    private int numerator; // Zähler
    private int denominator; // Nenner

    public Bruch(int numerator, int denominator) {
        // TODO: Setzen Sie die Attribute entsprechend
this.numerator = numerator;
this.denominator = denominator;
    }

    public int getNumerator() {

        return numerator;
    }

    public int getDenominator() {

        return denominator;
    }

    public double toDecimal() {
        // TODO: Die Methode soll den Dezimalwert zum Bruch retournieren
        // Achtung: Ganzzahldivision!
//double toDecimal = numerator / denominator;
if (this.denominator != 0) {
    double toDecimal = numerator / denominator;

        return toDecimal;
}
else {return 0;
}
    }

    public String print() {
        // TODO: Die Methode soll den Bruch als Text retournieren z.B.: "5 / 7"
        return this.numerator + "/" + this.denominator;
    }

    public Bruch multiplicate(Bruch b2) {
        /* TODO:
        *  Erstellen Sie für das Ergebnis eine neue Bruch-Variable
        *   => Übergeben Sie im Konstruktur für numerator den
        *       eigenen numerator multipliziert mit b2.getNumerator()
        *   => Selbige auch für denominator
        *  Retournieren Sie ihre neue Bruch-Variable
        * */
        Bruch neuerBruch = new Bruch(this.numerator * b2.getNumerator(), this.denominator * b2.getDenominator());
return neuerBruch;
    }

    public Bruch multiplicate(Bruch b2, Bruch b3) {
        // TODO: Multiplizieren Sie den eigenen Bruch mit b2 und b3
       Bruch neuerBruch = new Bruch(this.numerator * b2.getNumerator() * b3.getNumerator(), this.denominator * b2.getDenominator()*b3.getDenominator());
        return neuerBruch;
    }
}
