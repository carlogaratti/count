package counts;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCount extends Count {
	
	public DateCount() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		reset = calendar;
		super.reset();
	}

	@Override
	public void increment() {
		((Calendar)value).add(Calendar.HOUR, 1);
		myValueIsChanged();

	}

	public String value() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(((Calendar)value).getTime());
	}

}
