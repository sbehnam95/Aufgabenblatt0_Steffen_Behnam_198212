package de.hhn.ai.prog2.blatt1.abstrakteKlassen;

/**
 * Diese Klasse erbt von der Klasse Figuren. Hier wird der Umfang und der Flächeninhalt der Kreise berechnet.
 */
public class Kreis extends Figuren{

    private double radius;

    /**
     * In diesem Konstruktor wird einem Kreis-Objekt einen radius zugewiesen.
     *
     * @param radius
     */
    public Kreis(double radius) {

        this.radius = radius;

    }

    /**
     * Diese Methode lässt den Radius eines Kreises ändern.
     *
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Diese Methode wurde von der Abstrakten Superklasse Figuren überschrieben und berechnet den Umfang eines Kreises.
     *
     * @return umfang
     */
    @Override
    public double getUmfang() {
        return 2 * Math.PI * radius;
    }

    /**
     * Diese Methode wurde von der Abstrakten Superklasse Figuren überschrieben und berechnet den Flächeninhalt
     * eines Kreises.
     *
     * @return flächeninhalt
     */
    @Override
    public double getFlächeninhalt() {
        return Math.PI * Math.pow(radius, 2);
    }
}
