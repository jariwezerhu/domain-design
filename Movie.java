public class Movie {

	private String title;
	private String language = "english";
	private int duration;
	private boolean subtitles = true;
	private double rating;

	/**
	 * 
	 * @param title
	 */
	public Movie(String title) {
		// TODO - implement Movie.Movie
		throw new UnsupportedOperationException();
	}

	public String getLanguage() {
		return this.language;
	}

	/**
	 * 
	 * @param ln
	 */
	public void setLanguage(String ln) {
		this.language = ln;
	}

	public int getDuration() {
		return this.duration;
	}

	/**
	 * 
	 * @param dur
	 */
	public void setDuration(int dur) {
		this.duration = dur;
	}

	public boolean getSubtitles() {
		return this.subtitles;
	}

	/**
	 * 
	 * @param sT
	 */
	public void setSubtitles(boolean sT) {
		this.subtitles = sT;
	}

	public double getRating() {
		return this.rating;
	}

	/**
	 * 
	 * @param rt
	 */
	public void setRating(double rt) {
		this.rating = rt;
	}

	public String toString() {
		// TODO - implement Movie.toString
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param language
	 * @param duration
	 * @param subtitles
	 * @param rating
	 */
	public void MovieDescription(String language, int duration, boolean subtitles, double rating) {
		// TODO - implement Movie.MovieDescription
		throw new UnsupportedOperationException();
	}

	public String getTitle() {
		return this.title;
	}

	/**
	 * 
	 * @param tit
	 */
	public void setTitle(String tit) {
		this.title = tit;
	}

}