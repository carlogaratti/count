package counts;

public class IncrementButton {
	
	private Count[] counts;

	public void setModel(Count... counts) {
		this.counts = counts;
	}
	
	public void push() {
		for (Count iterable_element : counts) {
			iterable_element.increment();
		}
	}
}
