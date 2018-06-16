package FSMServer;

import java.io.Serializable;
import java.util.Date;

public class MailHead extends Head implements Serializable{
	public MailHead( String id, String from, String to, String title, Date timeStemp ) {
		super( id, from, to, title, timeStemp );
	}
	public Date getTimeStemp() {
		return super.getDate();
	}
}
