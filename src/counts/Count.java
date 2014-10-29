package counts;

public abstract class Count {

	protected Object reset;
	protected Object value;
	protected ValueWindow valueWindow;

	protected void reset() {
		value = reset;
	}
	
	public void setValueWindow(ValueWindow valueWindow) {
		this.valueWindow = valueWindow;
		this.valueWindow.notice(this);
	}
	
	protected void myValueIsChanged() {
		valueWindow.notice(this);
	}
	
	public abstract void increment();
	
	public String value() {
		return value.toString();
	}

}
