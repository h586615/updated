package entities;

import java.util.List;

public class Office {

	private Integer officeNumber;
	private Address officeAddress;
	private String telephoneNumber;
	public Integer getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(Integer officeNumber) {
		this.officeNumber = officeNumber;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	private List<Car> cars;

	public Office(Integer officeNumber, Address officeAddress, String telephoneNumber, List<Car> cars) {
		this.officeNumber = officeNumber;
		this.officeAddress = officeAddress;
		this.telephoneNumber = telephoneNumber;
		this.cars = cars;
	}
}
