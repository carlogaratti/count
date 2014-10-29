package counts;

public class ValueWindow {

	private String screen;
	
	public void notice(Count integerCount) {
		screen = integerCount.value();
	}

	public Object screen() {
		return screen;
	}

}
