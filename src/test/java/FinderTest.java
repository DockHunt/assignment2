import org.junit.jupiter.api.Test;
import package.Finder;

import static org.junit.jupiter.api.Assertions.*;

class FinderTest {

    @Test
    public void findMaxTestvalid() throws Exception {
        int array[] = {1, 5, -2, 2};
        assertEquals(5, findMax(array));
    }

    @Test
    public void findMaxTestnull() throws Exception {
        int array[] = null;
        assertEquals(null, findMax(array));
    }

    @Test
    public void findMaxTestempty() throws Exception {
        int array[] = {};
        assertEquals(null, findMax(array));
    }

    @Test
    public void findMinTestvalid() throws Exception {
        int array[] = {1, 5, -2, 2};
        assertEquals(-2, findMin(array));
    }

    @Test
    public void findMinTestnull() throws Exception {
        int array[] = null;
        assertEquals(null, findMin(array));
    }

    @Test
    public void findMinTestempty() throws Exception {
        int array[] = {};
        assertEquals(null, findMin(array));
    }
}