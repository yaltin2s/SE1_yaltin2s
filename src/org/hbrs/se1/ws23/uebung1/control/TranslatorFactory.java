package org.hbrs.se1.ws23.uebung1.control;

public class
/**
 * Anwendung
 * Problem: Inkonsistente Objek-Erzeugung und Parameterisierung
 * Lösung: Service
 */

TranslatorFactory {
    public static Translator creatGermanTranslator(){
        Translator translator = new GermanTranslator();
        return translator;
    }
}
