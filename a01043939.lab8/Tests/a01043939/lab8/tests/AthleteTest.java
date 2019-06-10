/**
 * Project: a01043939.lab8
 * File: AthleteTest.java
 * Date: Jun. 9, 2019
 * Time: 9:23:46 p.m.
 */
package a01043939.lab8.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import a01043939.lab8.data.Athlete;

/**
 * @author Aaron Schollen, A01043939
 *
 */
class AthleteTest {

	@Test
	void testResult() {
		Athlete runner = new Athlete();
		runner.setResult(1.00);
		assertEquals(1.00, runner.getResult());
	}

}
