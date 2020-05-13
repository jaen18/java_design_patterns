package builder;

public class Car {
	private String color;
	private String brand;
	private Double price;
	private Integer seats;
	
	public static class Builder{
		
		private String color;
		private String brand;
		private Double price;
		private Integer seats;
		
		public Builder() {}
				
		public Car build() {		
			return new Car(this);
		}
		
		public Builder color(String color) {
			this.color = color;
			return this;
		}
		
		public Builder brand(String brand) {
			this.brand = brand;
			return this;
		}

		public Builder price(Double price) {
			this.price = price;
			return this;
		}
	
		public Builder seats(Integer seats) {
			this.seats = seats;
			return this;
		}
							
	}
	
	private Car( Builder builder) {
		this.color = builder.color;
		this.brand = builder.brand;
		this.price = builder.price;
		this.seats = builder.seats;
	}
	
	public String getColor() {
		return color;
	}
	public String getBrand() {
		return brand;
	}
	public Double getPrice() {
		return price;
	}
	public Integer getSeats() {
		return seats;
	}
		
}
