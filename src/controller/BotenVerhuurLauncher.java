package controller;

//Naam, studentennummer en doel
/* Naam: M.C.
Studentennummer: 500241293
De klasse Launcher start de applicatie en voert de initiële configuratie uit.
Deze klasse bevat de main-methode die dient als het beginpunt van de applicatie.
*/


import model.Klant;
import model.MotorBoot;

public class BotenVerhuurLauncher {
    //main toevoegen
    public static void main(String[] args) {
        //welkomstboodschap met naam en studentennummer printen
        System.out.println("Welkom! Mijn naam is M.C en mijn studentennummer is 500241293.");
        System.out.println();

        //klant aanmaken en de toString() testen
        //klant aanmaken
        Klant klant = new Klant("Jan de Boer");
        //klant printen
        System.out.println(klant);
        System.out.println();

        //motorboot aanmaken met negatieve lengte en de toString() testen
        //motorboot aanmaken
        MotorBoot motorBoot = new MotorBoot("De Engel", -5, 15);
        //motorboot printen
        System.out.println(motorBoot);








    }
}
