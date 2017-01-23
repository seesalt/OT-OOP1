package models;

/**
 * Created by ralph on 1/21/2017.
 */
public class Vuurwerk extends Product {
    private Instructie instructie;

    public Vuurwerk(String naam, double prijs, Instructie instructie){
        super(naam, prijs);
        this.instructie = instructie;
    }

    public boolean isLegaal(){
        if(instructie != null){
            if(instructie.isNederlandstalig()){
                return true;
            }
        }
        return false;
    }

    public Instructie getInstructie() {
        return instructie;;
    }

    @Override
    public String toString(){
        if (instructie == null){
            return super.toString() + " \nInstructie: Ontbreekt" + "\nLegaal: " + isLegaal();
        }
        return super.toString() + "\nInstructie: " + instructie.toString() + "\nLegaal: " + isLegaal();
    }
}
