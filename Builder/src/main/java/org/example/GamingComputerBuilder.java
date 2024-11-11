package org.example;

public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor("Intel i9");
    }

    @Override
    public void buildRAM() {
        computer.setRamSize(32);
    }

    @Override
    public void buildHardDrive() {
        computer.setHardDrive("1TB SSD");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("NVIDIA GeForce RTX 3080");
    }

    @Override
    public void buildOperatingSystem() {
        computer.setOperatingSystem("Windows 11");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
