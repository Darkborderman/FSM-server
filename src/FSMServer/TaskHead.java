package FSMServer;

import java.io.Serializable;
import java.util.Date;

public class TaskHead extends Head implements Serializable{
	public TaskHead( String id, String from, String to, String title, Date createDate ) {
		super( id, from, to, title, createDate );
	}
	public Date getCreateDate() {
		return super.getDate();
	}
}
