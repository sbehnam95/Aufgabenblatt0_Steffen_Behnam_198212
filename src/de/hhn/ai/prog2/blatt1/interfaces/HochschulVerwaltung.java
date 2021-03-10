package de.hhn.ai.prog2.blatt1.interfaces;

import java.util.*;

/**
 * Diese Klasse implementiert das Interface Dozent und soll Tutoren und Professoren in eine Liste hinzufügen.
 * Außerdem soll diese Klasse auch die Fachgebiete ausgeben.
 */
public class HochschulVerwaltung implements Dozent {

    private List<Professor> professoren = new ArrayList<>();
    private List<Tutor> tutoren = new ArrayList<>();

    /**
     * Diese Methode liefert alle Fachgebiete der einzelnen Tutoren und Professoren aus der Liste zurück.
     */
    public void gibFachgebieteAus() {
        for (Professor prof : professoren) {
            System.out.println(prof.getFachgebiet());
        }
        for (Tutor tutor : tutoren) {
            System.out.println(tutor.getFachgebiet());
        }
    }

    @Override
    public String getFachgebiet() {
        return null;
    }

    /**
     * Diese Methode fügt Professoren in die Liste ein.
     *
     * @param prof
     */
    public void fuegeProfessorHinzu(Professor prof) {
        if (prof != null) {
            professoren.add(prof);
        }
    }

    /**
     * Diese Methode fügt Tutoren in die Liste ein.
     *
     * @param tutor
     */
    public void fuegeTutorHinzu(Tutor tutor) {
        if (tutor != null) {
            tutoren.add(tutor);
        }
    }


}
