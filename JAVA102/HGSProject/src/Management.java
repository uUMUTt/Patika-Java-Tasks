
public class Management implements CalculateTotal {

    private final TollBoth tollBoth;

    public Management() {
        this.tollBoth = new TollBoth();
    }

    @Override
    public void calculateTotalTicketing() {
        System.out.println("*******TOTAL AMOUNT*******");
        System.out.println("-> " + tollBoth.getTotal() + " TL");
    }

    public TollBoth getTollBoth() {
        return tollBoth;
    }

}
