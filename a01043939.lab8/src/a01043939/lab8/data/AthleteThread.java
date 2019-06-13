/**
 * Project: a01043939.lab8
 * File: AthleteThread.java
 * Date: Jun. 11, 2019
 * Time: 9:36:17 p.m.
 */
package a01043939.lab8.data;

/**
 * @author Aaron Schollen, A01043939
 *
 */
public class AthleteThread extends Thread {

	private Athlete athlete;

	public AthleteThread(Athlete athlete, int laneNumber) {
		this.athlete = athlete;
		setName(athlete.getLastName() + "-" + laneNumber);
	}

	@Override
	public void run() {
		athlete.run();
	}

}
