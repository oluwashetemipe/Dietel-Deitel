package Chap10;

import Chap8.DateTime;

public class PieceWorker extends Employee{
    private double wages;
    private int pieces;
    protected PieceWorker(String firstName, String lastName, String socialSecurityNumber, DateTime birthdate,double wages,int pieces) {
        super(firstName, lastName, socialSecurityNumber, birthdate);
        if (wages < 0.0)
            throw new IllegalArgumentException("Wages must be >= 0.0");
        this.pieces = pieces;
        this.wages = wages;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        if (wages < 0.0)
             throw new IllegalArgumentException("Wages must be >= 0.0");
        this.wages = wages;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    @Override
    public double earnings() {
        return getPieces() * getWages();
    }

    @Override
    public String toString() {
        return String.format("%s %n%s%.2f%s%d%n%s%.2f",super.toString(),"Wages",getWages(),"Pieces",getPieces(),"Earnings",earnings());
    }
}
