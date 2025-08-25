package ArrayAlgos;

import java.util.ArrayList;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;






public class VerificationTest {




    @ParameterizedTest
    @CsvFileSource(resources = "/20ordarr_lenran_ranran_norep.csv", numLinesToSkip = 0)
    void testIsSorted_sortedValues_expectTrue(String strList) {

        ArrayList<Integer> list = TestUtility.CsvStringToIntArray(strList);

        assertTrue(TestUtility.isOrdered(list));

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/20ranarr_len20_ran20_norep.csv", numLinesToSkip = 0)
    void testIsSorted_unsortedValues_expectFalse(String strList) {

        ArrayList<Integer> list = TestUtility.CsvStringToIntArray(strList);

        assertFalse(TestUtility.isOrdered(list));

    }

}
