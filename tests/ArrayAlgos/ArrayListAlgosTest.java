package ArrayAlgos;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListAlgosTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/20ranarr_len20_ran20_norep.csv", numLinesToSkip = 0)

    void bubbleSortTest(String string) {
        ArrayList<Integer> list = TestUtility.CsvStringToIntArray(string);

        assertTrue(TestUtility.isOrdered(ArrayListAlgos.bubbleSort(list)));

    }
    @ParameterizedTest
    @CsvFileSource(resources = "/20ranarr_len20_ran20_norep.csv", numLinesToSkip = 0)
    void mergeSortTest(String string) {
        ArrayList<Integer> list = TestUtility.CsvStringToIntArray(string);

        assertTrue(TestUtility.isOrdered(ArrayListAlgos.mergeSort(list)));

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/20ranarr_len20_ran20_norep.csv", numLinesToSkip = 0)
    void insertionSortTest(String string) {
        ArrayList<Integer> list = TestUtility.CsvStringToIntArray(string);

        assertTrue(TestUtility.isOrdered(ArrayListAlgos.insertionSort(list)));

    }




}