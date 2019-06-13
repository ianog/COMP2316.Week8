/**
 * Project: a01043939.lab8
 * File: TestRace.java
 * Date: Jun. 10, 2019
 * Time: 2:45:18 p.m.
 */
package a01043939.lab8.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import a01043939.lab8.data.Athlete;
import a01043939.lab8.data.Race;

/**
 * @author Aaron Schollen, A01043939
 *
 */
class TestRace {

	@Test
	void testRaceConstructor() {
		Race heat1 = new Race();
		HashMap<Integer, Athlete> lanes = new HashMap<>();
		lanes.put(1, new Athlete("Luke", "Skywalker", 1138, "Tatooine", 0.113));
		lanes.put(2, new Athlete("Han", "Solo", 12, "Corellia", 0.110));
		heat1.setLanes(lanes);
		assertEquals("Luke", heat1.getLanes().get(0).getFirstName());
		assertEquals("Solo", heat1.getLanes().get(1).getLastName());
	}

	@Test
	void testRaceResults() {
		Race heat1 = new Race();
		HashMap<Integer, Athlete> lanes = new HashMap<>();
		lanes.put(1, new Athlete("Luke", "Skywalker", 1138, "Tatooine", 0.113));
		heat1.setLanes(lanes);
		heat1.run();
		assertNotNull(heat1.getResults().get(0));
	}

}
