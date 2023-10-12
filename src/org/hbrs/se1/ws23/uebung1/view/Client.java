package org.hbrs.se1.ws23.uebung1.view;

import org.hbrs.se1.ws23.uebung1.control.Translator;
import org.hbrs.se1.ws23.uebung1.control.TranslatorFactory;

public class Client {

		/*
		 * Methode zur Ausgabe einer Zahl auf der Console
		 * (auch bezeichnet als CLI, Terminal)
		 *
		 */
		 void display( int aNumber ){
			/*
			 In dieser Methode soll die Methode translateNumber
			 mit dem über gegebenen Wert der Variable aNumber
			 aufgerufen werden.

			 Strenge Implementierung gegen das Interface Translator gewünscht!
			GermanTranslator translator= new GermanTranslator();
			*/


			 Translator translator= TranslatorFactory.creatGermanTranslator();
			 String result = translator.translateNumber(2);

			System.out.println("Das Ergebnis der Berechnung: " +
					"[das Ergebnis an dieser Stelle]" + result );

		 }
}





