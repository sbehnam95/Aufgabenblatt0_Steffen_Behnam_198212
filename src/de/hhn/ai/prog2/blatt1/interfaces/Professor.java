package de.hhn.ai.prog2.blatt1.interfaces;

/**
 * Diese Klasse erbt von der Klasse Person und implementiert das Interface Dozent.
 */
public class Professor extends Person implements Dozent {
    private String fachgebiet;

    /**
     * Dieser Konstruktor gibt Professoren-Objekte einen Vornamen, Nachnamen und ein Fachgebiet.
     *
     * @param vorname
     * @param nachname
     * @param fachgebiet
     */
    public Professor(String vorname, String nachname, String fachgebiet) {
        super(vorname, nachname);
        this.fachgebiet = fachgebiet;
    }

    /**
     * Diese Methode liefert das Fachgebiet eines Professors zurück.
     *
     * @return fachgebiet
     */
    public String getFachgebiet() {
        return fachgebiet;
    }
}
