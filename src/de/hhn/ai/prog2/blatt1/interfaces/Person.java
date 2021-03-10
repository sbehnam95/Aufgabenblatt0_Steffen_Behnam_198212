package de.hhn.ai.prog2.blatt1.interfaces;

/**
 * Diese Klasse ist eine Superklasse.
 */
public class Person {

    private String vorname;
    private String nachname;

    /**
     * Dieser Konstruktor gibt einzelne Personen-Objekte einen Vornamen und einen Nachnamen.
     *
     * @param vorname
     * @param nachname
     */
    public Person(String vorname, String nachname) {

        this.nachname = nachname;
        this.vorname = vorname;
    }
}
