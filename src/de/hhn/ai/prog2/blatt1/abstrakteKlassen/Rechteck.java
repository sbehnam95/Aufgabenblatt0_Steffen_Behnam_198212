package de.hhn.ai.prog2.blatt1.abstrakteKlassen;

/**
 * Diese Klasse erbt von der Abstrakten Superklasse Figuren und berechnet den Flächeninhalt und den Umgfang eines Rechtecks.
 */
public class Rechteck extends Figuren {

    private double länge;
    private double breite;

    /**
     * In diesem Konstruktor wird einem Rechteck-Objekt die länge und die breite zugewiesen.
     *
     * @param länge
     * @param breite
     */
    public Rechteck(double länge, double breite) {

        this.breite = breite;
        this.länge = länge;

    }

    /**
     * Diese Methode lässt die Breite eines Rechtecks ändern.
     *
     * @param breite
     */
    public void setBreite(double breite) {
        this.breite = breite;
    }

    /**
     * Diese Methode lässt die länge eines Rechtecks ändern.
     *
     * @param länge
     */
    public void setLänge(double länge) {
        this.länge = länge;
    }

    /**
     * Diese Methode wurde von der Abstrakten Superklasse überschrieben und berechnet den Umfang eines Rechtecks.
     *
     * @return umfang
     */
    @Override
    public double getUmfang() {

        return (2 * länge + 2 * breite);
    }

    /**
     * Diese Methode wurde von der Abstrakten Superklasse überschrieben und berechnet den Flächeninhalt eines Rechtecks.
     *
     * @return flächeninhalt
     */
    @Override
    public double getFlächeninhalt() {
        return länge * breite;
    }
}
