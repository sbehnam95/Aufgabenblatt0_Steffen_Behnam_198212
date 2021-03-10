package de.hhn.ai.prog2.blatt1.abstrakteKlassen;

/**
 * Diese Abstrakte Klasse soll den Umfang und die Fläche von verschiedenen Figuren zurückgeben.
 */
public abstract class Figuren {

    private double xPosition;
    private double yPosition;

    /**
     * Diese Methode liefert die xPosition zurück.
     *
     * @return xPosition
     */
    public double getxPosition() {

        return xPosition;
    }

    /**
     * Diese Methode liefert die yPosition zurück.
     *
     * @return yPosition
     */
    public double getyPosition() {
        return yPosition;
    }

    /**
     * In dieser Methode kann man die xPosition ändern.
     *
     * @param xPosition
     */
    public void setxPosition(double xPosition) {
        this.xPosition = xPosition;
    }

    /**
     * In dieser Methode kann man die yPosition ändern.
     *
     * @param yPosition
     */
    public void setyPosition(double yPosition) {
        this.yPosition = yPosition;
    }

    /**
     * Diese Abstrakte Methode soll den Umfang der Figuren zurückliefern.
     *
     * @return
     */
    public abstract double getUmfang();

    /**
     * Diese Abstrakte Methode soll den Flächeninhalt der Figuren zurückliefern.
     */
    public abstract double getFlächeninhalt();
}
