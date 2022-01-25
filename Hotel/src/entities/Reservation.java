package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

	private Integer roomNunber;
	private Date checkin;
	private Date checkOut;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reservation(Integer roomNunber, Date checkin, Date checOut) {
		this.roomNunber = roomNunber;
		this.checkin = checkin;
		this.checkOut = checOut;
	}

	public Integer getRoomNunber() {
		return roomNunber;
	}

	public void setRoomNunber(Integer roomNunber) {
		this.roomNunber = roomNunber;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duration() {
		long diff = checkOut.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		}
	
	public void updateDates(Date checkin, Date checkOut) {
		this.checkin = checkin;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Room " + roomNunber + ", check-in: " + sdf.format(checkin) + ", check-out: " + sdf.format(checkOut) + ", " + duration() + " nigths";
	}

}
