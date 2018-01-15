
public class Printer {
	private double tonerLevel;
	private int printedPages;
	private boolean duplexPrinter;
	
	public void fillToner(double tonerQty) {
		if(tonerLevel<100) {
			tonerLevel+=tonerQty;
		}
	}
	
	public void printPage() {
		printedPages++;
		System.out.print("Printing page");
	}
}
