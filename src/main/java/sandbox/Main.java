package sandbox;

public class Main {
    public static void main(String[] args) {
        Dimension dimensions = new Dimension(20, 20, 50);
        Case theCase = new Case("Model x", "Windows", "1000W", dimensions);
        Resolution resolution = new Resolution(7680, 4320);
        Monitor monitor = new Monitor(resolution, "Model z", "Apple");
        Motherboard motherboard = new Motherboard("Model A", "Dell", 4, 3, "UEFI");

        PC myPC = new PC(theCase, monitor, motherboard);

        myPC.description();

        myPC.powerUp();
    }
}
