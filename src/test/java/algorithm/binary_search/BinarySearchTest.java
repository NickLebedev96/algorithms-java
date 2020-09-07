package algorithm.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    public void findNumber() {
        int[] arr = {1, 3, 44, 66, 213, 3213, 53, 55, 13, 123};

        final int rank = BinarySearch.rank(44, arr);

        assertEquals(2, rank);
    }

    @Test
    public void doNotFind() {
        int[] arr = {1, 3, 44, 66, 213, 3213, 53, 55, 13, 123};

        final int rank = BinarySearch.rank(444, arr);

        assertEquals(-1, rank);
    }

}
