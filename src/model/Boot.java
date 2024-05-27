package model;

//Naam, studentennummer en doel
/* Naam: M.C.
Studentennummer: 500241293
Doel: Abstracte klasse Boot implementeert Comparable en VrijVerhuurbaar interfaces.
Het is een superklasse voor verschillende boten (zeilboot / motorboot), met attributen voor naam, lengte en ID.
Biedt methoden om bootlengte te controleren, bootnaam op te halen en boten te vergelijken op naam.
toString geeft tekstuele representatie van boot met ID, naam en vaarbewijs vereiste.
 */

public abstract class Boot implements Comparable<Boot>, VrijVerhuurbaar {
    //Attributen (velden)
    private final static int MIN_LENGTE = 0;
    private final static int DEFAULT_LENGTE = 5;
    private static int lastId = 0;
    private final int id;
    private String naam;
    private int lengte;

    //Constructors
    protected Boot(String naam, int lengte) {
        this.naam = naam;
        setLengte(lengte);
        this.id = ++lastId;
    }

    //Getters en Setters
    //setlengte methode controleert lengte, als lengte niet voldoet - geef error en zet op default lengte
    public void setLengte(int lengte) {
        if (lengte > MIN_LENGTE) {
            this.lengte = lengte;
        } else {
            System.out.printf("De bootlengte moet een positieve waarde zijn. De lengte van deze boot is op %d meter gezet.\n", DEFAULT_LENGTE); //let op String.Format werkt hier niet, daarom Souf gebruiken!
            this.lengte = DEFAULT_LENGTE;
        }
    }

    //getName nodig voor de compare methode
    public String getNaam() {
        return naam;
    }

    public int getLengte() {
        return lengte;
    }

    //methoden
    public abstract double berekenHuurprijs(); // abstracte methode, die in de subklasse wordt geimplementeerd

    @Override
    public int compareTo(Boot andereBoot) {
        return this.naam.compareTo(andereBoot.getNaam());
    }

    @Override
    public boolean isVaarbewijsPlichtig() {
        return false;
    }

    @Override
    public String toString() {
        return String.format("Boot %d met naam %s\n\tVaarbewijs vereist: %s\n", this.id, this.naam, this.isVaarbewijsPlichtig()? "Ja" : "Nee");
    }

}
