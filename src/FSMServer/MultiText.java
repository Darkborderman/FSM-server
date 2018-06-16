package FSMServer;

import java.io.Serializable;

public class MultiText implements Text, Serializable{
	String text[];
	public MultiText( String[] text ) {
		this.text = text;
	}
	public String[] getAllText() {
		return this.text;
	}
	public String getText( int index ) {
		return this.text[ index ];
	}
}
