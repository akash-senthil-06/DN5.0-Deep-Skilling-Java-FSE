package DesignPatterns.Exercise03;
public class BuilderTest {
    public static void main(String[] args) {
        Computer officePC = new Computer.Builder() .setCPU("Intel i3") .setRAM("8GB") .setStorage("256GB SSD") .build();
        Computer gamingPC = new Computer.Builder() .setCPU("AMD Ryzen 9") .setRAM("32GB") .setStorage("2TB NVMe SSD") .setGraphicsCard(true) .setBluetooth(true) .build();
        System.out.println("Office Computer Configuration:");
        System.out.println(officePC);
        System.out.println("Gaming Computer Configuration:");
        System.out.println(gamingPC);
    }
}
