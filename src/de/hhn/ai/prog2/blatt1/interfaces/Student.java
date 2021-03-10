package de.hhn.ai.prog2.blatt1.interfaces;

/**
 * Diese Klasse erbt von der Klasse Person.
 */
public class Student extends Person {

    private String matrikelnummer;

    /**
     * Dieser Konstruktor gibt einem Student-Objekt einen Vornamen, Nachnamen und eine Matrikelnummer.
     *
     * @param vorname
     * @param nachname
     * @param matrikelnummer
     */
    public Student(String vorname, String nachname, String matrikelnummer) {

        super(vorname, nachname);


        this.matrikelnummer = matrikelnummer;
    }
}
