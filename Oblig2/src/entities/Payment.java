package entities;

public class Payment {

	private Reservation reservation;
	private Integer paymentId;
	private int price;

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Payment(Reservation reservation, Integer paymentId, int price) {
		this.reservation = reservation;
		this.paymentId = paymentId;
		this.price = price;
	}

}
