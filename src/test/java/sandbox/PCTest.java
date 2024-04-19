package sandbox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PCTest {

    @Test
    void testPCConstructor() {
        Dimension dimensions = new Dimension(20, 20, 10);
        Case theCase = new Case("Model x", "Windows", "1000W", dimensions);
        Resolution resolution = new Resolution(7680, 4320);
        Monitor monitor = new Monitor(resolution, "Model z", "Apple");
        Motherboard motherboard = new Motherboard("Model A", "Dell", 4, 3, "UEFI");

        PC myPC = new PC(theCase, monitor, motherboard);


    }

}