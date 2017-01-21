/*
 * This file was created to facilitate lessons at HBO-ICT@HvA.
 */
package models;

/**
 *
 * @author Dennis Breuker (d.m.breuker@hva.nl)
 */
public class Product {
    /**
     * Symbool voor Euro-teken
     */
    public static final String EURO = "\u20AC";

    private String naam;
    private double prijs;

    public String getNaam() {
        return naam;
    }

    public double getPrijs() {
        return prijs;
    }
    
    @Override
    public String toString() {
        return "Naam: " + naam + "\n"
                + "  Prijs: " + EURO + String.format("%.2f", prijs);
    }
}
