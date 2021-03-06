package entities;

public class Address {

	private String streetAddress;
	private String zipCode;
	private String city;

	public Address(String streetAddress, String zipCode, String city) {
		this.streetAddress = streetAddress;
		this.zipCode = zipCode;
		this.city = city;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
