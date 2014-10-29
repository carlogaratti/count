package count;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import counts.IncrementButton;
import counts.IntegerCount;
import counts.ValueWindow;

public class CountTest {
	
	private ValueWindow vW;
	private IncrementButton incrementButton;

	@Before
	public void setup() {
		IntegerCount integerCount = new IntegerCount();
		vW = new ValueWindow();
		incrementButton = new IncrementButton();
		incrementButton.setModel(integerCount);
		integerCount.setValueWindow(vW);
		
	}

	@Test
	public void withoutPushISeeZero(){
		assertEquals("senza schiacciare vedo 0", "0", vW.screen());
	}
	
	@Test
	public void scenarioIntegerIncrementOneTime() {
		incrementButton.push();
		assertEquals("schiaccio il bottone una volta e leggo 1", "1", vW.screen());
	}
	
	@Test
	public void scenarioIntegerTwoTime() {
		incrementButton.push();
		incrementButton.push();
		assertEquals("schiaccio due volte il bottone e leggo due", "2", vW.screen());
	}

}
