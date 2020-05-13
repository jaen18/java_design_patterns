package builder;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Assert;
import org.junit.Test;

public class BuilderTest {

	@Test
	public void shoulCreateIntanceByBuilder() {
		Car car = new Car.Builder().brand("Nissan").color("Blue").price(200.0).seats(5).build();
		Assert.assertEquals(car.getBrand(), "Nissan");
		Assert.assertEquals(car.getColor(), "Blue");
		Assert.assertEquals(car.getPrice(), Double.valueOf(200.0));
		Assert.assertEquals(car.getSeats(), Integer.valueOf(5));
	}
	
	@Test
	public void shoulCreateIntanceByBuilderWithOneAtribute() {
		Car car = new Car.Builder().brand("Nissan").build();
		Assert.assertEquals(car.getBrand(), "Nissan");
		Assert.assertNull(car.getColor());
		Assert.assertNull(car.getPrice());
		Assert.assertNull(car.getSeats());
		
	}


}
