package models;

/**
 * Created by ralph on 1/22/2017.
 */
public class Vuurpijl extends Vuurwerk {
    private double hoogte;
    private int[] kleurverhouding;

    public Vuurpijl(double hoogte, int[] kleurverhouding, String naam, double prijs, Instructie instructie) {
        super(naam, prijs, instructie);
        this.hoogte = hoogte;
        this.kleurverhouding = kleurverhouding;

    }

    @Override
    public boolean isLegaal() {
        if (super.isLegaal() && getInstructie().getLeeftijd() > 16){
            return true;
        }
        return false;
    }



    public String toString(){
        return "lol";
    }
}
