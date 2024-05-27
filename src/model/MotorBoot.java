package model;
//Naam, studentennummer en doel
/* Naam: M.C.
Studentennummer: 500241293
Doel: de klasse MotorBoot is een subklasse van Boot en beheert informatie over motorboten, zoals naam, lengte, en maximale snelheid. Deze klasse biedt methoden om
de huurprijs te berekenen en om te bepalen of een vaarbewijs vereist is. De toString-methode geeft een tekstuele representatie van de motorboot met relevante informatie zoals id, naam, vaarbewijsplicht en huurprijs.
 */
public class MotorBoot extends Boot {
    //attribuut
    private int maxSnelheid;
    private final static int GRENS_LENGTE_VAARBEWIJS = 15;
    private final static int GRENS_SNELHEID_VAARBEWIJS = 20;
    private final static int GRENS_LENGTE_PRIJSGEVING = 10;
    private final static double PRIJS_LAAG = 60.00;
    private final static double PRIJS_HOOG = 90.00;


    //constructor
    public MotorBoot(String naam, int lengte, int maxSnelheid) {
        super(naam, lengte);
        this.maxSnelheid = maxSnelheid;
    }

    //methode
    @Override
    public double berekenHuurprijs() {
        if (this.getLengte() < GRENS_LENGTE_PRIJSGEVING){
            return PRIJS_LAAG;
        } else {
            return PRIJS_HOOG;
        }
    }

    @Override
    public boolean isVaarbewijsPlichtig() {
        // lengte of snelheid boven de desbetreffende grens? dan ben je vaarbewijsplichtig : zo niet dan ben je niet vaarbewijsplichtig.
        if (this.getLengte() > GRENS_LENGTE_VAARBEWIJS || this.maxSnelheid > GRENS_SNELHEID_VAARBEWIJS) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString(){
        return super.toString().replace("Boot", "Motorboot") + String.format("\tHuurprijs: %.2f euro\n", this.berekenHuurprijs());
    }

}
