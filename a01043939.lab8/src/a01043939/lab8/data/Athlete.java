/**
 * Project: a01043939.lab8
 * File: Athlete.java
 * Date: Jun. 9, 2019
 * Time: 9:19:10 p.m.
 */
package a01043939.lab8.data;

/**
 * @author Aaron Schollen, A01043939
 *
 */
public class Athlete {

	private int bib;
	private String country;
	private String firstName;
	private String lastName;
	private double reactionTime;

	/**
	 * @param firstName
	 * @param lastName
	 * @param bib
	 * @param country
	 * @param reactionTime
	 */
	public Athlete(String firstName, String lastName, int bib, String country, double reactionTime) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.bib = bib;
		this.country = country;
		this.reactionTime = reactionTime;
	}

	/**
	 * @return the bib
	 */
	public int getBib() {
		return bib;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the reactionTime
	 */
	public double getReactionTime() {
		return reactionTime;
	}

	/**
	 * @param bib
	 *            the bib to set
	 */
	public void setBib(int bib) {
		this.bib = bib;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param reactionTime
	 *            the reactionTime to set
	 */
	public void setReactionTime(double reactionTime) {
		this.reactionTime = reactionTime;
	}

}
