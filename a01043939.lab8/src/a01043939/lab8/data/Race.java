/**
 * Project: a01043939.lab8
 * File: Race.java
 * Date: Jun. 10, 2019
 * Time: 2:49:00 p.m.
 */
package a01043939.lab8.data;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Aaron Schollen, A01043939
 *
 */
public class Race {

	private HashMap<Integer, Athlete> lanes;
	private ArrayList<Result> results;

	/**
	 * 
	 */
	public Race() {
		lanes = new HashMap<>();
		results = new ArrayList<>();
	}

	/**
	 * @return the lanes
	 */
	public HashMap<Integer, Athlete> getLanes() {
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
	public void setLanes(HashMap<Integer, Athlete> lanes) {
		this.lanes = lanes;
	}

	/**
	 * @param results
	 *            the results to set
	 */
	public void setResults(ArrayList<Result> results) {
		this.results = results;
	}

	/**
	 * 
	 * @param athlete
	 */
	public void addRunner(Athlete athlete, int lane) {
		lanes.put(lane, athlete);
	}

	public void run() {
		Athlete[] race = (Athlete[]) lanes.values().toArray();
		for (int i = 0; i < race.length; i++) {
			if (race[i] != null) {
				AthleteThread athleteThread = new AthleteThread(race[i], i);
				athleteThread.start();
			}
		}
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
