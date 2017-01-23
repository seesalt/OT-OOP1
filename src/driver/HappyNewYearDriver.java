package driver;

import models.Instructie;
import models.Knaller;
import models.Vuurpijl;
import models.Vuurwerk;

import java.util.ArrayList;

public class HappyNewYearDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//TODO stap 1: haal commentaar weg
        ArrayList<Vuurwerk> pakket = new ArrayList<Vuurwerk>();
//TODO stap 1 */

        System.out.println("Happy new year from: Ralph 123456789 IS-108");

//TODO stap 1: haal commentaar weg
        stap1(pakket);
//einde TODO stap 1 */

///TODO stap 2: haal commentaar weg
        stap2(pakket);
//einde TODO stap 2 */

/* TODO stap 3: haal commentaar weg
        stap3(pakket);
einde TODO stap 3 */

/* TODO stap 4: haal commentaar weg
        stap4(pakket);
einde TODO stap 4 */
        
/* TODO stap 5: haal commentaar weg
        stap5(pakket);
einde TODO stap 5 */
        
/* TODO stap 6: haal commentaar weg
        stap6(pakket);
einde TODO stap61 */
    }

//TODO stap 1: haal commentaar weg
    private static void stap1(ArrayList<Vuurwerk> pakket) {
        System.out.println("\n--- STAP 1 ---");

        Vuurwerk vuurwerk;

        // vuurwerk met Nederlandstalige instructie
        vuurwerk = new Vuurwerk("Veiligheidsbril", 2.5,
                new Instructie(true, 6, "Draag bij aansteken"));
        pakket.add(vuurwerk);
        System.out.println(vuurwerk);

        // vuurwerk met Engelstalige instructie
        vuurwerk = new Vuurwerk("Safety glass", 2.5,
                new Instructie(false, 6, "Wear before ignition"));
        pakket.add(vuurwerk);
        System.out.println(vuurwerk);

        // vuurwerk zonder instructie
        vuurwerk = new Vuurwerk("Aansteeklont zonder instructie", 0.25, null);
        pakket.add(vuurwerk);
        System.out.println(vuurwerk);
    }
//einde TODO stap 1 */

///TODO stap 2: haal commentaar weg
    private static void stap2(ArrayList<Vuurwerk> pakket) {
        System.out.println("\n--- STAP 2 ---");

        Knaller knaller;

        // knaller met Engelstalige instructie en 75 decibel
        knaller = new Knaller(777, 75, "Celebration Crackers", 10,
                new Instructie(false, 21, "Keep minimum 10 ft distance"));
        pakket.add(knaller);
        System.out.println(knaller);

        // knaller met Nederlandstalige instructie en 120 decibel
        knaller = new Knaller(500, 120, "Peking Rol", 45,
                new Instructie(true, 21, "Houd minimaal 5 meter afstand"));
        pakket.add(knaller);
        System.out.println(knaller);

        // knaller met Nederlandstalige instructie en 125 decibel
        knaller = new Knaller(1000, 125, "Shanghai Rol", 85,
                new Instructie(true, 21, "Houd minimaal 5 meter afstand"));
        pakket.add(knaller);
        System.out.println(knaller);

        // knaller zonder instructie en 100 decibel
        knaller = new Knaller(1000, 100, "Hongkong Rol", 82.5, null);
        pakket.add(knaller);
        System.out.println(knaller);
    }
//TODO stap 2 */


    private static void stap3(ArrayList<Vuurwerk> pakket) {
        System.out.println("\n--- STAP 3 ---");

        Vuurpijl vuurpijl;

        // vuurpijl met Nederlandstalige instructie, correcte kleurverhouding, leeftijd 10
        vuurpijl = new Vuurpijl(40, new int[]{50, 25, 25}, "Cruise Rocket", 2.50,
                new Instructie(true, 10, "Niet in de hand houden"));
        pakket.add(vuurpijl);
        System.out.println(vuurpijl);

        // vuurpijl met Nederlandstalige instructie, incorrecte kleurverhouding, leeftijd 16
        vuurpijl = new Vuurpijl(40, new int[]{25, 30, 44}, "Killing Arrow", 4.25,
                new Instructie(true, 16, "Niet in de hand houden"));
        pakket.add(vuurpijl);
        System.out.println(vuurpijl);

        // vuurpijl met Engelstalige instructie, incorrecte kleurverhouding, leeftijd 20
        vuurpijl = new Vuurpijl(40, new int[]{50, 41, 10}, "Magic Sky", 2.75,
                new Instructie(false, 20, "Keep minimum 10 ft distance"));
        pakket.add(vuurpijl);
        System.out.println(vuurpijl);

        // vuurpijl zonder instructie, correcte kleurverhouding
        vuurpijl = new Vuurpijl(40, new int[]{50, 50, 0}, "Golden Sky", 3.25, null);
        pakket.add(vuurpijl);
        System.out.println(vuurpijl);
    }
//einde TODO stap 3 */

/* TODO stap 4: haal commentaar weg
    public static void stap4(ArrayList<Vuurwerk> pakket) {
        System.out.println("\n--- STAP 4 ---");

        toonVuurwerk(pakket);
    }
einde TODO stap 4 */

/* TODO stap 5: haal commentaar weg
    public static void stap5(ArrayList<Vuurwerk> pakket) {
        System.out.println("\n--- STAP 5 ---");

        toonInstructies(pakket, -1);
        toonInstructies(pakket, 3);
        toonInstructies(pakket, 10);
        toonInstructies(pakket, 11);
    }
einde TODO stap 5 */

/* TODO stap 6: haal commentaar weg
    public static void stap6(ArrayList<Vuurwerk> pakket) {
        System.out.println("\n--- STAP 6 ---");

        printHardeKnallers(pakket, 100);
    }
einde TODO stap 6 */
}