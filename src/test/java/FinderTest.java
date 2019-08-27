import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinderTest {

    Finder testFinder = new Finder();
    @Test
    public void findMaxTestvalid() throws Exception {
        int array[] = {1, 5, -2, 2};
        assertEquals(5, testFinder.findMax(array));
    }

    @Test
    public void findMaxTestnull() throws Exception {
        int array[] = null;
        assertEquals(null, testFinder.findMax(array));
    }

    @Test
    public void findMaxTestempty() throws Exception {
        int array[] = {};
        assertEquals(null, testFinder.findMax(array));
    }

    @Test
    public void findMinTestvalid() throws Exception {
        int array[] = {1, 5, -2, 2};
        assertEquals(-2, testFinder.findMin(array));
    }

    @Test
    public void findMinTestnull() throws Exception {
        int array[] = null;
        assertEquals(null, testFinder.findMin(array));
    }

    @Test
    public void findMinTestempty() throws Exception {
        int array[] = {};
        assertEquals(null, testFinder.findMin(array));
    }
}