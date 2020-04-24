public class Ticket {

	private int hall;
	private double prijs;
	private int day;
	private String month;
	private int year;
	private double time;
	private String movieTitle;
	private String language;
	private int duration;
	private boolean subtitles;
	private double rating;
	private int information;
	private String customerName;
	private String screen;
	private int seat;

	/**
	 * 
	 * @param Inf
	 */
	public void setInformation(Screening Inf) {
		// TODO - implement Ticket.setInformation
		throw new UnsupportedOperationException();
	}

	public void getInformation() {
		// TODO - implement Ticket.getInformation
		throw new UnsupportedOperationException();
	}

	public String getMovieTitle() {
		return this.movieTitle;
	}

	/**
	 * 
	 * @param mT
	 */
	public void setMovieTitle(Movie mT) {
		// TODO - implement Ticket.setMovieTitle
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cN
	 */
	public void setCustomerName(Name cN) {
		// TODO - implement Ticket.setCustomerName
		throw new UnsupportedOperationException();
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public String toString() {
		// TODO - implement Ticket.toString
		throw new UnsupportedOperationException();
	}

	public int getSeat() {
		return this.seat;
	}

	/**
	 * 
	 * @param sN
	 */
	public void setSeat(int sN) {
		this.seat = sN;
	}

	/**
	 * 
	 * @param dC
	 */
	public void setDiscount(Discount dC) {
		// TODO - implement Ticket.getDiscount
		throw new UnsupportedOperationException();
	}

	public double getDiscount() {
		// TODO - implement Ticket.getDiscount
		throw new UnsupportedOperationException();
	}

}