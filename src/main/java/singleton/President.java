package singleton;

public class President {
	
	private static President instance = null;
	
	private President(){}
	
	public static President getInstance() {
		if( instance == null) {
			instance = new President();
		}
		return instance;
	}
}
