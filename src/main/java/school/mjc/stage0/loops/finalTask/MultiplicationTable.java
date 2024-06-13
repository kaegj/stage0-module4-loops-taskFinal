package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        System.out.println("What number would you like the multiplication table for?");
        for(int i = 1; i <= 12; i++) {
            System.out.println(numberTableToPrint + " * " + i + " = " + (numberTableToPrint * i));
        }
    }
}
