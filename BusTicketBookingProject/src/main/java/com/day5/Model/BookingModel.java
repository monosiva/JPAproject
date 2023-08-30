package com.day5.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="TblBooking")
public class BookingModel {
    @Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long booking_id;
    private  int no_seats;
    private float fare_amount;
    private float amount;
    private String date_of_booking;
    private String booking_status;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="booking_id",referencedColumnName = "booking_id")
	public List<PaymentModel> payment;
	public long getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(long booking_id) {
		this.booking_id = booking_id;
	}
	public int getNo_seats() {
		return no_seats;
	}
	public void setNo_seats(int no_seats) {
		this.no_seats = no_seats;
	}
	public float getFare_amount() {
		return fare_amount;
	}
	public void setFare_amount(float fare_amount) {
		this.fare_amount = fare_amount;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getDate_of_booking() {
		return date_of_booking;
	}
	public void setDate_of_booking(String date_of_booking) {
		this.date_of_booking = date_of_booking;
	}
	public String getBooking_status() {
		return booking_status;
	}
	public void setBooking_status(String booking_status) {
		this.booking_status = booking_status;
	}
	public List<PaymentModel> getPayment() {
		return payment;
	}
	public void setPayment(List<PaymentModel> payment) {
		this.payment = payment;
	}
    
	
}
