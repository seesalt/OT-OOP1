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
        if (!correcteKleurverhouding(kleurverhouding)) {
            System.out.println("--> FOUT: Onjuiste kleurverhouding, kleur wordt rood");
            this.kleurverhouding[0] = 100;
            this.kleurverhouding[1] = 0;
            this.kleurverhouding[2] = 0;
        }
    }

    public boolean correcteKleurverhouding(int[] kleurverhouding) {
        // if sum of array is not 100 return false
        int sum = 0;
        for (int i = 0; i < kleurverhouding.length; i++)
            sum += kleurverhouding[i];
        return (sum == 100);
    }

    @Override
    public boolean isLegaal() {
        return super.isLegaal() && getInstructie().getLeeftijd() > 16;
    }

    public String toString(){
        return super.toString() + "\n hoogte: " + this.hoogte + "meter" +
                "\n kleuren:\n\tROOD: " + kleurverhouding[0] + "\n\tGROEN: "
                + kleurverhouding[1] + "\n\tBLAUW: " + kleurverhouding[2] + "\n";
    }
}
