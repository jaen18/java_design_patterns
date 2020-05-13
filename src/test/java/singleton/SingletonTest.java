package singleton;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

	@Test
	public void shouldCreteOnlyOneInstance() {
		
		President president1 = President.getInstance();
		President president2 = President.getInstance();
		
		Assert.assertSame(president1, president2);
	}

}
