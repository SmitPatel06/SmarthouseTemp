package il.ac.technion.cs.smartcity.smarthouse.sensors.stove;

import org.junit.Assert;
import org.junit.Test;

import il.ac.technion.cs.smartcity.smarthouse.sensors.SensorTest;

/** @author Yarden
 * @since 10.12.16 */
@SuppressWarnings("static-method")
public class StoveSensorTest extends SensorTest {
    @Test public void observationsAreCorrect() {
        Assert.assertArrayEquals(new String[] { "on", "temperature" }, new StoveSensor("1:1:1:1", "iStoves", "2:2:2:2", 80).getObservationsNames());
    }
}
