package model;

//Naam, studentennummer en doel
/* Naam: M.C.
Studentennummer: 500241293
De klasse Klant beheert informatie over klanten, zoals naam, email en vaarvaardig.
Deze klasse bevat een methode om vaarvaardigheid te bepalen. De tostring geeft een tekstuele representatie van de klant terug.
*/
public class Klant {
    //Attributen
    private String naam;
    private String email;
    private boolean vaarVaardig;

    //Constructors
    public Klant() {
        this("onbekend");
    }

    public Klant(String naam) {
        this(naam, "onbekend", false);
    }

    public Klant(String naam, String email, boolean vaarVaardig) {
        this.naam = naam;
        this.email = email;
        this.vaarVaardig = vaarVaardig;
    }

    //Getters en setters: deze zijn uitsluitend toegevoegd waar nodig. Als ze ontbreken, zijn ze niet nodig voor deze klasse.
    //Andere methoden
    public boolean isVaarVaardig() {
        return vaarVaardig;
    }

    //toString
    @Override
    public String toString() {
        return String.format("Klant %s", this.naam);
    }

}
