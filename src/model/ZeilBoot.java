package model;

//Naam, studentennummer en doel
/* Naam: M.C.
Studentennummer: 500241293
Doel: de klasse ZeilBoot is een subklasse van Boot en beheert informatie over zeilboten, zoals naam, lengte en enkele grenswaarden. Deze klasse biedt methoden om
de huurprijs te berekenen en om te bepalen of een vaarbewijs vereist is. De toString-methode geeft een tekstuele representatie van de zeilboot met relevante informatie zoals id, naam, vaarbewijsplicht en huurprijs.
 */
public class ZeilBoot extends Boot {
    //attributen
    private final static int GRENS_LENGTE_VAARBEWIJS = 15;
    private final static int GRENS_LENGTE_PRIJSGEVING = 7;
    private final static double PRIJS_LAAG = 40.00;
    private final static double PRIJS_HOOG = 70.00;

    //constructor
    public ZeilBoot(String naam, int lengte) {
        super(naam, lengte);
    }

    //methoden
    @Override
    public double berekenHuurprijs() {
        if (this.getLengte() < GRENS_LENGTE_PRIJSGEVING) {
            return PRIJS_LAAG;
        } else {
            return PRIJS_HOOG;
        }
    }

    @Override
    public boolean isVaarbewijsPlichtig() {
        if (this.getLengte() > GRENS_LENGTE_VAARBEWIJS) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString().replace("Boot", "Zeilboot") + String.format("\tHuurprijs: %.2f euro\n", this.berekenHuurprijs());
    }

}
