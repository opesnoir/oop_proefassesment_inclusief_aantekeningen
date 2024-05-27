package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Naam, studentennummer en doel
/* Naam: M.C.
Studentennummer: 500241293
De klasse Verhuur beheert de verhuur van boten aan klanten, inclusief informatie over de klant, de boten, de startdatum en de duur van de verhuur. Deze klasse biedt methoden
om boten toe te voegen, de huurprijs te berekenen en een tekstuele representatie van de verhuur te geven.
 */

public class Verhuur {
    //attributen
    private Klant klant;
    private List<Boot> boten;
    private LocalDate startDatum;
    private int aantalDagen;
    private static double totaalBedragBoten = 0.00;

    //constructor
    public Verhuur(Klant klant, LocalDate startDatum, int aantalDagen) {
        this.klant = klant;
        this.startDatum = startDatum;
        this.aantalDagen = aantalDagen;
        boten = new ArrayList<>();
    }

    //methoden
    public boolean magVerhuurd(Boot boot) {
        if (boot.isVaarbewijsPlichtig() && !klant.isVaarVaardig()) {
            return false;
        } else {
            return true;
        }
    }

    public void voegBootToe(Boot boot) {
        if (magVerhuurd(boot)) {
            boten.add(boot);
        } else {
            System.out.printf(boot + "Mag niet verhuurd worden! Toevoegen mislukt\n");
        }
    }

    public double berekenHuurBedrag(){
        for (Boot boot : boten){
            totaalBedragBoten += boot.berekenHuurprijs();
        }
        return aantalDagen * totaalBedragBoten;
    }

    @Override
    public String toString() {
        Collections.sort(boten);
        StringBuilder resultString = new StringBuilder();
        resultString.append(String.format("De verhuur aan Klant %s ", this.klant.getNaam()));
        if (boten.isEmpty()){
            resultString.append(String.format("op %s is mislukt, geen boten toegevoegd.\n", this.startDatum));
        } else {
            resultString.append(String.format("van %s tot %s kost %.2f euro:\n", this.startDatum, this.startDatum.plusDays(aantalDagen - 1), this.berekenHuurBedrag()));
            for (Boot boot : boten){
                resultString.append(boot);
            }
        }
        return resultString.toString();
    }
}
