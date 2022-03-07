package Chap4;

public class WorldPopulation {
    public static void main(String... args){
        int year = 1;
        long currentPopulation = 7900000000L;
        double growthRate = 0.1;



        while (year <= 75){
            long worldPopulationAtEndOfYear = (long)( currentPopulation + (currentPopulation * growthRate * year));
            long numericalIncrease = worldPopulationAtEndOfYear - currentPopulation;
            System.out.printf("%d\t%d\t%d",year,worldPopulationAtEndOfYear,numericalIncrease);
            System.out.println();
            if (worldPopulationAtEndOfYear == 2 * currentPopulation){
                System.out.println("World population is twice current population in year " + year);
            }
            year++;
        }

    }
}
