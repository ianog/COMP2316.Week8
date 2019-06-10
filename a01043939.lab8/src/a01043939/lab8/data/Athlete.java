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

	private int lane;
	private int bib;
	private String country;
	private String firstName;
	private String lastName;
	private double reactionTime;
	private double result;

	/**
	 * @return the lane
	 */
	public int getLane() {
		return lane;
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
	 * @return the result
	 */
	public double getResult() {
		return result;
	}

	/**
	 * @param lane
	 *            the lane to set
	 */
	public void setLane(int lane) {
		this.lane = lane;
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

	/**
	 * @param result
	 *            the result to set
	 */
	public void setResult(double result) {
		this.result = result;
	}

}
