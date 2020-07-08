
public class Seat {
	int seatNumber;
	int seatLimit;
	boolean isFull;
	
	public Seat(boolean isFull, int seatLimit) {
		this.isFull = isFull;
		this.seatLimit = seatLimit;
	}
	
	public void accumSeat() {
		this.seatNumber += 1;
	}
	
	//Important
	public boolean getFullStatus() {
		if (seatNumber <= seatLimit) return false;
		else return true;
	}
	
	public void full() {
		isFull = true;
	}
	
	public void notFull() {
		isFull = false;
	}
	
	
}
