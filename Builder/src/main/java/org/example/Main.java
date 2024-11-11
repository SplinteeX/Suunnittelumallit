package org.example;

public class Main {
    public static void main(String[] args) {
        // Building a Gaming Computer
        ComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();
        ComputerDirector gamingDirector = new ComputerDirector(gamingComputerBuilder);
        gamingDirector.constructComputer();
        Computer gamingComputer = gamingComputerBuilder.getComputer();
        gamingComputer.displayConfiguration();

        System.out.println("\n--------------------\n");

        // Building an Office Computer
        ComputerBuilder officeComputerBuilder = new OfficeComputerBuilder();
        ComputerDirector officeDirector = new ComputerDirector(officeComputerBuilder);
        officeDirector.constructComputer();
        Computer officeComputer = officeComputerBuilder.getComputer();
        officeComputer.displayConfiguration();
    }
}
