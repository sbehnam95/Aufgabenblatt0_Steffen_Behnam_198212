package de.hhn.ai.prog2.blatt1.interfaces;

/**
 * Diese Klasse erbt von der Klasse Student und implementiert das Interface Dozent.
 */
public class Tutor extends Student implements Dozent{

    private String fachgebiet;

    /**
     * Dieser Konstruktor gibt einem Tutor-Objekt einen Vornamen, Nachnamen, Matrikelnummer und ein Fachgebiet.
     *
     * @param vorname
     * @param nachname
     * @param matrikelNummer
     * @param fachgebiet
     */
    public Tutor(String vorname, String nachname, String matrikelNummer,
                 String fachgebiet) {
        super(vorname, nachname, matrikelNummer);
        this.fachgebiet = fachgebiet;
    }

    /**
     * Diese Methode liefert das Fachgebiet eines Tutors zurück.
     *
     * @return fachgebiet
     */
    public String getFachgebiet() {
        return fachgebiet;
    }
}
