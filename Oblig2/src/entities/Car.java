package entities;

public class Car {

	private Integer registrationNumber;
	private String model;
	private String color;
	private Chassis chassis;
	private Boolean available;

	public Car(Integer registrationNumber, String model, String color, Chassis chassis) {
		this.registrationNumber = registrationNumber;
		this.model = model;
		this.color = color;
		this.chassis = chassis;
	}

	public Integer getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(Integer registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Chassis getChassis() {
		return chassis;
	}

	public void setChassis(Chassis chassis) {
		this.chassis = chassis;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

}
