package entities;

import java.util.Date;

public class Reservation {

	private Integer reservationId;
	private Office office;
	private Customer customer;
	private String creditCardNumber;
	private Car car;
	private Date rentalDate;
	private Date returnDate;

	public Reservation(Integer reservationId, Office office, Customer customer, String creditCardNumber, Car car,
			Date rentalDate, Date returnDate) {
		this.reservationId = reservationId;
		this.office = office;
		this.customer = customer;
		this.creditCardNumber = creditCardNumber;
		this.car = car;
		this.rentalDate = rentalDate;
		this.returnDate = returnDate;
	}

	public Integer getReservationId() {
		return reservationId;
	}

	public void setReservationId(Integer reservationId) {
		this.reservationId = reservationId;
	}

	public Office getOffice() {
		return office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Date getRentalDate() {
		return rentalDate;
	}

	public void setRentalDate(Date rentalDate) {
		this.rentalDate = rentalDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

}
