package entities;

import java.util.List;

public class RentalCompany {

	private String name;
	private String phoneNumber;
	private Address companyAddress;
	private List<Car> allCars;

	public RentalCompany(String name, String phoneNumber, Address companyAddress, List<Car> allCars) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.companyAddress = companyAddress;
		this.allCars = allCars;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(Address companyAddress) {
		this.companyAddress = companyAddress;
	}

	public List<Car> getAllCars() {
		return allCars;
	}

	public void setAllCars(List<Car> allCars) {
		this.allCars = allCars;
	}

}
