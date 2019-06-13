/**
 * Project: a01043939.lab8
 * File: Lab8.java
 * Date: Jun. 11, 2019
 * Time: 10:11:21 p.m.
 */
package a01043939;

import a01043939.lab8.data.Athlete;
import a01043939.lab8.data.Race;

/**
 * @author Aaron Schollen, A01043939
 *
 */
public class Lab8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Race race = new Race();
		race.addRunner(new Athlete("Justin", "GATLIN", 3069, "USA", 0.152), 4);

	}

}
