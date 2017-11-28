import com.skripchenko.labFour.Matrix;
import com.skripchenko.labFour.SearchMinMax;
import org.junit.Test;

import static junit.framework.Assert.*;

public class LabsTest {

    @Test
    public void testApiForMax() throws Exception {
        Matrix myCollection = new Matrix();
        myCollection.setCountLists(3);
        myCollection.setCountElements(4);
        myCollection.createMatrixRandom();
        SearchMinMax searching = new  SearchMinMax();

        int first = searching.getMaximum(myCollection);
        int second = searching.getMaximumWithApi(myCollection);

        assertEquals(first, second);
    }
    @Test
    public void testApiForMin() throws Exception {
        Matrix myCollection = new Matrix();
        myCollection.setCountLists(3);
        myCollection.setCountElements(4);
        myCollection.createMatrixRandom();
        SearchMinMax searching = new  SearchMinMax();

        int first = searching.getMinimum(myCollection);
        int second = searching.getMinimumWithApi(myCollection);

        assertEquals(first, second);
    }

    @Test
    public void notNull() throws Exception {
        Matrix myCollection = new Matrix();
        assertNotNull(myCollection);
    }

}