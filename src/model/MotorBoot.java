package model;

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
        if (super.getLengte() < GRENS_LENGTE_PRIJSGEVING){
            return PRIJS_LAAG;
        } else {
            return PRIJS_HOOG;
        }
    }

    @Override
    public boolean isVaarbewijsPlichtig() {
        // lengte of snelheid boven de desbetreffende grens? dan ben je vaarbewijsplichtig : zo niet dan ben je niet vaarbewijsplichtig.
        if (super.getLengte() > GRENS_LENGTE_VAARBEWIJS || this.maxSnelheid > GRENS_SNELHEID_VAARBEWIJS) {
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
