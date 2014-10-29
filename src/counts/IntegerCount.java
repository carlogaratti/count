package counts;

public class IntegerCount extends Count {
	
	
	public IntegerCount() {
		reset = 0;
		super.reset();
	}
	

	public void increment() {
		value = ((Integer)value) + new Integer(1);
		myValueIsChanged();
	}

}
