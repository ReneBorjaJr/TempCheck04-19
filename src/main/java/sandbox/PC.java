package sandbox;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    private void drawLogo() {
        monitor.drawPixel(10, 30, "Red");
    }
    public void description() {
        System.out.println("Welcome to Worst Buy, below is the description of the PC on sale today:");
        System.out.println(theCase);
        System.out.println(monitor);
        System.out.println(motherboard);
    }
    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("Windows 11");
    }
}
