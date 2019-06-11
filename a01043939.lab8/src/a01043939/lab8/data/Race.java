/**
 * Project: a01043939.lab8
 * File: Race.java
 * Date: Jun. 10, 2019
 * Time: 2:49:00 p.m.
 */
package a01043939.lab8.data;

import java.util.ArrayList;

/**
 * @author Aaron Schollen, A01043939
 *
 */
public class Race extends Thread {

	private ArrayList<Athlete> lanes;
	private ArrayList<Result> results;

	/**
	 * 
	 */
	public Race() {
		lanes = new ArrayList<>();
		results = new ArrayList<>();
	}

	/**
	 * @return the lanes
	 */
	public ArrayList<Athlete> getLanes() {
		return lanes;
	}

	/**
	 * @return the results
	 */
	public ArrayList<Result> getResults() {
		return results;
	}

	/**
	 * @param lanes
	 *            the lanes to set
	 */
	public void setLanes(ArrayList<Athlete> lanes) {
		this.lanes = lanes;
	}

	/**
	 * @param results
	 *            the results to set
	 */
	public void setResults(ArrayList<Result> results) {
		this.results = results;
	}

	@Override
	public void run() {

	}

	public Result getLaneResult(int lane) {
		return results.get(lane);
	}

	public class Result {
		private double value;

		/**
		 * @param value
		 */
		private Result(double value) {
			super();
			this.value = value;
		}

		/**
		 * @return the value
		 */
		public double getValue() {
			return value;
		}

		/**
		 * @param value
		 *            the value to set
		 */
		public void setValue(double value) {
			this.value = value;
		}
	}
}
