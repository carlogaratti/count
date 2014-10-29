package counts;

public class Starter {
	public static void main(String[] args) {
		IntegerCount integerCount = new IntegerCount();
		DateCount dateCount = new DateCount();
		ValueWindow vW = new ValueWindow();
		IncrementButton incrementButton = new IncrementButton();
		incrementButton.setModel(dateCount, integerCount);
		dateCount.setValueWindow(vW);
		integerCount.setValueWindow(vW);
		incrementButton.push();
		incrementButton.push();
		incrementButton.push();
		incrementButton.push();
		incrementButton.push();
		incrementButton.push();
	}
}
