package models;

/**
 * Created by ralph on 1/21/2017.
 */
public class Knaller extends Vuurwerk {
    private int aantalKnallen;
    private int decibel;

    public Knaller(int aantalKnallen, int decibel, String naam, double prijs, Instructie instructie) {
        super(naam,prijs,instructie);
        this.aantalKnallen = aantalKnallen;
        this.decibel = decibel;

    }

    public int getDecibel() {
        return decibel;
    }


    @Override
    public boolean isLegaal() {
        if(decibel > 120){
            return false;
        }
        return true;
    }

    public String toString(){
        return super.toString() + "\n aaantalKnallen: " + aantalKnallen + "\n decibel: " + getDecibel();
    }
}
