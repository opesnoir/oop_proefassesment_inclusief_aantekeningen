package controller;

//Naam, studentennummer en doel
/* Naam: M.C.
Studentennummer: 500241293
De klasse Launcher start de applicatie en voert de initiële configuratie uit.
Deze klasse bevat de main-methode die dient als het beginpunt van de applicatie.
*/

import model.Klant;

public class BotenVerhuurLauncher {
    //main toevoegen
    public static void main(String[] args) {
        //welkomsboodschap met naam en studentennummer toevoegen
        System.out.println("Welkom! Mijn naam is M.C en mijn studentennummer is 500241293.");

        //klant tostringmethode testen
        //klant aanmaken
        Klant klant = new Klant("Jan de Boer");
        //klant printen
        System.out.println(klant);
        System.out.println(); //lege regel



    }
}
