package controller;

//Naam, studentennummer en doel
/* Naam: M.C.
Studentennummer: 500241293
De klasse Launcher start de applicatie en voert de initiële configuratie uit.
Deze klasse bevat de main-methode die dient als het beginpunt van de applicatie.
*/

import model.Klant;
import model.MotorBoot;
import model.Verhuur;
import model.ZeilBoot;

import java.time.LocalDate;

public class BotenVerhuurLauncher {
    //main toevoegen
    public static void main(String[] args) {
        //welkomstboodschap met naam en studentennummer printen
        System.out.println("Welkom! Mijn naam is M.C en mijn studentennummer is 500241293.");
        System.out.println();

        //klant aanmaken en de toString() testen
        //klant aanmaken
        Klant klantJanDeBoer = new Klant("Jan de Boer");
        //klant printen
        System.out.println(klantJanDeBoer);
        System.out.println();

        //motorboot aanmaken met negatieve lengte en de toString() testen
        //motorboot aanmaken
        MotorBoot motorBootDeEngel = new MotorBoot("De Engel", -5, 15);
        //motorboot printen
        System.out.println(motorBootDeEngel);

        //zeilboot aanmaken en de toString() testen
        //zeilboot aanmaken
        ZeilBoot zeilBootValk1 = new ZeilBoot("Valk 1", 20);
        //zeilboot printen
        System.out.println(zeilBootValk1);

        //verhuur testen foutmelding
        Verhuur verhuurAanJanDeBoer = new Verhuur(klantJanDeBoer, LocalDate.of(2020,12,3),4);
        //! eerst to string maken voor als de verhuur leeg is
        System.out.println(verhuurAanJanDeBoer);
        System.out.println();
        //maak boot aan (deze is voor printen van foutmelding suzyq mag niet verhuurd worden aan jan, hij heeft geen vaarbewijs)
        MotorBoot motorBootSuzyQ = new MotorBoot("SusyQ", 25, 30);
        //voeg boot toe aan verhuur aan jan en print foutmelding jan mag suzy niet huren
        verhuurAanJanDeBoer.voegBootToe(motorBootSuzyQ);
        System.out.println();

        //voeg boot toe aan verhuur aan jan die hij wel mag huren zonder vaarbewijs
        verhuurAanJanDeBoer.voegBootToe(motorBootDeEngel); // moter boot de engel mag zonder vaarbewijs
        System.out.println(verhuurAanJanDeBoer);

        //voeg klant met vaarbewijs toe, die diverse boven huurt
        //maak klant
        Klant klantVanDerValk = new Klant("van der Valk", "petervandervalk@gmail.com", true);
        //maak verhuur met klant
        Verhuur verhuurAanVanDerValk = new Verhuur(klantVanDerValk, LocalDate.of(2020, 12, 3), 7);
        //voeg boten toe aan de verhuur
        verhuurAanVanDerValk.voegBootToe(motorBootDeEngel);
        verhuurAanVanDerValk.voegBootToe(motorBootSuzyQ);
        verhuurAanVanDerValk.voegBootToe(zeilBootValk1);
        //print de verhuur
        System.out.println(verhuurAanVanDerValk);
        System.out.println();

    }
}
