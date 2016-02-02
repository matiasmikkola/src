package JUnit;
import org.junit.Assert;

/**
 * Created by matiasmikkola on 1/27/16.
 */

public class JUnitTestingTest {

    @org.junit.Test
    public void testAdd() throws Exception {

        JUnitTesting J1 = new JUnitTesting();
        Assert.assertEquals(5, J1.add(3, 2), 0);

    }

    @org.junit.Test
    public void testAdd1() throws Exception {

        JUnitTesting J2 = new JUnitTesting();
        Assert.assertEquals(10, J2.add(5, 3), 10);
    }

    // nasty path

    @org.junit.Test
    public void testAdd2() throws Exception {

        JUnitTesting J3 = new JUnitTesting();
        Assert.assertEquals(31, J3.add(20, 8), 2);
    }

    // nasty path

    @org.junit.Test
    public void testAdd3() throws Exception {

        JUnitTesting J4 = new JUnitTesting();
        Assert.assertEquals(10, J4.add(20, -11), -1);
    }
}







// javabean that has an attribute (hashmap)
// private HashMap stuff
// method to insert - insertSomething( ) {
// make private hashmap to be public Temporarily.