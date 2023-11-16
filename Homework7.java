abstract class Printer {
    private String model;
    private int printedCount;
    private int availableCount;

    public Printer(String model, int availableCount) {
        this.model = model;
        this.printedCount = 0;
        this.availableCount = availableCount;
    }

    public String getModel() {
        return model;
    }

    public int getPrintedCount() {
        return printedCount;
    }

    public void setPrintedCount(int printedCount) {
        this.printedCount = printedCount;
    }

    public int getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(int availableCount) {
        this.availableCount = availableCount;
    }

    abstract public boolean print();
}

class InkjetPrinter extends Printer {
    public InkjetPrinter(String model, int availableCount) {
        super(model, availableCount);
    }

    public boolean print() {
        if (getAvailableCount() >= 1) {
            setPrintedCount(getPrintedCount() + 1);
            setAvailableCount(getAvailableCount() - 1);
            return true;
        }
        else {
            System.out.println(getModel() + ": " + (getPrintedCount() + 1) + "매째 인쇄 실패 - 잉크 부족.");
            return false;
        }
    }
}

class LaserPrinter extends Printer {
    public LaserPrinter(String model, int availableCount) {
        super(model, availableCount);
    }

    public boolean print() {
        if (getAvailableCount() >= 1) {
            setPrintedCount(getPrintedCount() + 1);
            setAvailableCount(getAvailableCount() - 1);
            return true;
        }
        else {
            System.out.println(getModel() + ": " + (getPrintedCount() + 1) + "매째 인쇄 실패 - 토너 부족.");
            return false;
        }
    }
}

public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T720DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print()) ;
        while (laser.print()) ;
    }
}
