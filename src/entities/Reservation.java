package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Integer roomNumber;
	private Date checkin;
	private Date checkout;
	
	public Reservation() {
		
	}

	public Reservation(Integer roomNumber, Date checkin, Date checkout) {
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}
	
	public long duration() {
		long diff = checkout.getTime() - checkin.getTime();
		//diff recebe os milissegundos de checkout substraídos pelos milissegundos de checkin
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		//Converte os milissegundos de diff para dias e os retorna
	}
	
	public void updateDate(Date checkin, Date checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	@Override
	public String toString() {
		return String.format("Reservation: Room %d, check-in: %s, checkout: %s, %d nights",
				roomNumber, sdf.format(checkin), sdf.format(checkout), duration());
	}
	
}
